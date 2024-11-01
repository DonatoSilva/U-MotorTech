package controller;

import dao.AutomobileDAO;
import dao.OwnerDAO;
import igu.ViewNewAutomobile;
import igu.ViewNewOwner;
import igu.ViewOwner;
import igu.ViewOwners;
import java.util.HashSet;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import motortech.Automobile;
import motortech.Owner;
import motortech.Views;

public class OwnerController {

    private ViewOwner view;
    private OwnerDAO model;
    public JFrame callerView;
    private Owner owner;
    private AutomobileDAO automobileDAO = new AutomobileDAO();

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
        this.setData();
        this.insertDataTable();
    }

    public void setData(int IdCard) {
        Owner ownerUpdated = model.getOwner(IdCard);

        view.setTxtName(ownerUpdated.getNombresApellidos());
        view.setIdCard(Integer.toString(ownerUpdated.getCedula()));
        view.setTxtAddres(ownerUpdated.getDireccion());
        view.setTxtCell(ownerUpdated.getTelefono());
        view.setTxtEmail(ownerUpdated.getCorreoElectronico());
    }

    private void setData() {
        view.setTxtName(owner.getNombresApellidos());
        view.setIdCard(Integer.toString(owner.getCedula()));
        view.setTxtAddres(owner.getDireccion());
        view.setTxtCell(owner.getTelefono());
        view.setTxtEmail(owner.getCorreoElectronico());
    }

    public void EditOwner() {
        Owner owner = model.getOwner(view.getIdCard());
        new NewOwnerController(new ViewNewOwner(owner), model, view);
    }

    public void DeleteOwner() {
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
            int deleteAutos = JOptionPane.showOptionDialog(
                    view,
                    "Esta acción eliminara todos los vehiculos asociados a este propietario",
                    "MotorTech - Propietario",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    new Object[]{"Sí", "No"},
                    "Sí"
            );

            if (deleteAutos == JOptionPane.YES_OPTION) {
                boolean isAutosDelete = automobileDAO.deleteAutomobiles(view.getIdCard());

                if (!isAutosDelete) {
                    JOptionPane.showMessageDialog(view, "Algo salio mal al intentar eliminar los vehiculos asociados al propietario: " + view.getIdCard());
                    return;
                }

                boolean isDelete = model.deleteOwner(owner.getCedula());

                if (!isDelete) {
                    JOptionPane.showMessageDialog(view, "No se logro eliminar al propietario con la cédula " + view.getIdCard());
                } else {
                    JOptionPane.showMessageDialog(view, "Se logro eliminar al propietario con la cédula " + view.getIdCard());
                }

                this.CloseView();
            }
        }
    }

    private void insertDataTable() {
        List<Automobile> automobiles = automobileDAO.getAllAutomobiles(view.getIdCard());

        for (Automobile automobile : automobiles) {
            view.addRow(new Object[]{automobile.getPlaca(), automobile.getTipoVehiculo(), automobile.getTarjetaPropiedad()});
        }
    }

    public void resetTable() {
        view.resetTableAuto();
        this.insertDataTable();
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

    public void tableAutos(String placa, String tipo, String TNumber, int row) {
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
            Automobile automobile = new Automobile();
            automobile.setPlaca(placa);
            automobile.setPropietarioID(view.getIdCard());
            automobile.setTipoVehiculo(tipo);
            automobile.setTarjetaPropiedad(TNumber);

            new AutomobileController(new ViewNewAutomobile(true), automobileDAO, view, automobile);
        }

        if (opcion == 1) {
            boolean isDelete = false;
            int deleteModal = JOptionPane.showOptionDialog(
                    view,
                    "¿Seguro que desea eliminar este Auto?",
                    "MotorTech - Propietario",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    new String[]{"Cancelar", "Eliminar"},
                    "Cancelar"
            );

            if (deleteModal == 1) {
                isDelete = automobileDAO.deleteAutomobile(placa);
            }

            if (isDelete) {
                JOptionPane.showMessageDialog(view, "Vehiculo eliminado con exito, placa: " + placa);
                view.removeRow(row);

                return;
            }

            if (!isDelete && deleteModal == 1) {
                JOptionPane.showMessageDialog(view, "Error al eliminar vehiculo, placa: " + placa);
            }
        }
    }

    public void NewAuto(int IdCard) {
        new AutomobileController(new ViewNewAutomobile(false), automobileDAO, view, new Automobile("", "", "", IdCard));
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
