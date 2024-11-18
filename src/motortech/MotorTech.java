package motortech;

import controller.LoginController;
import dao.UserDAO;
import database.MyConnection;
import igu.ViewLogin;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MotorTech {

    private String status;
    private static String DATABASE = "MotorTechDB";

    public static void main() {
    }

    public static void main(String[] args) {
        if (MyConnection.setupDatabase(DATABASE)) {
            if (MyConnection.setupTables(DATABASE)) {
                new LoginController(new ViewLogin(), new UserDAO());
            }
        }
    }
    
    public void btnOutSesionMouseClicked(JFrame view, java.awt.event.MouseEvent evt) {                                          
        ViewLogin login = new ViewLogin();

        int opcion = JOptionPane.showOptionDialog(
                view,
                "¿Esta seguro que desea cerrar sesión?",
                "MotorTech - Inicio",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new String[]{"Cerrar sesión", "Cancelar"},
                "Cancelar"
        );

        if (opcion == 1) {
            return;
        }
        
        new LoginController(login, new UserDAO());
        view.dispose();
    }

    /// App status
    public void setStatusTable(String newValue) {
        status = newValue;
    }

    public String getStatusTable() {
        return status;
    }

    /// App colors
    public static Color getBgPrimary() {
        return new Color(0, 153, 153);
    }

    public static Color getBgPrimarySelect() {
        return new Color(25, 173, 163);
    }

    public static Color getBgGrey() {
        return new Color(204, 204, 204);
    }

    public static Color getbgRed() {
        return new Color(255, 153, 153);
    }

    public static Color getbgRedSelect() {
        return new Color(255, 102, 102);
    }
}
