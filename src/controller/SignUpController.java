package controller;

import dao.UserDAO;
import database.PasswordUtil;
import igu.ViewLogin;
import igu.ViewNewSignUp;
import igu.ViewUsers;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
        try {
            String title = "MotorTect - Registar usuario";

            User user = new User();
            user.setNombresApellidos(view.getTxtName());
            user.setTelefono(view.getTxtCell());
            user.setCorreoElectronico(view.getTxtEmail());
            user.setUsuario(view.getTxtUser());
            user.setContrasena(view.getTextPass());

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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
        }
    }

    public void updateUser() {
        try {
            User user = new User();
            user.setNombresApellidos(view.getTxtName());
            user.setTelefono(view.getTxtCell());
            user.setCorreoElectronico(view.getTxtEmail());
            user.setUsuario(view.getTxtUser());

            if (view.getTextPass().equals("Contraseña")) {
                String pass = view.getUser().getContrasena();
                user.setContrasena(pass);
            } else {
                String pass = PasswordUtil.hashPassword(view.getTextPass());
                user.setContrasena(pass);
            }

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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
        }
    }
    
    public void Login() {
        this.CloseView(view.isPopupWindow);
    }

    public void CloseView(boolean isPopupWindow) {
        if (!isPopupWindow) {
            new LoginController(new ViewLogin(), new UserDAO());
            view.dispose();
            return;
        }

        if (callerView instanceof ViewUsers) {
            ViewUsers viewUsers = (ViewUsers) callerView;
            UsersController usersController = viewUsers.getUsersController();
            usersController.resetTable(true);
            usersController.setEnabledTable(true);
            view.dispose();
            return;
        }

        view.dispose();
    }
}
