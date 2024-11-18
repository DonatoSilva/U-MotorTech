package igu;

import controller.AutomobileController;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import motortech.Inputs;
import motortech.Inputs.ValidationPatterns;
import motortech.MotorTech;
import motortech.Views;

public class ViewNewAutomobile extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private String textPlates;
    private String textNumber;
    private String textNumber1;

    private AutomobileController automobileController;

    private boolean isEdit = false;

    public ViewNewAutomobile(boolean isEdit) {
        initComponents();

        this.isEdit = isEdit;
        initApp();
    }

    private void initApp() {
        rbtnAuto.setActionCommand("Automóvil");
        rbtnCamioneta.setActionCommand("Camioneta");

        if (isEdit) {
            inputPlate.setEnabled(false);
        }

        textPlates = inputPlate.getText();
        textNumber = inputTNumber.getText();
        textNumber1 = inputIdOwner.getText();
    }

    public void setTxtInputPlate(String plate) {
        this.inputPlate.setText(plate);
    }

    public String getTxtInputPlate() {
        String messageValid = Inputs.inputValidate(this, inputPlate, "La Placa", ValidationPatterns.PLACA);

        if (!messageValid.isEmpty()) {
            throw new IllegalArgumentException(messageValid);
        }

        return this.inputPlate.getText();
    }

    public void setTxtTInputNumber(String TNumber) {
        this.inputTNumber.setText(TNumber);
    }

    public String getTxtTInputNumber() {
        String messageValid = Inputs.inputValidate(this, inputTNumber, "El número de la targeta de propiedad");

        if (!messageValid.isEmpty()) {
            throw new IllegalArgumentException(messageValid);
        }

        return this.inputTNumber.getText();
    }

    public void setTxtInputIdOwner(String IdOwner) {
        this.inputIdOwner.setText(IdOwner);
    }

    public int getTxtInputIdOwner() {
        String messageValid = Inputs.inputValidate(this, inputIdOwner, "La cedula del propietario", ValidationPatterns.ID_CARD);

        if (!messageValid.isEmpty()) {
            throw new IllegalArgumentException(messageValid);
        }

        return Integer.parseInt(this.inputIdOwner.getText());
    }

    public void setSelectRadioButton(String actionCommand) {
        Enumeration<AbstractButton> buttons = buttonGroup.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            if (button.getActionCommand().equals(actionCommand)) {
                button.setSelected(true);
                break;
            }
        }
    }

    public String getSelectRadioButton() {
        ButtonModel selectModel = buttonGroup.getSelection();
        if (selectModel == null) {
            throw new IllegalArgumentException("Seleccione el estado del vehiculo");
        }

        return selectModel.getActionCommand();
    }

    public boolean getIsEdit() {
        return this.isEdit;
    }

    public void setTitleWindows(String title) {
        this.titleWindow.setText(title);
    }

    public void setlblAction(String text) {
        this.lblBtnSave.setText(text);
    }

    public void setAutomobileController(AutomobileController automobileController) {
        this.automobileController = automobileController;
    }

    public AutomobileController getAutomobileController() {
        return this.automobileController;
    }

    public void hideIdCard(int idOwner) {
        if (idOwner != 0) {
            Sepuser2.setVisible(false);
            inputIdOwner.setVisible(false);
            lblUser2.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        Container = new javax.swing.JPanel();
        titleWindow = new java.awt.Label();
        lblPass = new java.awt.Label();
        lblUser = new java.awt.Label();
        btnSave = new javax.swing.JPanel();
        lblBtnSave = new java.awt.Label();
        Sepuser = new javax.swing.JSeparator();
        lblBtnCancel = new java.awt.Label();
        barWindow = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JPanel();
        lblMinimize = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        inputPlate = new javax.swing.JTextField();
        rbtnAuto = new javax.swing.JRadioButton();
        rbtnCamioneta = new javax.swing.JRadioButton();
        lblUser1 = new java.awt.Label();
        inputTNumber = new javax.swing.JTextField();
        Sepuser1 = new javax.swing.JSeparator();
        Sepuser2 = new javax.swing.JSeparator();
        inputIdOwner = new javax.swing.JTextField();
        lblUser2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Container.setMaximumSize(new java.awt.Dimension(0, 0));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleWindow.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        titleWindow.setText("Crear vehículo");
        Container.add(titleWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        lblPass.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblPass.setText("Seleccione el tipo de vehículo");
        Container.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        lblUser.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblUser.setText("Placa");
        Container.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 50, -1));
        lblUser.getAccessibleContext().setAccessibleDescription("");

        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveopenHome(evt);
            }
        });

        lblBtnSave.setAlignment(java.awt.Label.CENTER);
        lblBtnSave.setBackground(new java.awt.Color(0, 153, 153));
        lblBtnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnSave.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnSave.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnSave.setText("Añadir");
        lblBtnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnSaveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSaveLayout = new javax.swing.GroupLayout(btnSave);
        btnSave.setLayout(btnSaveLayout);
        btnSaveLayout.setHorizontalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Container.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 90, 30));

        Sepuser.setForeground(new java.awt.Color(153, 153, 153));
        Sepuser.setPreferredSize(new java.awt.Dimension(290, 10));
        Container.add(Sepuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        lblBtnCancel.setAlignment(java.awt.Label.CENTER);
        lblBtnCancel.setBackground(new java.awt.Color(255, 255, 255));
        lblBtnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnCancel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnCancel.setForeground(new java.awt.Color(0, 0, 0));
        lblBtnCancel.setText("Cancelar");
        lblBtnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnCancelopenSingUp(evt);
            }
        });
        Container.add(lblBtnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 90, 30));

        barWindow.setBackground(new java.awt.Color(255, 255, 255));
        barWindow.setPreferredSize(new java.awt.Dimension(498, 35));
        barWindow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barWindowMouseDragged(evt);
            }
        });
        barWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barWindowMousePressed(evt);
            }
        });
        barWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(0, 153, 153));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setPreferredSize(new java.awt.Dimension(35, 35));

        lblExit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setPreferredSize(new java.awt.Dimension(35, 35));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitcloseApp(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        barWindow.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 0, -1, -1));

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.setPreferredSize(new java.awt.Dimension(35, 35));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeminimizeApp(evt);
            }
        });

        lblMinimize.setAlignment(java.awt.Label.CENTER);
        lblMinimize.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblMinimize.setText("-");
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnMinimizeLayout = new javax.swing.GroupLayout(btnMinimize);
        btnMinimize.setLayout(btnMinimizeLayout);
        btnMinimizeLayout.setHorizontalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMinimizeLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnMinimizeLayout.setVerticalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMinimizeLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        barWindow.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        Container.add(barWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 500, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Motortech.jpg"))); // NOI18N
        Container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        inputPlate.setBackground(new java.awt.Color(255, 255, 255));
        inputPlate.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputPlate.setForeground(new java.awt.Color(204, 204, 204));
        inputPlate.setText("Ingrese su placa");
        inputPlate.setBorder(null);
        inputPlate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputPlateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputPlateFocusLost(evt);
            }
        });
        Container.add(inputPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 290, 30));
        inputPlate.getAccessibleContext().setAccessibleName("Placa del carro");
        inputPlate.getAccessibleContext().setAccessibleDescription("introdusca la placa del carro para continuar con el formulario");

        rbtnAuto.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(rbtnAuto);
        rbtnAuto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rbtnAuto.setForeground(new java.awt.Color(0, 0, 0));
        rbtnAuto.setText("Automóvil");
        Container.add(rbtnAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        rbtnCamioneta.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(rbtnCamioneta);
        rbtnCamioneta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rbtnCamioneta.setForeground(new java.awt.Color(0, 0, 0));
        rbtnCamioneta.setText("Camioneta");
        Container.add(rbtnCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        lblUser1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblUser1.setText("Targeta de propiedad");
        Container.add(lblUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 180, -1));

        inputTNumber.setBackground(new java.awt.Color(255, 255, 255));
        inputTNumber.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputTNumber.setForeground(new java.awt.Color(204, 204, 204));
        inputTNumber.setText("Ingrese su tarjeta de propiedad");
        inputTNumber.setBorder(null);
        inputTNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputTNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputTNumberFocusLost(evt);
            }
        });
        Container.add(inputTNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 290, 30));

        Sepuser1.setForeground(new java.awt.Color(153, 153, 153));
        Sepuser1.setPreferredSize(new java.awt.Dimension(290, 10));
        Container.add(Sepuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        Sepuser2.setForeground(new java.awt.Color(153, 153, 153));
        Sepuser2.setPreferredSize(new java.awt.Dimension(290, 10));
        Container.add(Sepuser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        inputIdOwner.setBackground(new java.awt.Color(255, 255, 255));
        inputIdOwner.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputIdOwner.setForeground(new java.awt.Color(204, 204, 204));
        inputIdOwner.setText("Ingrese la Cedula");
        inputIdOwner.setBorder(null);
        inputIdOwner.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIdOwnerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIdOwnerFocusLost(evt);
            }
        });
        inputIdOwner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputIdOwnerKeyTyped(evt);
            }
        });
        Container.add(inputIdOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 290, 30));

        lblUser2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblUser2.setText("Cedula del propietario");
        Container.add(lblUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputPlateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPlateFocusLost
        Inputs.inputTextFocus(inputPlate, textPlates, true);
    }//GEN-LAST:event_inputPlateFocusLost

    private void inputPlateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPlateFocusGained
        Inputs.inputTextFocus(inputPlate, textPlates);
    }//GEN-LAST:event_inputPlateFocusGained

    private void barWindowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barWindowMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barWindowMousePressed

    private void barWindowMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barWindowMouseDragged
        Views.moveWindows(this, evt, xMouse, yMouse);
    }//GEN-LAST:event_barWindowMouseDragged

    private void btnMinimizeminimizeApp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeminimizeApp
        Views.minimizeWindows(this);
    }//GEN-LAST:event_btnMinimizeminimizeApp

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        btnMinimizeminimizeApp(evt);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        btnExit.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        btnExit.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitcloseApp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitcloseApp
        getAutomobileController().CloseApp();
    }//GEN-LAST:event_lblExitcloseApp

    private void lblBtnCancelopenSingUp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCancelopenSingUp
        lblExitcloseApp(evt);
    }//GEN-LAST:event_lblBtnCancelopenSingUp

    private void btnSaveopenHome(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveopenHome
        getAutomobileController().Action();
    }//GEN-LAST:event_btnSaveopenHome

    private void lblBtnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSaveMouseExited
        lblBtnSave.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblBtnSaveMouseExited

    private void lblBtnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSaveMouseEntered
        lblBtnSave.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_lblBtnSaveMouseEntered

    private void lblBtnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSaveMouseClicked
        btnSaveopenHome(evt);
    }//GEN-LAST:event_lblBtnSaveMouseClicked

    private void inputTNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTNumberFocusGained
        Inputs.inputTextFocus(inputTNumber, textNumber);
    }//GEN-LAST:event_inputTNumberFocusGained

    private void inputTNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTNumberFocusLost
        Inputs.inputTextFocus(inputTNumber, textNumber, true);
    }//GEN-LAST:event_inputTNumberFocusLost

    private void inputIdOwnerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdOwnerFocusGained
        Inputs.inputTextFocus(inputIdOwner, textNumber1);
    }//GEN-LAST:event_inputIdOwnerFocusGained

    private void inputIdOwnerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdOwnerFocusLost
        Inputs.inputTextFocus(inputIdOwner, textNumber1, true);
    }//GEN-LAST:event_inputIdOwnerFocusLost

    private void inputIdOwnerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIdOwnerKeyTyped
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || Character.isDigit(c)) {
            return;
        }

        if (!Character.isDigit(c)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            return;
        }
    }//GEN-LAST:event_inputIdOwnerKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JSeparator Sepuser;
    private javax.swing.JSeparator Sepuser1;
    private javax.swing.JSeparator Sepuser2;
    private javax.swing.JPanel barWindow;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JPanel btnSave;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTextField inputIdOwner;
    private javax.swing.JTextField inputPlate;
    private javax.swing.JTextField inputTNumber;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label lblBtnCancel;
    private java.awt.Label lblBtnSave;
    private javax.swing.JLabel lblExit;
    private java.awt.Label lblMinimize;
    private java.awt.Label lblPass;
    private java.awt.Label lblUser;
    private java.awt.Label lblUser1;
    private java.awt.Label lblUser2;
    private javax.swing.JRadioButton rbtnAuto;
    private javax.swing.JRadioButton rbtnCamioneta;
    private java.awt.Label titleWindow;
    // End of variables declaration//GEN-END:variables
}
