package igu;

import controller.SignUpController;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import motortech.MotorTech;
import motortech.Views;
import motortech.Inputs;
import motortech.Inputs.ValidationPatterns;
import motortech.User;

public class ViewNewSignUp extends javax.swing.JFrame {
    private int xMouse;
    private int yMouse;
    
    private SignUpController signUpController;

    public String textNameUser;
    public String textCellUser;
    public String textEmailUser;
    public String textUser;
    public String textPassUser;
    public String textPassUser1;

    public boolean isPopupWindow = false;
    public boolean isEdit = false;
    
    private User user;

    public ViewNewSignUp() {
        initComponents();
        
        initInput();
    }

    public ViewNewSignUp(boolean isPopup) {
        initComponents();
        isPopupWindow = isPopup;

        initInput();
    }
    
    public ViewNewSignUp(boolean isPopup, boolean isEdit, User user){
        initComponents();
        isPopupWindow = isPopup;
        this.isEdit = isEdit;
        
        this.setUser(user);
        
        inputNameUser.setText(user.getNombresApellidos());
        inputUser.setText(user.getUsuario());
        inputEmailUser.setText(user.getCorreoElectronico());
        inputCellUser.setText(user.getTelefono());
        inputPassUser.setText("Contraseña");
        inputPassUser1.setText("Contraseña");
        
        initInput();
    }
    
    private void initInput() {
        btnLogin.setVisible(!isPopupWindow);
        
        
        if (isEdit) {
            titleWindow.setText("Editar usuario");
            inputCellUser.setEditable(!isEdit);
            lblBtnSingUp.setText("Editar");
        }
        
        textNameUser = inputNameUser.getText();
        textUser = inputUser.getText();
        textEmailUser = inputEmailUser.getText();
        textCellUser = inputCellUser.getText();
        textPassUser = String.valueOf("Contraseña");
        textPassUser1 = String.valueOf("Contraseña");
    }
    
    public void setUser(User user){
        this.user = user;
    }
    
    public User getUser() {
        return this.user;
    }
    
    public String getTxtUser(){
        String messageValid = Inputs.inputValidate(this, inputUser, "Usuario");
        
        if (!messageValid.isEmpty()) {
            throw new IllegalArgumentException(messageValid);
        }
        
        return String.valueOf(inputUser.getText());
    }
    
    public String getTxtName() {
        String messageValid = Inputs.inputValidate(this, inputNameUser, "Nombre", ValidationPatterns.NAME);
        
        if (!messageValid.isEmpty()) {
            throw new IllegalArgumentException(messageValid);
        }
        
        return String.valueOf(inputNameUser.getText());
    }
    
    public String getTxtCell() {
        String messageValid = Inputs.inputValidate(this, inputCellUser, "Telefono", ValidationPatterns.CELL);
        
        if (!messageValid.isEmpty()) {
            throw new IllegalArgumentException(messageValid);
        }
        
        return String.valueOf(inputCellUser.getText());
    }
    
    public String getTxtEmail(){
        String messageValid = Inputs.inputValidate(this, inputEmailUser, "Telefono", ValidationPatterns.EMAIL);
        
        if (!messageValid.isEmpty()) {
            throw new IllegalArgumentException(messageValid);
        }
        
        return String.valueOf(inputEmailUser.getText());
    }
    
    public String getTextPass() {
        String pass = String.valueOf(inputPassUser.getPassword());
        
        if(pass.equals(textPassUser)){
            return pass;
        }
        
        String messageValid = Inputs.inputValidate(this, inputPassUser, "Contraseña", ValidationPatterns.Password);
        
        if (!messageValid.isEmpty()) {
            throw new IllegalArgumentException(messageValid);
        }
        
        return pass;
    }
    
    public SignUpController getSignUpController() {
        return signUpController;
    }

