package controller;

import dao.OwnerDAO;
import igu.ViewNewAutomobile;
import igu.ViewNewOwner;
import igu.ViewOwner;
import igu.ViewOwners;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import motortech.Owner;
import motortech.Views;

public class OwnerController {

    private ViewOwner view;
    private OwnerDAO model;
    public JFrame callerView;
    private Owner owner;

    public OwnerController(ViewOwner view, OwnerDAO model, JFrame callerView, Owner owner) {
        this.view = view;
        this.model = model;
        this.callerView = callerView;
        this.owner = owner;

        init();
    }

    private void init() {
        view.setOwnerController(this);
        Views.openWindows(view, callerView);
        setData();
    }
    
    public void setData(int IdCard) {
        Owner ownerUpdated = model.getOwner(IdCard);
        
        view.setTxtName(ownerUpdated.getNombresApellidos());
        view.setIdCard(Integer.toString(ownerUpdated.getCedula()));
        view.setTxtAddres(ownerUpdated.getCorreoElectronico());
        view.setTxtCell(ownerUpdated.getTelefono());
        view.setTxtEmail(ownerUpdated.getCorreoElectronico());
    }

    private void setData() {
        view.setTxtName(owner.getNombresApellidos());
        view.setIdCard(Integer.toString(owner.getCedula()));
        view.setTxtAddres(owner.getCorreoElectronico());
        view.setTxtCell(owner.getTelefono());
        view.setTxtEmail(owner.getCorreoElectronico());
    }

    public void EditOwner() {
        Owner owner = model.getOwner(view.getIdCard());
        new NewOwnerController(new ViewNewOwner(owner), model, view);
    }

    public void DeleteOwner() {
        boolean isDelete = model.deleteOwner(owner.getCedula());

        if (!isDelete) {
            JOptionPane.showMessageDialog(view, "No se logro eliminar al propietario con la cédula " + view.getIdCard());
        } else {
            JOptionPane.showMessageDialog(view, "Se logro eliminar al propietario con la cédula " + view.getIdCard());
        }

        this.CloseView();
    }

    public void PrevView() {
        int opcion = JOptionPane.showOptionDialog(
                view,
                "¿Seguro que desea volver?",
                "MotorTech - nuevo propietario",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new String[]{"Cancelar", "Si, seguro"},
                "Cancelar"
        );

        if (opcion == 1) {
            this.CloseView();
        }
    }

    public void tableAutos() {
        int opcion = JOptionPane.showOptionDialog(
                view,
                "¿Seleccione lo que desea hacaer con este Auto?",
                "MotorTech - Usuario",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new String[]{"Cancelar", "Eliminar", "Editar"},
                "Cancelar"
        );

        if (opcion == 0) {
            return;
        }

        if (opcion == 2) {
            ViewNewAutomobile automobile = new ViewNewAutomobile(true);
            Views.openWindows(automobile);
            return;
        }

        if (opcion == 1) {
            int deleteModal = JOptionPane.showOptionDialog(
                    view,
                    "¿Seguro que desea eliminar este Auto?",
                    "MotorTech - Usuario",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    new String[]{"Cancelar", "Eliminar"},
                    "Cancelar"
            );

            if (deleteModal == 0) {
                return;
            }
        }

        return;
    }

    public void CloseView() {
        ViewOwners viewOwners = (ViewOwners) callerView;
        OwnersController ownersController = viewOwners.getOwnersController();
        ownersController.resetTable(true);
        ownersController.setEnabledTable(true);
        callerView.setVisible(true);
        view.dispose();
    }
}
