package controller;

import dao.AutomobileDAO;
import igu.ViewNewAutomobile;
import javax.swing.JFrame;
import motortech.Views;

public class AutomobileController {
    private ViewNewAutomobile view;
    private AutomobileDAO model;
    private JFrame callerView;
    
    private int IdCard = 0;
    
    public AutomobileController(ViewNewAutomobile view, AutomobileDAO model, JFrame callerView) {
        this.view = view;
        this.model = model;
        this.callerView = callerView;
        
        init();
    }
    
    public AutomobileController(ViewNewAutomobile view, AutomobileDAO model, JFrame callerView, int IdCard) {
        this.view = view;
        this.model = model;
        this.callerView = callerView;
        
        this.IdCard = IdCard;
        init();
    }
    
    private void init(){
        if (IdCard != 0){
            view.hideIdCard(IdCard);
        }
        
        view.setAutomobileController(this);
        Views.openWindows(view, callerView);
        setData();
    }
    
    private void setData(){
        boolean isEdit =  view.getIsEdit();
        
        if(isEdit){
            view.setTitleWindows("Editar Automobile");
            view.setlblAction("Guardar");
        }
    }
    
    public void Action() {
        if(IdCard == 0){
            this.CreateAutomobile();
        } else {
            this.UpdateAutomobile();
        }
    }
    
    private void CreateAutomobile(){
        
    }
    
    private void UpdateAutomobile() {
        
    }
    
    public void CloseApp(){
        view.dispose();
    }
}