    public void setSignUpController(SignUpController signUpController) {
        this.signUpController = signUpController;
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
        btnOwner = new javax.swing.JPanel();
        lblBtnSingUp = new java.awt.Label();
        btnLogin = new javax.swing.JPanel();
        lblBtnLogin = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        inputPassUser1 = new javax.swing.JPasswordField();
        lblPassUser1 = new java.awt.Label();
        lblInfPass = new javax.swing.JLabel();
        SepPassUser1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registar Usuario");
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 400));

        Containe.setBackground(new java.awt.Color(255, 255, 255));
        Containe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        Containe.setMinimumSize(new java.awt.Dimension(800, 36));
        Containe.setPreferredSize(new java.awt.Dimension(800, 400));
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

        inputCellUser.setBackground(new java.awt.Color(255, 255, 255));
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
        inputCellUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCellUserKeyTyped(evt);
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

        inputNameUser.setBackground(new java.awt.Color(255, 255, 255));
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

        inputEmailUser.setBackground(new java.awt.Color(255, 255, 255));
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

        inputUser.setBackground(new java.awt.Color(255, 255, 255));
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

        inputPassUser.setBackground(new java.awt.Color(255, 255, 255));
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

        Containe.add(inputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 310, 60));

        lblBtnSingUp.setAlignment(java.awt.Label.CENTER);
        lblBtnSingUp.setBackground(new java.awt.Color(0, 153, 153));
        lblBtnSingUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnSingUp.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnSingUp.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnSingUp.setText("Registar");
        lblBtnSingUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnSingUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnSingUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnSingUpMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnOwnerLayout = new javax.swing.GroupLayout(btnOwner);
        btnOwner.setLayout(btnOwnerLayout);
        btnOwnerLayout.setHorizontalGroup(
            btnOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnSingUp, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnOwnerLayout.setVerticalGroup(
            btnOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnSingUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Containe.add(btnOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 30));

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

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Containe.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Motortech.jpg"))); // NOI18N
        Containe.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, -1));

        inputPassUser1.setBackground(new java.awt.Color(255, 255, 255));
        inputPassUser1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputPassUser1.setForeground(new java.awt.Color(204, 204, 204));
        inputPassUser1.setText("Contraseña");
        inputPassUser1.setBorder(null);
        inputPassUser1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputPassUser1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputPassUser1FocusLost(evt);
            }
        });
        Containe.add(inputPassUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 310, 30));

        lblPassUser1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPassUser1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblPassUser1.setText("Confirma contraseña");
        Containe.add(lblPassUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 120, -1));

        lblInfPass.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblInfPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInfPass.setText("<html>La Contraseña debe llevar  8 caracteres min, <br>\nentre Mayusculas, y signos (@!?)</html>");
        lblInfPass.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Containe.add(lblInfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 310, -1));

        SepPassUser1.setBackground(new java.awt.Color(255, 255, 255));
        SepPassUser1.setForeground(new java.awt.Color(153, 153, 153));
        SepPassUser1.setPreferredSize(new java.awt.Dimension(310, 19));
        SepPassUser1.setVerifyInputWhenFocusTarget(false);
        Containe.add(SepPassUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Containe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Containe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        signUpController.CloseView(isPopupWindow);
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

    private void lblBtnSingUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSingUpMouseClicked
        lblBtnSingUp.requestFocusInWindow();
        String title = "MotorTech - Registrar usuario";
        
        if (!isEdit) {
            if (textNameUser.equals(inputNameUser.getText())) {
                Inputs.dialogMessageDialog(this, inputNameUser, title, "La direcccón no puede estar vacía");
                return;
            }

            if (textCellUser.equals(inputCellUser.getText())) {
                Inputs.dialogMessageDialog(this, inputCellUser, title, "El nombre no puede estar vacío");
                return;
            }

            if (inputEmailUser.getText().equals(textEmailUser)) {
                Inputs.dialogMessageDialog(this, inputEmailUser, title, "El campo del celular no puede estar vacío");
                return;
            }

            if (textUser.equals(inputUser.getText())) {
                Inputs.dialogMessageDialog(this, inputUser, title, "El correo electronico no puede estar vacío");
                return;
            }

            if (textPassUser.equals(String.valueOf(inputPassUser.getPassword()))) {
                Inputs.dialogMessageDialog(this, inputPassUser, title, "La contraseña no puede estar vacia");
                return;
            }
            if (textPassUser1.equals(String.valueOf(inputPassUser1.getPassword()))) {
                Inputs.dialogMessageDialog(this, inputPassUser1, title, "La contraseña no puede estar vacia");
                return;
            }
        }
        
        if (isEdit){
           signUpController.updateUser();
           return;
        }
        
        signUpController.createUser();
    }//GEN-LAST:event_lblBtnSingUpMouseClicked

    private void lblBtnSingUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSingUpMouseEntered
        lblBtnSingUp.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_lblBtnSingUpMouseEntered

    private void lblBtnSingUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSingUpMouseExited
        lblBtnSingUp.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblBtnSingUpMouseExited

    private void lblBtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnLoginMouseClicked
        getSignUpController().Login();
    }//GEN-LAST:event_lblBtnLoginMouseClicked

    private void inputPassUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPassUserFocusGained
        Inputs.inputPassFocus(inputPassUser, textPassUser);
    }//GEN-LAST:event_inputPassUserFocusGained

    private void inputPassUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPassUserFocusLost
        Inputs.inputPassFocus(inputPassUser, textPassUser, true);
    }//GEN-LAST:event_inputPassUserFocusLost

    private void inputPassUser1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPassUser1FocusGained
        Inputs.inputPassFocus(inputPassUser1, textPassUser1);
    }//GEN-LAST:event_inputPassUser1FocusGained

    private void inputPassUser1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPassUser1FocusLost
        Inputs.inputPassFocus(inputPassUser1, textPassUser1, true);
    }//GEN-LAST:event_inputPassUser1FocusLost

    private void inputCellUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCellUserKeyTyped
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || Character.isDigit(c)) {
            return;
        }

        if (!Character.isDigit(c)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            return;
        }
    }//GEN-LAST:event_inputCellUserKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Containe;
    private javax.swing.JSeparator SepCellUser;
    private javax.swing.JSeparator SepEmailUser;
    private javax.swing.JSeparator SepNameUser;
    private javax.swing.JSeparator SepPassUser;
    private javax.swing.JSeparator SepPassUser1;
    private javax.swing.JSeparator SepUser;
    private javax.swing.JPanel barWindow;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JPanel btnOwner;
    private javax.swing.JPanel inputCell;
    public javax.swing.JTextField inputCellUser;
    private javax.swing.JPanel inputEmail;
    public javax.swing.JTextField inputEmailUser;
    private javax.swing.JPanel inputName;
    public javax.swing.JTextField inputNameUser;
    private javax.swing.JPanel inputPass;
    public javax.swing.JPasswordField inputPassUser;
    public javax.swing.JPasswordField inputPassUser1;
    public javax.swing.JTextField inputUser;
    private javax.swing.JPanel inputUser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBtnClose;
    private java.awt.Label lblBtnLogin;
    private javax.swing.JLabel lblBtnMinimize;
    private java.awt.Label lblBtnSingUp;
    private java.awt.Label lblCellUser;
    private java.awt.Label lblEmailUser;
    private javax.swing.JLabel lblInfPass;
    private java.awt.Label lblNameUser;
    private java.awt.Label lblPassUser;
    private java.awt.Label lblPassUser1;
    private java.awt.Label lblUser;
    private java.awt.Label titleWindow;
    // End of variables declaration//GEN-END:variables
}
