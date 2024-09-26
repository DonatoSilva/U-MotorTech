/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;
 
import motortech.Inputs;
import motortech.MotorTech;
import motortech.Views;

public class Login extends javax.swing.JFrame {
    String textUser;
    String textPassUser;
    int xMouse;
    int yMouse;
    
    public Login() {
        initComponents();
        
        btnHome.requestFocus();
        
        textUser = inputUser.getText();
        textPassUser = String.valueOf(inputPass.getPassword());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        titleWindow = new java.awt.Label();
        lblPass = new java.awt.Label();
        lblUser = new java.awt.Label();
        inputUser = new javax.swing.JTextField();
        btnHome = new javax.swing.JPanel();
        lblBtnHome = new java.awt.Label();
        inputPass = new javax.swing.JPasswordField();
        SepPass = new javax.swing.JSeparator();
        Sepuser = new javax.swing.JSeparator();
        label5 = new java.awt.Label();
        barWindow = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JPanel();
        lblMinimize = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setUndecorated(true);
        setResizable(false);

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Container.setMaximumSize(new java.awt.Dimension(0, 0));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleWindow.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        titleWindow.setText("INICIAR SESIÓN");
        Container.add(titleWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblPass.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblPass.setText("Contraseña");
        Container.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        lblUser.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblUser.setText("Usuario");
        Container.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 50, -1));

        inputUser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputUser.setForeground(new java.awt.Color(204, 204, 204));
        inputUser.setText("Ingrese su usuario");
        inputUser.setBorder(null);
        inputUser.setNextFocusableComponent(inputPass);
        inputUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputUserFocusLost(evt);
            }
        });
        Container.add(inputUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 290, 30));

        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openHome(evt);
            }
        });

        lblBtnHome.setAlignment(java.awt.Label.CENTER);
        lblBtnHome.setBackground(new java.awt.Color(0, 153, 153));
        lblBtnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnHome.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnHome.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnHome.setText("Iniciar");
        lblBtnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnHomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Container.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, 30));

        inputPass.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputPass.setForeground(new java.awt.Color(204, 204, 204));
        inputPass.setText("Contraseña");
        inputPass.setBorder(null);
        inputPass.setNextFocusableComponent(btnHome);
        inputPass.setPreferredSize(new java.awt.Dimension(290, 30));
        inputPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputPassFocusLost(evt);
            }
        });
        Container.add(inputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        SepPass.setForeground(new java.awt.Color(153, 153, 153));
        SepPass.setPreferredSize(new java.awt.Dimension(290, 10));
        Container.add(SepPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        Sepuser.setForeground(new java.awt.Color(153, 153, 153));
        Sepuser.setPreferredSize(new java.awt.Dimension(290, 10));
        Container.add(Sepuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(new java.awt.Color(255, 255, 255));
        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Registrar");
        label5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openSingUp(evt);
            }
        });
        Container.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 90, 30));

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
                closeApp(evt);
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
                minimizeApp(evt);
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
        Container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeApp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeApp
        Views.closeWindows();
    }//GEN-LAST:event_closeApp

    private void minimizeApp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeApp
        Views.minimizeWindows(this);
    }//GEN-LAST:event_minimizeApp

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        minimizeApp(evt);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void barWindowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barWindowMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barWindowMousePressed

    private void barWindowMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barWindowMouseDragged
        Views.moveWindows(this, evt, xMouse, yMouse);
    }//GEN-LAST:event_barWindowMouseDragged

    private void openSingUp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openSingUp
        SignUp signUp = new SignUp();
        Views.openWindows(signUp, this);
    }//GEN-LAST:event_openSingUp

    private void openHome(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openHome
        String currentTextPass = String.valueOf(inputPass.getPassword());
        String currentTextUser = inputUser.getText();
        String title = "MotorTech - Inicio de Sesion";
        
        
        if(currentTextPass.equals(textPassUser)){
            Inputs.dialogMessageDialog(this, inputPass, title, "La contraseña no puede estar vacía");
            return;
        }
        
        if(currentTextUser.equals(textUser)) {
            Inputs.dialogMessageDialog(this, inputUser, title, "El usuario no puede estar vacío");
            return;
        }
        
        
        
        Home home = new Home();
        Views.openWindows(home, this);
    }//GEN-LAST:event_openHome

    private void lblBtnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnHomeMouseClicked
        openHome(evt);
    }//GEN-LAST:event_lblBtnHomeMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        btnExit.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        btnExit.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblExitMouseExited

    private void lblBtnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnHomeMouseEntered
        lblBtnHome.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_lblBtnHomeMouseEntered

    private void lblBtnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnHomeMouseExited
        lblBtnHome.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblBtnHomeMouseExited

    private void inputUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputUserFocusGained
       Inputs.inputTextFocus(inputUser, "Ingrese su usuario");
    }//GEN-LAST:event_inputUserFocusGained

    private void inputUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputUserFocusLost
        Inputs.inputTextFocus(inputUser, "Ingrese su usuario", true);
    }//GEN-LAST:event_inputUserFocusLost

    private void inputPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPassFocusGained
        Inputs.inputPassFocus(inputPass, "Contraseña");
    }//GEN-LAST:event_inputPassFocusGained

    private void inputPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPassFocusLost
        Inputs.inputPassFocus(inputPass, "Contraseña", true);
    }//GEN-LAST:event_inputPassFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JSeparator SepPass;
    private javax.swing.JSeparator Sepuser;
    private javax.swing.JPanel barWindow;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JTextField inputUser;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label5;
    private java.awt.Label lblBtnHome;
    private javax.swing.JLabel lblExit;
    private java.awt.Label lblMinimize;
    private java.awt.Label lblPass;
    private java.awt.Label lblUser;
    private java.awt.Label titleWindow;
    // End of variables declaration//GEN-END:variables
}
