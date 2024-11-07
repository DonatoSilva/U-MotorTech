package controller;

import dao.UserDAO;
import dao.WorkDAO;
import igu.Home;
import igu.ViewLogin;
import igu.ViewNewSignUp;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import motortech.Inputs;
import motortech.Views;

public class LoginController {

    ViewLogin view;
    UserDAO modal;
    JFrame callerView = null;

    public LoginController() {
    }

    public LoginController(ViewLogin view, UserDAO modal) {
        this.view = view;
        this.modal = modal;

        init();
    }

    public LoginController(ViewLogin view, UserDAO modal, JFrame callerView) {
        this.view = view;
        this.modal = modal;
        this.callerView = callerView;

        init();
    }

    private void init() {
        view.setLoginController(this);
        if (this.callerView == null) {
            Views.openWindows(view);
        } else {
            Views.openWindows(view, callerView);
        }
    }

    private boolean validateInputs(JTextField user, String txtUserDefault, JPasswordField password, String txtPassDeafult) {
        String currentTextPass = String.valueOf(password.getPassword());
        String currentTextUser = user.getText();

        String title = "MotorTech - Inicio de Sesión";

        if (currentTextPass.equals(txtPassDeafult)) {
            Inputs.dialogMessageDialog(view, password, title, "La contraseña no puede estar vacía");
            return false;
        }

        if (currentTextUser.equals(txtUserDefault)) {
            Inputs.dialogMessageDialog(view, user, title, "El usuario no puede estar vacío");
            return false;
        }

        

        return true;
    }

    public void home(JTextField user, String txtUserDefault, JPasswordField password, String txtPassDeafult) {
        if (validateInputs(user, txtUserDefault, password, txtPassDeafult)) {
            String currentUser = user.getText().trim();
            String currectPass = String.valueOf(password.getPassword());
            int result = modal.verifyUser(currentUser, currectPass);

            if (result == 200) {
                Home home = new Home();
                WorkDAO workDAO = new WorkDAO();
                HomeController homeController = new HomeController(home, workDAO, view);
                return;
            }
            
            if (result == 401){
                JOptionPane.showMessageDialog(view, "Usuario o Contraseña incorrectos");
                return;
            }
            
            if (result == 505){
                JOptionPane.showMessageDialog(view, "Tenemos un error en la parte del servidor");
                return;
            }
        }
    }

    public void signUp() {
        ViewNewSignUp viewNewSignUp = new ViewNewSignUp();
        SignUpController signUpController = new SignUpController(viewNewSignUp, modal, view);
    }
}
