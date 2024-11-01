package controller;

import dao.AutomobileDAO;
import igu.ViewNewAutomobile;
import igu.ViewOwner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import motortech.Automobile;
import motortech.Views;

public class AutomobileController {

    private ViewNewAutomobile view;
    private AutomobileDAO model;
    private JFrame callerView;
    
    private String placa = "";
    private String tipo = "";
    private String TNumber = "";
    private int IdCard = 0;

    public AutomobileController(ViewNewAutomobile view, AutomobileDAO model, JFrame callerView) {
        this.view = view;
        this.model = model;
        this.callerView = callerView;

        init();
    }

    public AutomobileController(ViewNewAutomobile view, AutomobileDAO model, JFrame callerView, Automobile automobile) {
        this.view = view;
        this.model = model;
        this.callerView = callerView;

        this.IdCard = automobile.getPropietarioID();
        this.tipo = automobile.getTipoVehiculo();
        this.TNumber = automobile.getTarjetaPropiedad();
        this.placa = automobile.getPlaca();
        
        init();
    }

    private void init() {
        if (IdCard != 0) {
            view.setTxtInputIdOwner(String.valueOf(IdCard));
            view.hideIdCard(IdCard);
        }

        view.setAutomobileController(this);
        Views.openWindows(view);
        setData();
    }

    private void setData() {
        boolean isEdit = view.getIsEdit();

        if (isEdit) {
            view.setTitleWindows("Editar Automobile");
            view.setTxtInputPlate(this.placa);
            view.setTxtTInputNumber(this.TNumber);
            view.setSelectRadioButton(this.tipo);
            view.setlblAction("Guardar");
        }
    }

    public void Action() {
        if(view.getIsEdit()){
            this.UpdateAutomobile();
            return;
        }
        
        this.CreateAutomobile();
    }

    private void CreateAutomobile() {
        Automobile automobile = new Automobile();

        automobile.setPlaca(view.getTxtInputPlate());
        automobile.setTarjetaPropiedad(view.getTxtTInputNumber());
        automobile.setPropietarioID(view.getTxtInputIdOwner());
        automobile.setTipoVehiculo(view.getSelectRadioButton());

        boolean isCreate = model.createAutomobile(automobile);

        if (isCreate) {
            JOptionPane.showMessageDialog(view, "Automovil creado " + automobile.getPlaca());
            this.CloseApp();
            return;
        }

        JOptionPane.showMessageDialog(view, "Error al intentar crear el Automovil");
        this.CloseApp();
    }

    private void UpdateAutomobile() {
        Automobile automobile = new Automobile();

        automobile.setPlaca(view.getTxtInputPlate());
        automobile.setTarjetaPropiedad(view.getTxtTInputNumber());
        automobile.setPropietarioID(view.getTxtInputIdOwner());
        automobile.setTipoVehiculo(view.getSelectRadioButton());

        boolean isCreate = model.updateAutomobile(automobile);

        if (isCreate) {
            JOptionPane.showMessageDialog(view, "Automovil editado " + automobile.getPlaca());
            this.CloseApp();
            return;
        }

        JOptionPane.showMessageDialog(view, "Error al intentar editar el Automovil");
        this.CloseApp();
    }

    public void CloseApp() {
        if (callerView instanceof ViewOwner){
            ViewOwner viewOwner = (ViewOwner) callerView;
            OwnerController ownerController = viewOwner.getOwnerController();
            ownerController.resetTable();
        }
        
        view.dispose();
    }
}
