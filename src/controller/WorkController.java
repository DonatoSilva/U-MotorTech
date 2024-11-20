package controller;

import dao.AutomobileDAO;
import dao.OwnerDAO;
import dao.WorkDAO;
import igu.Home;
import igu.ViewNewWork;
import igu.ViewWork;
import java.awt.GridLayout;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import motortech.Automobile;
import motortech.Owner;
import motortech.Views;
import motortech.Work;

public class WorkController {

    private ViewWork view;
    private WorkDAO model;
    private JFrame callerView;

    private Work work;

    public WorkController(ViewWork view, WorkDAO model, JFrame callerView, Work work) {
        this.view = view;
        this.model = model;
        this.callerView = callerView;

        this.work = work;
        init();
    }

    private void init() {
        view.setWorkController(this);
        Views.openWindows(view, callerView);
        
        if(this.work.getEstadoServicio().equals("Terminado")){
            view.btnFinalEnable(false);
        }
        
        this.resetDataView();
    }

    public void Prev() {
        if (callerView == null) {
            new HomeController(new Home(), model, view);
            return;
        }

        Views.openWindows(callerView, view);
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public void resetDataView() {
        ///owner
        OwnerDAO ownerDAO = new OwnerDAO();
        Owner owner = ownerDAO.getOwner(this.work.getPropietarioID());
        
        String name = owner.getNombresApellidos();
        int idCard = owner.getCedula();
        String cell = owner.getTelefono();
        String addres = owner.getDireccion();
        String email = owner.getCorreoElectronico();
        
        view.setTextName(name);
        view.setTextIdCard(String.valueOf(idCard));
        view.setTextAddres(addres);
        view.setTextCell(cell);
        view.setTextEmail(email);
        
        //automobile
        AutomobileDAO automobileDAO = new AutomobileDAO();
        Automobile automobile = automobileDAO.getAutomobile(work.getVehiculoPlaca());
        
        String placa = automobile.getPlaca();
        String type = automobile.getTipoVehiculo();
        String TNumber = automobile.getTarjetaPropiedad();
        
        view.setTextPlaca(placa);
        view.setTextType(type);
        view.setTextTnumber(TNumber);
        
        //work
        String ID = String.valueOf(this.work.getIdServicio());
        String inDate = this.work.getFechaIngreso().toString();
        String outDate = "0000-00-00 00:00:00";
        
        if(this.work.getFechaEntrega() != null){
            outDate = this.work.getFechaEntrega().toString();
        }        
        
        String stateAuto = this.work.getEstadoVehiculo();
        String stateWork = this.work.getEstadoServicio();
        String reason = this.work.getMotivoIngreso();
        String hours = String.valueOf(this.work.getHorasTrabajo());
        String handCost = String.valueOf(this.work.getCostoManoObra());
        String spareParts = String.valueOf(this.work.getCostoRepuestos());
        String total = String.valueOf(this.calculateTotalCost());
        
        view.setTextID(ID);
        view.setTextInDate(inDate);
        view.setTextOutDate(outDate);
        view.setTextStatus(stateWork);
        view.setTextStateAuto(stateAuto);
        view.setTextReason(reason);
        view.setTextHours(hours);
        view.setTextHandCost(handCost);
        view.setTextSpareParts(spareParts);
        view.setTextTotal(total);
    }

    private int calculateHandCost() {
        AutomobileDAO automobileDAO = new AutomobileDAO();
        Automobile automobile = automobileDAO.getAutomobile(this.work.getVehiculoPlaca());
        String typeAuto = automobile.getTipoVehiculo();

        int handCost;

        if (typeAuto.equals("Automóvil")) {
            handCost = 20000;
        } else {
            handCost = 30000;
        }

        int hours = work.getHorasTrabajo();

        return hours * handCost;
    }
    
    private double calculateTotalCost(){
        return this.work.getCostoManoObra() + this.work.getCostoRepuestos();
    }

    public void editWork() {
        int id = work.getIdServicio();
        Work work = model.getWork(id);

        if (work.getIdServicio() == 0) {
            JOptionPane.showMessageDialog(view, "No se logro encontrar el servicio a editar: " + id);
        }

        new NewWorkController(new ViewNewWork(work), model, view);
    }

    public void hours() {
        int number = this.InputDialog("Ingrese las horas", "Horas de trabajo");
        int idServicio = this.work.getIdServicio();

        if (number == -1) {
            return;
        }

        boolean isUpdate = model.updateHoursWork(number, idServicio);

        if (!isUpdate) {
            JOptionPane.showMessageDialog(view, "Error al actualiza las horas trabajados", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        this.work.setHorasTrabajo(number);
        
        int cost = this.calculateHandCost();
        model.updateHandCostWork(cost, idServicio);
        this.work.setHorasTrabajo(number);
        this.work.setCostoManoObra(cost);
        
        view.setTextHours(Integer.toString(this.work.getHorasTrabajo()));
        view.setTextHandCost(Integer.toString(cost));
        view.setTextTotal(String.valueOf(this.calculateTotalCost()));
    }

    public void spareParts() {
        int number = this.InputDialog("Ingrese el costo", "Valor de los repuestos");
        int idServicio = this.work.getIdServicio();

        if (number == -1) {
            return;
        }
        
        boolean isUpdate = model.updateSparePartsWork(number, idServicio);
        
        if (!isUpdate) {
            JOptionPane.showMessageDialog(view, "Error al actualiza el valor de los repuestos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        this.work.setCostoRepuestos(number);
        view.setTextSpareParts(Integer.toString(number));
        view.setTextTotal(String.valueOf(this.calculateTotalCost()));
    }
    
    public void stateFinal(){
        int idServicio = this.work.getIdServicio();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        LocalDateTime nowDate = LocalDateTime.now();
        String nowState = "Terminado";
        
        boolean isUpdate = model.updateDateAndStateWork(nowDate, nowState, idServicio);
        
        if(!isUpdate){
            JOptionPane.showMessageDialog(view, "Error al actualiza el estado del servicio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String formattedDate = nowDate.format(formatter);
        
        this.work.setFechaEntrega(Timestamp.valueOf(formattedDate));
        this.work.setEstadoServicio(nowState);
        view.setTextOutDate(formattedDate);
        view.setTextStatus(nowState);
        view.btnFinalEnable(!isUpdate);
    }

    private int InputDialog(String labelString, String title) {
        JPanel panel = new JPanel(new GridLayout(0, 1));
        JLabel label = new JLabel(labelString);
        JTextField textField = new JTextField(10);
        panel.add(label);
        panel.add(textField);

        String[] options = {"Aceptar", "Cancelar"};

        int option = JOptionPane.showOptionDialog(view, panel, title, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (option == JOptionPane.YES_OPTION) {
            String input = textField.getText();
            try {
                int number = Integer.parseInt(input);
                
                return number;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(view, "Por favor, ingrese un número valido.", "Error", JOptionPane.ERROR_MESSAGE);
                this.InputDialog(labelString, title);
            }
        }

        return -1;
    }

    public void delete() {
        int id = work.getIdServicio();

        int deletemodel = JOptionPane.showOptionDialog(
                view,
                "¿Seguro que desea eliminar este servicio?",
                "MotorTech - Usuario",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new String[]{"Cancelar", "Eliminar"},
                "Cancelar"
        );

        if (deletemodel == 1) {
            boolean isDelete = model.deleteWork(id);

            if (!isDelete) {
                JOptionPane.showMessageDialog(view, "No se logro eliminar el servicio con id: " + id);
                return;
            }

            this.CloseApp();
        }
    }

    public void CloseApp() {
        if (callerView instanceof Home) {
            Home home = (Home) callerView;
            HomeController homeController = home.getHomeController();
            homeController.resetDataTable(true);
            Views.openWindows(callerView, view);
        }
    }
}
