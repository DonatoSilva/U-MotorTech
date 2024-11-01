package controller;

import dao.UserDAO;
import igu.ViewNewSignUp;
import igu.ViewUsers;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import motortech.MotorTech;
import motortech.User;
import motortech.Views;

public final class UsersController {

    private ViewUsers view;
    private UserDAO model;

    private JFrame callerView;

    public UsersController() {
    }

    public UsersController(ViewUsers view, UserDAO model, JFrame callerView) {
        this.view = view;
        this.model = model;
        this.callerView = callerView;

        initView();
    }

    private void initView() {
        insetDataTable(true);

        view.setUsersController(this);
        Views.openWindows(view, callerView);
    }

    private void insetDataTable(boolean a) {
        if (a) {
            List<User> users = model.getAllUsers();
            for (User user : users) {
                view.addRow(new Object[]{user.getNombresApellidos(), user.getUsuario(), user.getCorreoElectronico(), user.getTelefono()});
            }
        }
    }

    public void resetTable(boolean a) {
        view.resetTable();
        this.insetDataTable(a);
    }

    public void searchUsersByPhone(String telefono) {
        this.resetTable(false);

        List<User> users = model.getUsers(telefono);
        for (User user : users) {
            view.addRow(new Object[]{user.getNombresApellidos(), user.getUsuario(), user.getCorreoElectronico(), user.getTelefono()});
        }
    }

    public void btnHomeMouseClicked() {
        Views.openWindows(callerView, view);
    }

    public void setEnabledTable(boolean a) {
        view.setEnabledTable(a);
    }

    public void tableUserMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            this.setEnabledTable(false);

            JTable table = (JTable) evt.getSource();
            int row = table.getSelectedRow();
            Object telefono = table.getValueAt(row, 3);

            int opcion = JOptionPane.showOptionDialog(
                    view,
                    "¿Seleccione lo que desea hacaer con este usuario?",
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
                User user = model.getUser(telefono.toString());

                new SignUpController(new ViewNewSignUp(true, true, user), model, view);
                return;
            }

            if (opcion == 1) {
                int deleteModal = JOptionPane.showOptionDialog(
                        view,
                        "¿Seguro que desea eliminar este usuario?",
                        "MotorTech - Usuario",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        new String[]{"Cancelar", "Eliminar"},
                        "Cancelar"
                );

                if (deleteModal == 1) {
                    boolean isDelete = model.deleteUser(telefono.toString());

                    if (!isDelete) {
                        JOptionPane.showMessageDialog(view, "No se logro eliminar al usuario con numero " + telefono);
                        return;
                    }

                    view.removeRow(row);
                }
            }

            this.setEnabledTable(true);
        }
    }

    public void btnOutSesionMouseClicked(java.awt.event.MouseEvent evt) {
        MotorTech motortech = new MotorTech();
        motortech.btnOutSesionMouseClicked(view, evt);
    }
}
