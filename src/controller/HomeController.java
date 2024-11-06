package controller;

import dao.OwnerDAO;
import dao.UserDAO;
import dao.WorkDAO;
import igu.Home;
import igu.ViewLogin;
import igu.ViewNewWork;
import igu.ViewOwners;
import igu.ViewUsers;
import igu.ViewWork;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import motortech.Owner;
import motortech.Views;
import motortech.Work;

public class HomeController {

    private Home view;
    private WorkDAO model;
    private JFrame callerView;

    public HomeController() {
    }

    public HomeController(Home view, WorkDAO model, JFrame callerView) {
        this.view = view;
        this.model = model;
        this.callerView = callerView;

        init();
    }

    private void init() {
        view.setHomeController(this);
        this.insertDataTable(true);
        Views.openWindows(view, callerView);
    }

    public void insertDataTable(boolean a) {
        if (a) {
            List<Work> works = model.getAllWorks(view.getStatus());

            for (Work work : works) {
                Owner owner = new OwnerDAO().getOwner(work.getPropietarioID());

                view.addRow(new Object[]{work.getIdServicio(), owner.getNombresApellidos(), work.getVehiculoPlaca(), work.getEstadoVehiculo()});
            }
        }
    }

    public void resetDataTable(boolean a) {
        view.resetTable();
        this.insertDataTable(a);
    }

    public void searchWork(String placa, String estado) {
        resetDataTable(false);
        List<Work> works = model.getWorksByPlaca(placa, estado);
        for (Work work : works) {
            Owner owner = new OwnerDAO().getOwner(work.getPropietarioID());
            view.addRow(new Object[]{work.getIdServicio(), owner.getNombresApellidos(), work.getVehiculoPlaca(), work.getEstadoVehiculo()});
        }
    }

    public void tableWorks(java.awt.event.MouseEvent evt) {
        JTable table = (JTable) evt.getSource();
        int row = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(row, 0).toString());

        int opcion = JOptionPane.showOptionDialog(
                view,
                "¿Seleccione lo que desea hacaer con este servicio?",
                "MotorTech - Servicios",
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
            Work work = model.getWork(id);

            new NewWorkController(new ViewNewWork(work), model, view);
            return;
        }

        if (opcion == 3) {
            Work work = model.getWork(id);

            new WorkController(new ViewWork(), model, view, work);
            return;
        }

        if (opcion == 1) {
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

                view.removeRow(row);
            }
        }
        
        view.setVisible(true);
    }

    public void NewWork() {
        new NewWorkController(new ViewNewWork(), model, view);
    }

    public void login() {
        new LoginController(new ViewLogin(), new UserDAO(), view);
    }

    public void users() {
        new UsersController(new ViewUsers(), new UserDAO(), view);
    }

    public void owners() {
        new OwnersController(new ViewOwners(), new OwnerDAO(), view);
    }
}
