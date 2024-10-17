package controller;

import dao.UserDAO;
import dao.WorkDAO;
import igu.Home;
import igu.ViewLogin;
import igu.ViewUsers;
import javax.swing.JFrame;
import motortech.Views;

public class HomeController {
    private Home view;
    private WorkDAO modal;
    private JFrame callerView;

    public HomeController() {
    }
    
    public HomeController(Home view, WorkDAO modal, JFrame callerView) {
        this.view = view;
        this.modal = modal;
        this.callerView = callerView;
        
        init();
    }
    
    private void init() {
        view.setHomeController(this);
        Views.openWindows(view, callerView);
    }
    
    public void login() {
        new LoginController(new ViewLogin(), new UserDAO(), view);
    }
    
    public void users() {
        new UsersController(new ViewUsers(), new UserDAO(), view);
    }
}
