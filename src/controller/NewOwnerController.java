package controller;

import dao.OwnerDAO;
import igu.ViewNewOwner;
import igu.ViewNewWork;
import igu.ViewOwner;
import igu.ViewOwners;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import motortech.Owner;
import motortech.Views;

public class NewOwnerController {

    private ViewNewOwner view;
    private JFrame callerView;
    private OwnerDAO model;

    public NewOwnerController() {
    }

    public NewOwnerController(ViewNewOwner view, OwnerDAO model, JFrame callerView) {
        this.view = view;
        this.callerView = callerView;
        this.model = model;

        init();
    }

    private void init() {
        view.setSignUpController(this);
        Views.openWindows(view);
    }

    public void Action() {
        if (!view.isEdit) {
            CreateOwner();
        } else {
            UpdateOwner();
        }
    }

    private void CreateOwner() {
        try {
            Owner owner = new Owner(view.getTxtInputIDCard(), view.getTxtInputNameOwner(), view.getTxtInputAdressOwner(), view.getTxtInputCellOwner(), view.getTxtInputEmailOwner());

            boolean isCreate = model.createOwner(owner);
            String name = owner.getNombresApellidos();

            if (isCreate) {
                JOptionPane.showMessageDialog(view, "Propietario creado " + name);
                this.CloseView();
                return;
            }

            JOptionPane.showMessageDialog(view, "No se logro crear el Propietario " + name);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
        }

    }

    private void UpdateOwner() {
        try {
            Owner owner = new Owner(view.getTxtInputIDCard(), view.getTxtInputNameOwner(), view.getTxtInputAdressOwner(), view.getTxtInputCellOwner(), view.getTxtInputEmailOwner());

            boolean isEdit = model.updateOwner(owner);

            String name = owner.getNombresApellidos();

            if (isEdit) {
                JOptionPane.showMessageDialog(view, "Propietario editado " + name);
                this.CloseView();
                return;
            }

            JOptionPane.showMessageDialog(view, "No se logro editar el Propietario " + name);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
        }
    }

    public void CloseView() {
        if (callerView instanceof ViewOwners) {
            ViewOwners viewOwners = (ViewOwners) callerView;
            OwnersController ownersController = viewOwners.getOwnersController();
            ownersController.resetTable(true);
            ownersController.setEnabledTable(true);
            view.dispose();
            return;
        }

        if (callerView instanceof ViewOwner) {
            ViewOwner viewOwner = (ViewOwner) callerView;
            OwnerController ownerController = viewOwner.getOwnerController();

            ownerController.setData(viewOwner.getIdCard());
            callerView.setVisible(true);
            view.dispose();
        }

        if (callerView instanceof ViewNewWork) {
            ViewNewWork viewNewWork = (ViewNewWork) callerView;
            NewWorkController newWorkController = viewNewWork.getNewWorkController();

            callerView.setVisible(true);
            view.dispose();
        }
    }
}
