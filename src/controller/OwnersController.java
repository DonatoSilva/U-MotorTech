package controller;

import dao.OwnerDAO;
import igu.ViewNewOwner;
import igu.ViewOwner;
import igu.ViewOwners;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import motortech.Owner;
import motortech.Views;

public class OwnersController {

    private ViewOwners view;
    private OwnerDAO model;
    private JFrame callerView;

    public OwnersController() {
    }

    public OwnersController(ViewOwners view, OwnerDAO model, JFrame callerView) {
        this.view = view;
        this.model = model;
        this.callerView = callerView;

        init();
    }

    private void init() {
        insertDataTable(true);

        view.setOwnersController(this);
        Views.openWindows(view, callerView);
    }

    public void insertDataTable(boolean a) {
        if (a) {
            List<Owner> Owners = model.getAllOwners();
            this.addRow(Owners);
        }
    }

    public void resetTable(boolean a) {
        view.resetTable();
        this.insertDataTable(a);
    }

    private void addRow(List<Owner> owners) {
        for (Owner owner : owners) {
            view.addRow(new Object[]{owner.getCedula(), owner.getNombresApellidos(), owner.getCorreoElectronico(), owner.getTelefono()});
        }
    }

    public void searchOwnersByCedula(int cedula) {
        this.resetTable(false);

        List<Owner> owners = model.getOwners(cedula);
        addRow(owners);
    }

    public void tableOwners(JTable table) {
        int row = table.getSelectedRow();
        Object cedulaObj = table.getValueAt(row, 0);
        int cedula = Integer.parseInt(cedulaObj.toString());

        int opcion = JOptionPane.showOptionDialog(
                view,
                "¿Seleccione lo que desea hacaer con este Propietario?",
                "MotorTech - Propietario",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new String[]{"Cancelar", "Eliminar", "Editar", "Ver"},
                "Cancelar"
        );

        if (opcion == 0) {
            return;
        }

        if (opcion == 2) {
            this.EditOwner(cedula);
            return;
        }

        if (opcion == 1) {
            int deleteModal = JOptionPane.showOptionDialog(
                    view,
                    "¿Seguro que desea eliminar este propietario?",
                    "MotorTech - Propietario",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    new String[]{"Cancelar", "Eliminar"},
                    "Cancelar"
            );

            if (deleteModal == 1) {
                boolean isDelete = model.deleteOwner(cedula);

                if (!isDelete) {
                    JOptionPane.showMessageDialog(view, "No se logro eliminar al propietario con la cédula " + cedula);
                    return;
                }
                
                JOptionPane.showMessageDialog(view, "Se logro eliminar al propietario con la cédula " + cedula);
                view.removeRow(row);
            }
        }

        if (opcion == 3) {
            this.ViewOwner(cedula);
        }

        this.setEnabledTable(true);
    }

    public void setEnabledTable(boolean a) {
        view.setEnabledTable(a);
    }

    public void OpenHome() {
        Views.openWindows(callerView, view);
    }
    
    private void ViewOwner(int cedula) {
        Owner owner = model.getOwner(cedula);
        new OwnerController(new ViewOwner(), model, view, owner);
    }

    public void NewOwner() {
        new NewOwnerController(new ViewNewOwner(), model, view);
    }

    private void EditOwner(int cedula) {
        Owner owner = model.getOwner(cedula);
        new NewOwnerController(new ViewNewOwner(owner), model, view);
    }
}
