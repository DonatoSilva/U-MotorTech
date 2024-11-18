package controller;

import dao.AutomobileDAO;
import dao.OwnerDAO;
import dao.WorkDAO;
import igu.Home;
import igu.ViewNewAutomobile;
import igu.ViewNewOwner;
import igu.ViewNewWork;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import motortech.Automobile;
import motortech.Owner;
import motortech.Views;
import motortech.Work;

public class NewWorkController {

    private ViewNewWork view;
    private WorkDAO model;
    private JFrame callerView;

    public NewWorkController(ViewNewWork view, WorkDAO model, JFrame callerView) {
        this.callerView = callerView;
        this.model = model;
        this.view = view;

        init();
    }

    private void init() {
        Views.openWindows(view, callerView);
        view.setNewWorkController(this);

        if (view.getWork() != null) {

            int ownerId = view.getWork().getPropietarioID();
            String autoId = view.getWork().getVehiculoPlaca();

            OwnerDAO ownerDAO = new OwnerDAO();
            Owner owner = ownerDAO.getOwner(ownerId);

            AutomobileDAO automobileDAO = new AutomobileDAO();
            Automobile automobile = automobileDAO.getAutomobile(autoId);

            setDataOwner(owner);
            setDataAuto(automobile);
            setRaesonWork();
            setStatusAuto();
        }
    }

    public void Prev() {
        if (callerView == null) {
            new HomeController(new Home(), model, view);

            return;
        }

        Views.openWindows(callerView, view);
    }

    public void Action() {
        if (view.getWork() == null) {
            this.Create();
            return;
        }

        this.Update();
    }

    public void SearchOwner() {
        String cedula = view.getCedula();

        if (cedula.isEmpty()) {
            JOptionPane.showMessageDialog(view, "No se puede tener la cedula vacia");
        }

        OwnerDAO ownerDAO = new OwnerDAO();
        Owner owner = ownerDAO.getOwner(Integer.parseInt(cedula));

        if (owner.getNombresApellidos() == null) {
            JOptionPane.showMessageDialog(view, "No se encontro ningun propietario con la cedula: " + cedula);
            this.resetDataOwner();
            return;
        }

        this.setDataOwner(owner);
    }

    public void SearchAuto() {
        String placa = view.getInputPlaca();

        if (placa.isEmpty()) {
            JOptionPane.showMessageDialog(view, "No se puede tener la placa vacia");
        }

        AutomobileDAO automobileDAO = new AutomobileDAO();
        Automobile automobile = automobileDAO.getAutomobile(placa);

        if (automobile.getPlaca() == null) {
            JOptionPane.showMessageDialog(view, "No se encontro ningun Vehiculo con la placa: " + placa);
            this.resetDataAuto();
            return;
        }

        this.setDataAuto(automobile);
    }

    private void resetDataOwner() {
        view.setInputCedula("");
        view.setTextNameOwner("---------- -----");
        view.setTextIdCardOwner("----------");
        view.setTextCellOwner("---------");
        view.setTextEmailOwner("-----------");
        view.setTextAddresOwner("---------");
    }

    private void setDataOwner(Owner owner) {
        view.setInputCedula("");
        view.setTextNameOwner(owner.getNombresApellidos());
        view.setTextCellOwner(owner.getTelefono());
        view.setTextIdCardOwner(Integer.toString(owner.getCedula()));
        view.setTextEmailOwner(owner.getCorreoElectronico());
        view.setTextAddresOwner(owner.getDireccion());
    }

    private void resetDataAuto() {
        view.setInputPlaca("");
        view.setTextPlaca("-----------------");
        view.setTextTNumber("----------------");
        view.setTextType("--------------");
    }

    private void setDataAuto(Automobile auto) {
        view.setInputPlaca("");
        view.setTextPlaca(auto.getPlaca());
        view.setTextTNumber(auto.getTarjetaPropiedad());
        view.setTextType(auto.getTipoVehiculo());
    }

    private void setRaesonWork() {
        Work work = view.getWork();
        String[] listRaeson = work.getMotivoIngreso().split(", ");
        List<String> raeson = Arrays.asList(listRaeson);

        view.setSelectCheckBox(raeson);
    }

    private void setStatusAuto() {
        view.setTypeSelect(view.getWork().getEstadoVehiculo());
    }

    public void NewAutomobile() {
        new AutomobileController(new ViewNewAutomobile(false), new AutomobileDAO(), view);
    }

    public void NewOwner() {
        new NewOwnerController(new ViewNewOwner(), new OwnerDAO(), view);
    }

    private void Create() {
        Work work = new Work();
        work.setCostoManoObra(0);
        work.setCostoRepuestos(0);
        work.setHorasTrabajo(0);
        work.setPropietarioID(view.getIdCard());
        work.setVehiculoPlaca(view.getTextPlaca());
        work.setEstadoVehiculo(view.getTypeSelect());
        work.setMotivoIngreso(view.getSelectCheckBox());
        work.setEstadoServicio("En taller");

        boolean isCreate = model.createWork(work);

        if (isCreate) {
            JOptionPane.showMessageDialog(view, "Se creo correctamente el servicio");
            this.CloseApp();
            return;
        }

        JOptionPane.showMessageDialog(view, "Error al crear el servicio");
    }

    private void Update() {
        Work work = new Work();
        work.setCostoManoObra(0);
        work.setCostoRepuestos(0);
        work.setHorasTrabajo(0);
        work.setPropietarioID(view.getIdCard());
        work.setVehiculoPlaca(view.getTextPlaca());
        work.setEstadoVehiculo(view.getTypeSelect());
        work.setMotivoIngreso(view.getSelectCheckBox());
        work.setEstadoServicio("En taller");

        boolean isCreate = model.updateWork(work);

        if (isCreate) {
            JOptionPane.showMessageDialog(view, "Se actualizo correctamente el servicio");
            this.CloseApp();
            return;
        }

        JOptionPane.showMessageDialog(view, "Error al actualizar el servicio");
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
