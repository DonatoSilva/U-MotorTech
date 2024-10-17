package igu;

import controller.SignUpController;
import controller.UsersController;
import dao.UserDAO;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import motortech.Inputs;
import motortech.MotorTech;
import motortech.Views;

public class ViewUsers extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    private String textSearch;
    private UsersController usersController;

    public ViewUsers() {
        initComponents();

        this.textSearch = inputSearch.getText();
    }

    public UsersController getUsersController() {
        return usersController;
    }

    public void setUsersController(UsersController usersController) {
        this.usersController = usersController;
    }

    public void addRow(Object[] rowData) {
        DefaultTableModel table = (DefaultTableModel) tableUsers.getModel();
        table.addRow(rowData);
    }

    public void removeRow(int row) {
        DefaultTableModel table = (DefaultTableModel) tableUsers.getModel();
        table.removeRow(row);
    }

    public void resetTable() {
        DefaultTableModel table = (DefaultTableModel) tableUsers.getModel();
        table.setRowCount(0);
    }

    public void setEnabledTable(boolean a) {
        tableUsers.setEnabled(a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Container = new javax.swing.JPanel();
        btnHome = new javax.swing.JPanel();
        lblBtnHome = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnNewUser = new javax.swing.JPanel();
        lblNewUser = new javax.swing.JLabel();
        contentSearch = new javax.swing.JPanel();
        inputSearch = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        btnExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JPanel();
        lblMinimize = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOutSesion = new javax.swing.JPanel();
        lblOutSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        Container.setMinimumSize(new java.awt.Dimension(1000, 700));
        Container.setPreferredSize(new java.awt.Dimension(1000, 700));
        Container.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ContainerMouseDragged(evt);
            }
        });
        Container.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContainerMousePressed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });
        btnHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnHome.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnHome.setForeground(new java.awt.Color(0, 0, 0));
        lblBtnHome.setText("Inicio");
        lblBtnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnHome.add(lblBtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 90, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Motortech.jpg"))); // NOI18N

        btnNewUser.setBackground(new java.awt.Color(255, 255, 255));
        btnNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewUserMouseExited(evt);
            }
        });
        btnNewUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNewUser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNewUser.setForeground(new java.awt.Color(0, 0, 0));
        lblNewUser.setText("<html> Registrar <br> Usuario <html>");
        lblNewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNewUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNewUserMouseExited(evt);
            }
        });
        btnNewUser.add(lblNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        contentSearch.setBackground(new java.awt.Color(255, 255, 255));
        contentSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputSearch.setBackground(new java.awt.Color(255, 255, 255));
        inputSearch.setForeground(new java.awt.Color(204, 204, 204));
        inputSearch.setText("Buscar");
        inputSearch.setBorder(null);
        inputSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputSearchFocusLost(evt);
            }
        });
        inputSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputSearchKeyReleased(evt);
            }
        });
        contentSearch.add(inputSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 344, 30));
        contentSearch.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 344, 10));

        tableUsers.setBackground(new java.awt.Color(255, 255, 255));
        tableUsers.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Usuario", "Correo", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUsers.setGridColor(new java.awt.Color(238, 238, 238));
        tableUsers.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tableUsers.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableUsers.setShowGrid(false);
        tableUsers.setShowHorizontalLines(true);
        tableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsersMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableUsers);
        if (tableUsers.getColumnModel().getColumnCount() > 0) {
            tableUsers.getColumnModel().getColumn(0).setResizable(false);
            tableUsers.getColumnModel().getColumn(1).setResizable(false);
            tableUsers.getColumnModel().getColumn(2).setResizable(false);
            tableUsers.getColumnModel().getColumn(3).setResizable(false);
        }

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
            .addComponent(lblExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
                .addComponent(lblMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnMinimizeLayout.setVerticalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMinimizeLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("la busca se realizara por numero telefonico del usuario");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Listado de usuarios");

        btnOutSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnOutSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOutSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOutSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOutSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOutSesionMouseExited(evt);
            }
        });
        btnOutSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOutSesion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblOutSesion.setForeground(new java.awt.Color(0, 0, 0));
        lblOutSesion.setText("Cerrar Sesion");
        lblOutSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOutSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOutSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOutSesionMouseExited(evt);
            }
        });
        btnOutSesion.add(lblOutSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, -1));

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOutSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 615, Short.MAX_VALUE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(contentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3))
                        .addContainerGap())))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 524, Short.MAX_VALUE)
                        .addComponent(btnNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOutSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnMinimize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addGap(15, 15, 15))
        );

        jScrollPane1.setViewportView(Container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnHomeMouseClicked
        btnHomeMouseClicked(evt);
    }//GEN-LAST:event_lblBtnHomeMouseClicked

    private void lblBtnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnHomeMouseEntered
        btnHomeMouseEntered(evt);
    }//GEN-LAST:event_lblBtnHomeMouseEntered

    private void lblBtnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnHomeMouseExited
        btnHomeMouseExited(evt);
    }//GEN-LAST:event_lblBtnHomeMouseExited

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        usersController.btnHomeMouseClicked();
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        lblBtnHome.setForeground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        lblBtnHome.setForeground(Color.black);
    }//GEN-LAST:event_btnHomeMouseExited

    private void lblNewUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewUserMouseClicked
        btnNewUserMouseClicked(evt);
    }//GEN-LAST:event_lblNewUserMouseClicked

    private void lblNewUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewUserMouseEntered
        btnNewUserMouseEntered(evt);
    }//GEN-LAST:event_lblNewUserMouseEntered

    private void lblNewUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewUserMouseExited
        btnNewUserMouseExited(evt);
    }//GEN-LAST:event_lblNewUserMouseExited

    private void btnNewUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewUserMouseClicked
        ViewNewSignUp signUp = new ViewNewSignUp(true);
        UserDAO userDAO = new UserDAO();
        SignUpController signController = new SignUpController();
        signController.SignUpController(signUp, userDAO, this);
    }//GEN-LAST:event_btnNewUserMouseClicked

    private void btnNewUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewUserMouseEntered
        lblNewUser.setForeground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_btnNewUserMouseEntered

    private void btnNewUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewUserMouseExited
        lblNewUser.setForeground(Color.black);
    }//GEN-LAST:event_btnNewUserMouseExited

    private void inputSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputSearchFocusGained
        Inputs.inputTextFocus(inputSearch, textSearch);
    }//GEN-LAST:event_inputSearchFocusGained

    private void inputSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputSearchFocusLost
        Inputs.inputTextFocus(inputSearch, textSearch, true);
    }//GEN-LAST:event_inputSearchFocusLost

    private void tableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsersMouseClicked
        usersController.tableUserMouseClicked(evt);
    }//GEN-LAST:event_tableUsersMouseClicked

    private void lblExitcloseApp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitcloseApp
        Views.closeWindows();
    }//GEN-LAST:event_lblExitcloseApp

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        btnExit.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        btnExit.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblExitMouseExited

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        btnMinimizeminimizeApp(evt);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void btnMinimizeminimizeApp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeminimizeApp
        Views.minimizeWindows(this);
    }//GEN-LAST:event_btnMinimizeminimizeApp

    private void lblOutSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOutSesionMouseClicked
        btnOutSesionMouseClicked(evt);
    }//GEN-LAST:event_lblOutSesionMouseClicked

    private void lblOutSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOutSesionMouseEntered
        lblOutSesion.setForeground(Color.red);
    }//GEN-LAST:event_lblOutSesionMouseEntered

    private void lblOutSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOutSesionMouseExited
        btnOutSesionMouseExited(evt);
    }//GEN-LAST:event_lblOutSesionMouseExited

    private void btnOutSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOutSesionMouseClicked
        usersController.btnOutSesionMouseClicked(evt);
    }//GEN-LAST:event_btnOutSesionMouseClicked

    private void btnOutSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOutSesionMouseEntered
        lblOutSesionMouseEntered(evt);
    }//GEN-LAST:event_btnOutSesionMouseEntered

    private void btnOutSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOutSesionMouseExited
        lblOutSesion.setForeground(Color.black);
    }//GEN-LAST:event_btnOutSesionMouseExited

    private void ContainerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContainerMouseDragged
        Views.moveWindows(this, evt, xMouse, yMouse);
    }//GEN-LAST:event_ContainerMouseDragged

    private void ContainerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContainerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_ContainerMousePressed

    private void inputSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSearchKeyReleased
        UsersController usersController = this.getUsersController();
        
        String phone = inputSearch.getText().trim();
        usersController.searchUsersByPhone(phone);
    }//GEN-LAST:event_inputSearchKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JPanel btnNewUser;
    private javax.swing.JPanel btnOutSesion;
    private javax.swing.JPanel contentSearch;
    public javax.swing.JTextField inputSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBtnHome;
    private javax.swing.JLabel lblExit;
    private java.awt.Label lblMinimize;
    private javax.swing.JLabel lblNewUser;
    private javax.swing.JLabel lblOutSesion;
    private javax.swing.JLabel lblTitle;
    private static javax.swing.JTable tableUsers;
    // End of variables declaration//GEN-END:variables
}
