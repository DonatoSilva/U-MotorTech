package igu;

import controller.NewOwnerController;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import motortech.Inputs;
import motortech.Inputs.ValidationPatterns;
import motortech.MotorTech;
import motortech.Owner;
import motortech.Views;

public class ViewNewOwner extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    private String textNameOwner;
    private String textCellOwner;
    private String textEmailOwner;
    private String textIDCard;
    private String textAdressOwner;

    public boolean isEdit = false;

    private NewOwnerController NewOwnerController;

    public ViewNewOwner() {
        initComponents();

        initApp();
    }

    public ViewNewOwner(Owner owner) {
        initComponents();

        this.isEdit = true;

        inputIDCard.setText(Integer.toString(owner.getCedula()));
        inputNameOwner.setText(owner.getNombresApellidos());
        inputCellOwner.setText(owner.getTelefono());
        inputAdressOwner.setText(owner.getDireccion());
        inputEmailOwner.setText(owner.getCorreoElectronico());

        initApp();
    }

    private void initApp() {

        if (isEdit) {
            this.titleWindow.setText("Editar propietario");
            this.lblBtnOwner.setText("Guardar");
        }

        textNameOwner = inputNameOwner.getText();
        textAdressOwner = inputAdressOwner.getText();
        textCellOwner = inputCellOwner.getText();
        textEmailOwner = inputEmailOwner.getText();
        textIDCard = inputIDCard.getText();
    }

    public void setSignUpController(NewOwnerController newOwnerController) {
        this.NewOwnerController = newOwnerController;
    }

    public NewOwnerController getNewOwnerController() {
        return NewOwnerController;
    }

    public String getTxtInputAdressOwner() {
        String messageValid = Inputs.inputValidate(this, inputAdressOwner, "Correo electronico");

        if (!messageValid.isEmpty()) {
            throw new IllegalArgumentException(messageValid);
        }

        return inputAdressOwner.getText();
    }

    public String getTxtInputCellOwner() {
        String messageValid = Inputs.inputValidate(this, inputCellOwner, "Número de celular", ValidationPatterns.CELL);

        if (!messageValid.isEmpty()) {
            throw new IllegalArgumentException(messageValid);
        }

        return inputEmailOwner.getText();
    }

    public String getTxtInputEmailOwner() {
        String messageValid = Inputs.inputValidate(this, inputEmailOwner, "Correo electronico", ValidationPatterns.EMAIL);

        if (!messageValid.isEmpty()) {
            throw new IllegalArgumentException(messageValid);
        }

        return inputEmailOwner.getText();
    }

    public int getTxtInputIDCard() {
        String messageValid = Inputs.inputValidate(this, inputIDCard, "número de la cédula", ValidationPatterns.ID_CARD);
        
        if (!messageValid.isEmpty()) { 
            throw new IllegalArgumentException(messageValid); 
        }
        
        return Integer.parseInt(inputIDCard.getText());
    }

    public String getTxtInputNameOwner() {
        String messageValid = Inputs.inputValidate(this, inputNameOwner, "Nombre");
        
        if (!messageValid.isEmpty()) { 
            throw new IllegalArgumentException(messageValid); 
        }
        
        return inputNameOwner.getText();
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
        inputCellOwner = new javax.swing.JTextField();
        SepCellUser = new javax.swing.JSeparator();
        inputName = new javax.swing.JPanel();
        lblNameUser = new java.awt.Label();
        inputNameOwner = new javax.swing.JTextField();
        SepNameUser = new javax.swing.JSeparator();
        inputEmail = new javax.swing.JPanel();
        lblEmailUser = new java.awt.Label();
        inputEmailOwner = new javax.swing.JTextField();
        SepEmailUser = new javax.swing.JSeparator();
        inputUser1 = new javax.swing.JPanel();
        lblUser = new java.awt.Label();
        inputIDCard = new javax.swing.JTextField();
        SepUser = new javax.swing.JSeparator();
        btnOwner = new javax.swing.JPanel();
        lblBtnOwner = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        lblCellUser1 = new java.awt.Label();
        SepCellUser1 = new javax.swing.JSeparator();
        inputAdressOwner = new javax.swing.JTextField();
        lblCancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Containe.setBackground(new java.awt.Color(255, 255, 255));
        Containe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        Containe.setMinimumSize(new java.awt.Dimension(800, 36));
        Containe.setPreferredSize(new java.awt.Dimension(800, 400));
        Containe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barWindow.setBackground(new java.awt.Color(255, 255, 255));
        barWindow.setPreferredSize(new java.awt.Dimension(798, 35));
        barWindow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barWindowmoveWindow(evt);
            }
        });
        barWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barWindowpressWindow(evt);
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
                lblBtnClosecloseWindow(evt);
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

        lblBtnMinimize.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblBtnMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnMinimize.setText("-");
        lblBtnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnMinimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBtnMinimize.setPreferredSize(new java.awt.Dimension(35, 35));
        lblBtnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnMinimizeminimizeWinodw(evt);
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
        titleWindow.setText("Registrar propietario");
        Containe.add(titleWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        inputCell.setBackground(new java.awt.Color(255, 255, 255));

        lblCellUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCellUser.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblCellUser.setText("Teléfono");

        inputCellOwner.setBackground(new java.awt.Color(255, 255, 255));
        inputCellOwner.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputCellOwner.setForeground(new java.awt.Color(204, 204, 204));
        inputCellOwner.setText("+57 316605882");
        inputCellOwner.setToolTipText("");
        inputCellOwner.setBorder(null);
        inputCellOwner.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCellOwnerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCellOwnerFocusLost(evt);
            }
        });
        inputCellOwner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCellOwnerKeyTyped(evt);
            }
        });

        SepCellUser.setForeground(new java.awt.Color(153, 153, 153));
        SepCellUser.setPreferredSize(new java.awt.Dimension(310, 10));

        javax.swing.GroupLayout inputCellLayout = new javax.swing.GroupLayout(inputCell);
        inputCell.setLayout(inputCellLayout);
        inputCellLayout.setHorizontalGroup(
            inputCellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputCellOwner)
            .addComponent(SepCellUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCellUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inputCellLayout.setVerticalGroup(
            inputCellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputCellLayout.createSequentialGroup()
                .addComponent(lblCellUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(inputCellOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SepCellUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        Containe.add(inputCell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 310, 70));

        inputName.setBackground(new java.awt.Color(255, 255, 255));

        lblNameUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblNameUser.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblNameUser.setText("Nombre");

        inputNameOwner.setBackground(new java.awt.Color(255, 255, 255));
        inputNameOwner.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputNameOwner.setForeground(new java.awt.Color(204, 204, 204));
        inputNameOwner.setText("Nombre completo");
        inputNameOwner.setToolTipText("");
        inputNameOwner.setBorder(null);
        inputNameOwner.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNameOwnerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNameOwnerFocusLost(evt);
            }
        });

        SepNameUser.setForeground(new java.awt.Color(153, 153, 153));
        SepNameUser.setPreferredSize(new java.awt.Dimension(310, 10));

        javax.swing.GroupLayout inputNameLayout = new javax.swing.GroupLayout(inputName);
        inputName.setLayout(inputNameLayout);
        inputNameLayout.setHorizontalGroup(
            inputNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputNameOwner)
            .addComponent(SepNameUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblNameUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inputNameLayout.setVerticalGroup(
            inputNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputNameLayout.createSequentialGroup()
                .addComponent(lblNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(inputNameOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SepNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        Containe.add(inputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 310, 70));

        inputEmail.setBackground(new java.awt.Color(255, 255, 255));

        lblEmailUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEmailUser.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblEmailUser.setText("Correo");

        inputEmailOwner.setBackground(new java.awt.Color(255, 255, 255));
        inputEmailOwner.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputEmailOwner.setForeground(new java.awt.Color(204, 204, 204));
        inputEmailOwner.setText("Correo@email.com");
        inputEmailOwner.setToolTipText("");
        inputEmailOwner.setBorder(null);
        inputEmailOwner.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputEmailOwnerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputEmailOwnerFocusLost(evt);
            }
        });

        SepEmailUser.setForeground(new java.awt.Color(153, 153, 153));
        SepEmailUser.setPreferredSize(new java.awt.Dimension(310, 10));

        javax.swing.GroupLayout inputEmailLayout = new javax.swing.GroupLayout(inputEmail);
        inputEmail.setLayout(inputEmailLayout);
        inputEmailLayout.setHorizontalGroup(
            inputEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputEmailOwner)
            .addComponent(SepEmailUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblEmailUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inputEmailLayout.setVerticalGroup(
            inputEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputEmailLayout.createSequentialGroup()
                .addComponent(lblEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(inputEmailOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SepEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        Containe.add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 310, 70));

        inputUser1.setBackground(new java.awt.Color(255, 255, 255));

        lblUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblUser.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblUser.setText("Cédula");

        inputIDCard.setBackground(new java.awt.Color(255, 255, 255));
        inputIDCard.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputIDCard.setForeground(new java.awt.Color(204, 204, 204));
        inputIDCard.setText("Introduzca el número de documento");
        inputIDCard.setToolTipText("");
        inputIDCard.setBorder(null);
        inputIDCard.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIDCardFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputIDCardFocusLost(evt);
            }
        });
        inputIDCard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputIDCardKeyTyped(evt);
            }
        });

        SepUser.setForeground(new java.awt.Color(153, 153, 153));
        SepUser.setPreferredSize(new java.awt.Dimension(310, 10));

        javax.swing.GroupLayout inputUser1Layout = new javax.swing.GroupLayout(inputUser1);
        inputUser1.setLayout(inputUser1Layout);
        inputUser1Layout.setHorizontalGroup(
            inputUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputIDCard)
            .addComponent(SepUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inputUser1Layout.setVerticalGroup(
            inputUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputUser1Layout.createSequentialGroup()
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(inputIDCard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SepUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        Containe.add(inputUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 310, 70));

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
            .addComponent(lblBtnOwner, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnOwnerLayout.setVerticalGroup(
            btnOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnOwner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Containe.add(btnOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Motortech.jpg"))); // NOI18N
        Containe.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, -1));

        lblCellUser1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCellUser1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblCellUser1.setText("Dirección");
        Containe.add(lblCellUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 290, -1));

        SepCellUser1.setForeground(new java.awt.Color(153, 153, 153));
        SepCellUser1.setPreferredSize(new java.awt.Dimension(310, 10));
        Containe.add(SepCellUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 290, -1));

        inputAdressOwner.setBackground(new java.awt.Color(255, 255, 255));
        inputAdressOwner.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputAdressOwner.setForeground(new java.awt.Color(204, 204, 204));
        inputAdressOwner.setText("Dirección  de residencia");
        inputAdressOwner.setToolTipText("");
        inputAdressOwner.setBorder(null);
        inputAdressOwner.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputAdressOwnerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputAdressOwnerFocusLost(evt);
            }
        });
        Containe.add(inputAdressOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 290, 30));

        lblCancel.setBackground(new java.awt.Color(255, 255, 255));
        lblCancel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCancel.setForeground(new java.awt.Color(0, 0, 0));
        lblCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancel.setText("Cancelar");
        lblCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblCancelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblCancelFocusLost(evt);
            }
        });
        lblCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelMouseClicked(evt);
            }
        });
        Containe.add(lblCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 70, 30));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnClosecloseWindow(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnClosecloseWindow
        getNewOwnerController().CloseView();
    }//GEN-LAST:event_lblBtnClosecloseWindow

    private void lblBtnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCloseMouseEntered
        btnCloseMouseEntered(evt);
    }//GEN-LAST:event_lblBtnCloseMouseEntered

    private void lblBtnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCloseMouseExited
        btnCloseMouseExited(evt);
    }//GEN-LAST:event_lblBtnCloseMouseExited

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnClose.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_btnCloseMouseExited

    private void lblBtnMinimizeminimizeWinodw(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnMinimizeminimizeWinodw
        Views.minimizeWindows(this);
    }//GEN-LAST:event_lblBtnMinimizeminimizeWinodw

    private void barWindowmoveWindow(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barWindowmoveWindow
        Views.moveWindows(this, evt, xMouse, yMouse);
    }//GEN-LAST:event_barWindowmoveWindow

    private void barWindowpressWindow(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barWindowpressWindow
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barWindowpressWindow

    private void inputCellOwnerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCellOwnerFocusGained
        Inputs.inputTextFocus(inputCellOwner, textCellOwner);
    }//GEN-LAST:event_inputCellOwnerFocusGained

    private void inputCellOwnerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCellOwnerFocusLost
        Inputs.inputTextFocus(inputCellOwner, textCellOwner, true);
    }//GEN-LAST:event_inputCellOwnerFocusLost

    private void inputNameOwnerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNameOwnerFocusGained
        Inputs.inputTextFocus(inputNameOwner, textNameOwner);
    }//GEN-LAST:event_inputNameOwnerFocusGained

    private void inputNameOwnerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNameOwnerFocusLost
        Inputs.inputTextFocus(inputNameOwner, textNameOwner, true);
    }//GEN-LAST:event_inputNameOwnerFocusLost

    private void inputEmailOwnerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEmailOwnerFocusGained
        Inputs.inputTextFocus(inputEmailOwner, textEmailOwner);
    }//GEN-LAST:event_inputEmailOwnerFocusGained

    private void inputEmailOwnerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEmailOwnerFocusLost
        Inputs.inputTextFocus(inputEmailOwner, textEmailOwner, true);
    }//GEN-LAST:event_inputEmailOwnerFocusLost

    private void inputIDCardFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIDCardFocusGained
        Inputs.inputTextFocus(inputIDCard, textIDCard);
    }//GEN-LAST:event_inputIDCardFocusGained

    private void inputIDCardFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIDCardFocusLost
        Inputs.inputTextFocus(inputIDCard, textIDCard, true);
    }//GEN-LAST:event_inputIDCardFocusLost

    private void lblBtnOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnOwnerMouseClicked
        String title = "MotorTect - Registar usuario";

        if (!isEdit) {
            if (textAdressOwner.equals(inputAdressOwner.getText())) {
                Inputs.dialogMessageDialog(this, inputAdressOwner, title, "La direcccón no puede estar vacía");
                return;
            }

            if (textNameOwner.equals(inputNameOwner.getText())) {
                Inputs.dialogMessageDialog(this, inputNameOwner, title, "El nombre no puede estar vacío");
                return;
            }

            if (inputCellOwner.getText().equals(textCellOwner)) {
                Inputs.dialogMessageDialog(this, inputCellOwner, title, "El campo del celular no puede estar vacío");
                return;
            }

            if (textEmailOwner.equals(inputEmailOwner.getText())) {
                Inputs.dialogMessageDialog(this, inputEmailOwner, title, "El correo electronico no puede estar vacío");
                return;
            }

            if (textIDCard.equals(inputIDCard.getText())) {
                Inputs.dialogMessageDialog(this, inputIDCard, title, "El número de cédula es obligatorio");
                return;
            }
        }

        this.getNewOwnerController().Action();
    }//GEN-LAST:event_lblBtnOwnerMouseClicked

    private void lblBtnOwnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnOwnerMouseEntered
        lblBtnOwner.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_lblBtnOwnerMouseEntered

    private void lblBtnOwnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnOwnerMouseExited
        lblBtnOwner.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblBtnOwnerMouseExited

    private void inputAdressOwnerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputAdressOwnerFocusGained
        Inputs.inputTextFocus(inputAdressOwner, textAdressOwner);
    }//GEN-LAST:event_inputAdressOwnerFocusGained

    private void inputAdressOwnerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputAdressOwnerFocusLost
        Inputs.inputTextFocus(inputAdressOwner, textAdressOwner, true);
    }//GEN-LAST:event_inputAdressOwnerFocusLost

    private void lblCancelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblCancelFocusGained
        lblCancel.setForeground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblCancelFocusGained

    private void lblCancelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblCancelFocusLost
        lblCancel.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblCancelFocusLost

    private void lblCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelMouseClicked
        getNewOwnerController().CloseView();
    }//GEN-LAST:event_lblCancelMouseClicked

    private void inputIDCardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIDCardKeyTyped
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || Character.isDigit(c)) {
            return;
        }

        if (!Character.isDigit(c)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            return;
        }
    }//GEN-LAST:event_inputIDCardKeyTyped

    private void inputCellOwnerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCellOwnerKeyTyped
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || Character.isDigit(c)) {
            return;
        }

        if (!Character.isDigit(c)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            return;
        }
    }//GEN-LAST:event_inputCellOwnerKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Containe;
    private javax.swing.JSeparator SepCellUser;
    private javax.swing.JSeparator SepCellUser1;
    private javax.swing.JSeparator SepEmailUser;
    private javax.swing.JSeparator SepNameUser;
    private javax.swing.JSeparator SepUser;
    private javax.swing.JPanel barWindow;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnOwner;
    private javax.swing.JTextField inputAdressOwner;
    private javax.swing.JPanel inputCell;
    private javax.swing.JTextField inputCellOwner;
    private javax.swing.JPanel inputEmail;
    private javax.swing.JTextField inputEmailOwner;
    private javax.swing.JTextField inputIDCard;
    private javax.swing.JPanel inputName;
    private javax.swing.JTextField inputNameOwner;
    private javax.swing.JPanel inputUser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBtnClose;
    private javax.swing.JLabel lblBtnMinimize;
    private java.awt.Label lblBtnOwner;
    private javax.swing.JLabel lblCancel;
    private java.awt.Label lblCellUser;
    private java.awt.Label lblCellUser1;
    private java.awt.Label lblEmailUser;
    private java.awt.Label lblNameUser;
    private java.awt.Label lblUser;
    private java.awt.Label titleWindow;
    // End of variables declaration//GEN-END:variables

}
