
package igu;

import motortech.MotorTech;
import motortech.Views;
import motortech.Inputs;

public class SignUp extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    
    String textNameUser;
    String textCellUser;
    String textEmailUser;
    String textUser;
    String textPassUser;
    
    public SignUp() {
        initComponents();
        
        textNameUser = inputNameUser.getText();
        textUser = inputUser.getText();
        textEmailUser = inputEmailUser.getText();
        textCellUser = inputCellUser.getText();
        textPassUser = String.valueOf(inputPassUser.getPassword());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Containe = new javax.swing.JPanel();
        barWindow = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        lblBtnClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBtnMinimize = new javax.swing.JLabel();
        titleWindow = new java.awt.Label();
        inputCell = new javax.swing.JPanel();
        lblCellUser = new java.awt.Label();
        inputCellUser = new javax.swing.JTextField();
        SepCellUser = new javax.swing.JSeparator();
        inputName = new javax.swing.JPanel();
        lblNameUser = new java.awt.Label();
        inputNameUser = new javax.swing.JTextField();
        SepNameUser = new javax.swing.JSeparator();
        inputEmail = new javax.swing.JPanel();
        lblEmailUser = new java.awt.Label();
        inputEmailUser = new javax.swing.JTextField();
        SepEmailUser = new javax.swing.JSeparator();
        inputUser1 = new javax.swing.JPanel();
        lblUser = new java.awt.Label();
        inputUser = new javax.swing.JTextField();
        SepUser = new javax.swing.JSeparator();
        inputPass = new javax.swing.JPanel();
        inputPassUser = new javax.swing.JPasswordField();
        SepPassUser = new javax.swing.JSeparator();
        lblPassUser = new java.awt.Label();
        lblInfPass = new javax.swing.JLabel();
        btnOwner = new javax.swing.JPanel();
        lblBtnOwner = new java.awt.Label();
        btnHome = new javax.swing.JPanel();
        lblBtnLogin = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registar Usuario");
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 400));

        Containe.setBackground(new java.awt.Color(255, 255, 255));
        Containe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        Containe.setMinimumSize(new java.awt.Dimension(800, 36));
        Containe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barWindow.setBackground(new java.awt.Color(255, 255, 255));
        barWindow.setPreferredSize(new java.awt.Dimension(798, 35));
        barWindow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveWindow(evt);
            }
        });
        barWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pressWindow(evt);
            }
        });
        barWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(0, 153, 153));
        btnClose.setPreferredSize(new java.awt.Dimension(35, 35));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });

        lblBtnClose.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnClose.setText("X");
        lblBtnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBtnClose.setInheritsPopupMenu(false);
        lblBtnClose.setPreferredSize(new java.awt.Dimension(35, 35));
        lblBtnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWindow(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnCloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        barWindow.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(35, 35));
        jPanel2.setMinimumSize(new java.awt.Dimension(35, 35));
        jPanel2.setPreferredSize(new java.awt.Dimension(35, 35));

        lblBtnMinimize.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblBtnMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnMinimize.setText("-");
        lblBtnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnMinimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBtnMinimize.setPreferredSize(new java.awt.Dimension(35, 35));
        lblBtnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeWinodw(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        barWindow.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, -1));

        Containe.add(barWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 800, -1));

        titleWindow.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        titleWindow.setText("Registrar usuario");
        Containe.add(titleWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        inputCell.setBackground(new java.awt.Color(255, 255, 255));

        lblCellUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCellUser.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblCellUser.setText("Teléfono");

        inputCellUser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputCellUser.setForeground(new java.awt.Color(204, 204, 204));
        inputCellUser.setText("+57 316605882");
        inputCellUser.setToolTipText("");
        inputCellUser.setBorder(null);
        inputCellUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCellUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCellUserFocusLost(evt);
            }
        });

        SepCellUser.setForeground(new java.awt.Color(153, 153, 153));
        SepCellUser.setPreferredSize(new java.awt.Dimension(310, 10));

        javax.swing.GroupLayout inputCellLayout = new javax.swing.GroupLayout(inputCell);
        inputCell.setLayout(inputCellLayout);
        inputCellLayout.setHorizontalGroup(
            inputCellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputCellUser)
            .addComponent(SepCellUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCellUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inputCellLayout.setVerticalGroup(
            inputCellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputCellLayout.createSequentialGroup()
                .addComponent(lblCellUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(inputCellUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SepCellUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        Containe.add(inputCell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 310, 70));

        inputName.setBackground(new java.awt.Color(255, 255, 255));

        lblNameUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblNameUser.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblNameUser.setText("Nombre");

        inputNameUser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputNameUser.setForeground(new java.awt.Color(204, 204, 204));
        inputNameUser.setText("Nombre completo");
        inputNameUser.setToolTipText("");
        inputNameUser.setBorder(null);
        inputNameUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNameUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNameUserFocusLost(evt);
            }
        });

        SepNameUser.setForeground(new java.awt.Color(153, 153, 153));
        SepNameUser.setPreferredSize(new java.awt.Dimension(310, 10));

        javax.swing.GroupLayout inputNameLayout = new javax.swing.GroupLayout(inputName);
        inputName.setLayout(inputNameLayout);
        inputNameLayout.setHorizontalGroup(
            inputNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputNameUser)
            .addComponent(SepNameUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblNameUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inputNameLayout.setVerticalGroup(
            inputNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputNameLayout.createSequentialGroup()
                .addComponent(lblNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(inputNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SepNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        Containe.add(inputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 310, 70));

        inputEmail.setBackground(new java.awt.Color(255, 255, 255));

        lblEmailUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEmailUser.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblEmailUser.setText("Correo");

        inputEmailUser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputEmailUser.setForeground(new java.awt.Color(204, 204, 204));
        inputEmailUser.setText("Correo@email.com");
        inputEmailUser.setToolTipText("");
        inputEmailUser.setBorder(null);
        inputEmailUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputEmailUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputEmailUserFocusLost(evt);
            }
        });

        SepEmailUser.setForeground(new java.awt.Color(153, 153, 153));
        SepEmailUser.setPreferredSize(new java.awt.Dimension(310, 10));

        javax.swing.GroupLayout inputEmailLayout = new javax.swing.GroupLayout(inputEmail);
        inputEmail.setLayout(inputEmailLayout);
        inputEmailLayout.setHorizontalGroup(
            inputEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputEmailUser)
            .addComponent(SepEmailUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblEmailUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inputEmailLayout.setVerticalGroup(
            inputEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputEmailLayout.createSequentialGroup()
                .addComponent(lblEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(inputEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SepEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        Containe.add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 310, 70));

        inputUser1.setBackground(new java.awt.Color(255, 255, 255));

        lblUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblUser.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblUser.setText("Usuario");

        inputUser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputUser.setForeground(new java.awt.Color(204, 204, 204));
        inputUser.setText("Ejemplo: JoseIdeas");
        inputUser.setToolTipText("");
        inputUser.setBorder(null);
        inputUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputUserFocusLost(evt);
            }
        });

        SepUser.setForeground(new java.awt.Color(153, 153, 153));
        SepUser.setPreferredSize(new java.awt.Dimension(310, 10));

        javax.swing.GroupLayout inputUser1Layout = new javax.swing.GroupLayout(inputUser1);
        inputUser1.setLayout(inputUser1Layout);
        inputUser1Layout.setHorizontalGroup(
            inputUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputUser)
            .addComponent(SepUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inputUser1Layout.setVerticalGroup(
            inputUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputUser1Layout.createSequentialGroup()
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(inputUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SepUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        Containe.add(inputUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 310, 70));

        inputPass.setBackground(new java.awt.Color(255, 255, 255));
        inputPass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputPassUser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputPassUser.setForeground(new java.awt.Color(204, 204, 204));
        inputPassUser.setText("Contraseña");
        inputPassUser.setBorder(null);
        inputPassUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputPassUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputPassUserFocusLost(evt);
            }
        });
        inputPass.add(inputPassUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 18, 310, 30));

        SepPassUser.setBackground(new java.awt.Color(255, 255, 255));
        SepPassUser.setForeground(new java.awt.Color(153, 153, 153));
        SepPassUser.setPreferredSize(new java.awt.Dimension(310, 19));
        SepPassUser.setVerifyInputWhenFocusTarget(false);
        inputPass.add(SepPassUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, -1, -1));

        lblPassUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPassUser.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblPassUser.setText("Contraseña");
        inputPass.add(lblPassUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        lblInfPass.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblInfPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInfPass.setText("<html>La Contraseña debe llevar  8 caracteres min, <br>\nentre Mayusculas, y signos (@!?)</html>");
        lblInfPass.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        inputPass.add(lblInfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 310, -1));

        Containe.add(inputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 310, 90));

        lblBtnOwner.setAlignment(java.awt.Label.CENTER);
        lblBtnOwner.setBackground(new java.awt.Color(0, 153, 153));
        lblBtnOwner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnOwner.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnOwner.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnOwner.setText("Registar");
        lblBtnOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnOwnerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnOwnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnOwnerMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnOwnerLayout = new javax.swing.GroupLayout(btnOwner);
        btnOwner.setLayout(btnOwnerLayout);
        btnOwnerLayout.setHorizontalGroup(
            btnOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnOwner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnOwnerLayout.setVerticalGroup(
            btnOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnOwner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Containe.add(btnOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 90, 30));

        lblBtnLogin.setAlignment(java.awt.Label.CENTER);
        lblBtnLogin.setBackground(new java.awt.Color(255, 255, 255));
        lblBtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnLogin.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnLogin.setForeground(new java.awt.Color(0, 0, 0));
        lblBtnLogin.setText("Iniciar sesion");
        lblBtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Containe.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Containe, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Containe, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("venta donde se pueden registrar los nuevos usuarios de MotorTech");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pressWindow(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pressWindow
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pressWindow

    private void moveWindow(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveWindow
        Views.moveWindows(this, evt, xMouse, yMouse);
    }//GEN-LAST:event_moveWindow

    private void closeWindow(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWindow
        Views.closeWindows();
    }//GEN-LAST:event_closeWindow

    private void minimizeWinodw(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeWinodw
         Views.minimizeWindows(this);
    }//GEN-LAST:event_minimizeWinodw

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnClose.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_btnCloseMouseExited

    private void lblBtnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCloseMouseEntered
        btnCloseMouseEntered(evt);
    }//GEN-LAST:event_lblBtnCloseMouseEntered

    private void lblBtnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCloseMouseExited
        btnCloseMouseExited(evt);
    }//GEN-LAST:event_lblBtnCloseMouseExited

    private void inputNameUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNameUserFocusGained
        Inputs.inputTextFocus(inputNameUser, textNameUser);
    }//GEN-LAST:event_inputNameUserFocusGained

    private void inputNameUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNameUserFocusLost
        Inputs.inputTextFocus(inputNameUser, textNameUser, true);
    }//GEN-LAST:event_inputNameUserFocusLost

    private void inputCellUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCellUserFocusGained
        Inputs.inputTextFocus(inputCellUser, textCellUser);
    }//GEN-LAST:event_inputCellUserFocusGained

    private void inputCellUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCellUserFocusLost
        Inputs.inputTextFocus(inputCellUser, textCellUser, true);
    }//GEN-LAST:event_inputCellUserFocusLost

    private void inputEmailUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEmailUserFocusGained
        Inputs.inputTextFocus(inputEmailUser, textEmailUser);
    }//GEN-LAST:event_inputEmailUserFocusGained

    private void inputEmailUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEmailUserFocusLost
        Inputs.inputTextFocus(inputEmailUser, textEmailUser, true);
    }//GEN-LAST:event_inputEmailUserFocusLost

    private void inputUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputUserFocusGained
        Inputs.inputTextFocus(inputUser, textUser);
    }//GEN-LAST:event_inputUserFocusGained

    private void inputUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputUserFocusLost
        Inputs.inputTextFocus(inputUser, textUser, true);
    }//GEN-LAST:event_inputUserFocusLost

    private void lblBtnOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnOwnerMouseClicked
        
    }//GEN-LAST:event_lblBtnOwnerMouseClicked

    private void lblBtnOwnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnOwnerMouseEntered
        lblBtnOwner.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_lblBtnOwnerMouseEntered

    private void lblBtnOwnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnOwnerMouseExited
        lblBtnOwner.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblBtnOwnerMouseExited

    private void lblBtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnLoginMouseClicked
        Login login = new Login();
        Views.openWindows(login, this);
    }//GEN-LAST:event_lblBtnLoginMouseClicked

    private void inputPassUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPassUserFocusGained
        Inputs.inputPassFocus(inputPassUser, textPassUser);
    }//GEN-LAST:event_inputPassUserFocusGained

    private void inputPassUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPassUserFocusLost
        Inputs.inputPassFocus(inputPassUser, textPassUser, true);
    }//GEN-LAST:event_inputPassUserFocusLost

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Containe;
    private javax.swing.JSeparator SepCellUser;
    private javax.swing.JSeparator SepEmailUser;
    private javax.swing.JSeparator SepNameUser;
    private javax.swing.JSeparator SepPassUser;
    private javax.swing.JSeparator SepUser;
    private javax.swing.JPanel barWindow;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnOwner;
    private javax.swing.JPanel inputCell;
    private javax.swing.JTextField inputCellUser;
    private javax.swing.JPanel inputEmail;
    private javax.swing.JTextField inputEmailUser;
    private javax.swing.JPanel inputName;
    private javax.swing.JTextField inputNameUser;
    private javax.swing.JPanel inputPass;
    private javax.swing.JPasswordField inputPassUser;
    private javax.swing.JTextField inputUser;
    private javax.swing.JPanel inputUser1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBtnClose;
    private java.awt.Label lblBtnLogin;
    private javax.swing.JLabel lblBtnMinimize;
    private java.awt.Label lblBtnOwner;
    private java.awt.Label lblCellUser;
    private java.awt.Label lblEmailUser;
    private javax.swing.JLabel lblInfPass;
    private java.awt.Label lblNameUser;
    private java.awt.Label lblPassUser;
    private java.awt.Label lblUser;
    private java.awt.Label titleWindow;
    // End of variables declaration//GEN-END:variables
}
