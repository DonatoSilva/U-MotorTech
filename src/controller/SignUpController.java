package controller;

import dao.UserDAO;
import igu.ViewLogin;
import igu.ViewNewSignUp;
import igu.ViewUsers;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import motortech.Inputs;
import motortech.User;
import motortech.Views;

public final class SignUpController {

    private ViewNewSignUp view;
    private UserDAO model;

    private JFrame callerView;

    public SignUpController() {
    }

    public SignUpController(ViewNewSignUp view, UserDAO model, JFrame callerView) {
        this.view = view;
        this.model = model;
        this.callerView = callerView;

        initView();
    }

    public void initView() {
        view.setSignUpController(this);

        if (view.isPopupWindow) {
            Views.openWindows(view);
        } else {
            Views.openWindows(view, callerView);
        }
    }

    public void createUser() {
        String title = "MotorTect - Registar usuario";

        if (isValidateInputs(title)) {
            User user = new User();
            user.setNombresApellidos(view.inputNameUser.getText());
            user.setTelefono(view.inputCellUser.getText());
            user.setCorreoElectronico(view.inputEmailUser.getText());
            user.setUsuario(view.inputUser.getText());
            user.setContrasena(String.valueOf(view.inputPassUser.getPassword()));

            boolean isInsert = model.createUser(user);

            if (isInsert) {
                JOptionPane.showMessageDialog(view, "Usuario creado " + user.getUsuario());
                if (!view.isPopupWindow) {
                    new LoginController(new ViewLogin(), new UserDAO(), view);
                }
                
                this.CloseView(view.isPopupWindow);
                return;
            }

            JOptionPane.showMessageDialog(view, "El Usuario no puedo ser creado " + user.getUsuario() + " Ni el teléfono, ni el usuario se puede repetir");
        }
    }

    public void updateUser() {
        String title = "MotorTect - Editar usuario";

        User user = new User();
        user.setNombresApellidos(view.inputNameUser.getText());
        user.setTelefono(view.inputCellUser.getText());
        user.setCorreoElectronico(view.inputEmailUser.getText());
        user.setUsuario(view.inputUser.getText());
        user.setContrasena(String.valueOf(view.inputPassUser.getPassword()));

        boolean isUpdate = model.updateUser(user);

        if (isUpdate) {
            JOptionPane.showMessageDialog(view, "Usuario modificado " + user.getUsuario());
            if (callerView instanceof ViewUsers) {
                this.CloseView(view.isPopupWindow);
            } else {
                System.out.println("El objeto no es una instancia de ViewUser");
            }
            return;
        }

        JOptionPane.showMessageDialog(view, "El Usuario no puedo ser editar " + user.getUsuario() + " Ni el teléfono, ni el usuario se puede repetir");
    }

    public boolean isValidateInputs(String title) {
        boolean isValidate = true;

        if (view.textNameUser.equals(view.inputNameUser.getText())) {
            Inputs.dialogMessageDialog(view, view.inputNameUser, title, "El nombre no puede estar vacío");
            isValidate = false;
        }

        if (view.inputCellUser.getText().equals(view.textCellUser)) {
            Inputs.dialogMessageDialog(view, view.inputCellUser, title, "El campo del celular no puede estar vacío");
            isValidate = false;
        }

        if (view.textEmailUser.equals(view.inputEmailUser.getText())) {
            Inputs.dialogMessageDialog(view, view.inputEmailUser, title, "El correo electronico no puede estar vacío");
            isValidate = false;
        }

        if (view.textUser.equals(view.inputUser.getText())) {
            Inputs.dialogMessageDialog(view, view.inputUser, title, "El Usuario no puede estar vacío");
            isValidate = false;
        }

        if (view.textPassUser.equals(String.valueOf(view.inputPassUser.getPassword()))) {
            Inputs.dialogMessageDialog(view, view.inputPassUser, title, "La contreseña no puede estar vacía");
            isValidate = false;
        }

        if (view.textPassUser1.equals(String.valueOf(view.inputPassUser1.getPassword()))) {
            Inputs.dialogMessageDialog(view, view.inputPassUser1, title, "Tienes que verificar la contraseña");
            isValidate = false;
        }

        if (view.inputPassUser.getPassword().length < 8) {
            Inputs.dialogMessageDialog(view, view.inputPassUser, title, "La contraseña no puede tener menos de 8 caracteres");
            isValidate = false;
        }

        if (!String.valueOf(view.inputPassUser1.getPassword()).equals(String.valueOf(view.inputPassUser.getPassword()))) {
            Inputs.dialogMessageDialog(view, view.inputPassUser1, title, "La contraseña y su verificacion no son las mismas");
            isValidate = false;
        }

        return isValidate;
    }

    public void CloseView(boolean isPopupWindow) {
        if (!isPopupWindow) {
            Views.closeWindows();
            return;
        }

        ViewUsers viewUsers = (ViewUsers) callerView;
        UsersController usersController = viewUsers.getUsersController();
        usersController.resetTable(true);
        usersController.setEnabledTable(true);
        view.dispose();
    }
}
