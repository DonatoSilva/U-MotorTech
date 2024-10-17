package igu;

import java.awt.Color;
import motortech.Inputs;
import motortech.MotorTech;
import motortech.Views;

public class ViewOwners extends javax.swing.JFrame {
    MotorTech motorTech;
    
    private int xMouse;
    private int yMouse;
    
    private String textSearch;
    private Home home;

    public ViewOwners(Home callerFrame) {
        initComponents();
        
        lblTitle.requestFocus();
        textSearch = inputSearch.getText();
        home = callerFrame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Container = new javax.swing.JPanel();
        btnHome = new javax.swing.JPanel();
        lblBtnHome = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        contentSearch = new javax.swing.JPanel();
        inputSearch = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnSearch = new javax.swing.JPanel();
        lblBtnSearch = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableWork = new javax.swing.JTable();
        btnExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JPanel();
        lblMinimize = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNewOwner = new javax.swing.JPanel();
        lblBtnNewOwner = new javax.swing.JLabel();

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
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Container.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 51, 101, 36));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Motortech.jpg"))); // NOI18N
        Container.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 15, -1, -1));

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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputSearchKeyPressed(evt);
            }
        });
        contentSearch.add(inputSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 344, 30));
        contentSearch.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 344, 10));

        Container.add(contentSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 7, 389, -1));

        btnSearch.setBackground(new java.awt.Color(0, 153, 153));
        btnSearch.setMinimumSize(new java.awt.Dimension(76, 35));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnSearch.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnSearch.setText("Buscar");
        lblBtnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnSearch.setPreferredSize(new java.awt.Dimension(55, 35));
        lblBtnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnSearchMouseExited(evt);
            }
        });
        btnSearch.add(lblBtnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Container.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 7, -1, -1));

        tableWork.setBackground(new java.awt.Color(255, 255, 255));
        tableWork.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tableWork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Cédula", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableWork.setGridColor(new java.awt.Color(238, 238, 238));
        tableWork.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tableWork.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableWork.setShowGrid(false);
        tableWork.setShowHorizontalLines(true);
        tableWork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableWorkMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableWork);

        Container.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 107, 860, 577));

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

        Container.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 7, -1, -1));

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

        Container.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 7, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("la busca se realizara por cédula del propietario");
        Container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 47, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Listado de propietarios");
        Container.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 79, 218, 28));

        btnNewOwner.setBackground(new java.awt.Color(255, 255, 255));
        btnNewOwner.setForeground(new java.awt.Color(0, 0, 0));
        btnNewOwner.setMinimumSize(new java.awt.Dimension(76, 35));
        btnNewOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewOwnerMouseClicked(evt);
            }
        });
        btnNewOwner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnNewOwner.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnNewOwner.setForeground(new java.awt.Color(0, 0, 0));
        lblBtnNewOwner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnNewOwner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-circular-plus (1).png"))); // NOI18N
        lblBtnNewOwner.setText("Crear Propietario");
        lblBtnNewOwner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnNewOwner.setPreferredSize(new java.awt.Dimension(55, 35));
        lblBtnNewOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnNewOwnerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnNewOwnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnNewOwnerMouseExited(evt);
            }
        });
        btnNewOwner.add(lblBtnNewOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        Container.add(btnNewOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 133, -1));

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
        Views.openWindows(home, this);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        lblBtnHome.setForeground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        lblBtnHome.setForeground(Color.black);
    }//GEN-LAST:event_btnHomeMouseExited

    private void inputSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputSearchFocusGained
        Inputs.inputTextFocus(inputSearch, textSearch);
    }//GEN-LAST:event_inputSearchFocusGained

    private void inputSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputSearchFocusLost
        Inputs.inputTextFocus(inputSearch, textSearch, true);
    }//GEN-LAST:event_inputSearchFocusLost

    private void inputSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSearchKeyPressed
        if (evt.getKeyCode() == 10) {
            inputSearch.setText("");
        }
    }//GEN-LAST:event_inputSearchKeyPressed

    private void tableWorkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableWorkMouseClicked
        tableWork.setEnabled(false);
        if (evt.getClickCount() == 2) {

            ViewOwner viewWork = new ViewOwner(this);
            tableWork.setEnabled(true);
            Views.openWindows(viewWork, this);
        }
    }//GEN-LAST:event_tableWorkMouseClicked

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

    private void lblBtnNewOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnNewOwnerMouseClicked
        btnNewOwnerMouseClicked(evt);
    }//GEN-LAST:event_lblBtnNewOwnerMouseClicked

    private void lblBtnNewOwnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnNewOwnerMouseEntered
        lblBtnNewOwner.setForeground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblBtnNewOwnerMouseEntered

    private void lblBtnNewOwnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnNewOwnerMouseExited
        lblBtnNewOwner.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblBtnNewOwnerMouseExited

    private void btnNewOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewOwnerMouseClicked
        ViewNewOwner newOwner = new ViewNewOwner(true);
        Views.openWindows(newOwner);
    }//GEN-LAST:event_btnNewOwnerMouseClicked

    private void ContainerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContainerMouseDragged
        Views.moveWindows(this, evt, xMouse, yMouse);
    }//GEN-LAST:event_ContainerMouseDragged

    private void ContainerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContainerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_ContainerMousePressed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        inputSearch.setText("");
    }//GEN-LAST:event_btnSearchMouseClicked

    private void lblBtnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSearchMouseExited
        btnSearch.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblBtnSearchMouseExited

    private void lblBtnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSearchMouseEntered
        btnSearch.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_lblBtnSearchMouseEntered

    private void lblBtnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSearchMouseClicked
        btnSearchMouseClicked(evt);
    }//GEN-LAST:event_lblBtnSearchMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JPanel btnNewOwner;
    private javax.swing.JPanel btnSearch;
    private javax.swing.JPanel contentSearch;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBtnHome;
    private javax.swing.JLabel lblBtnNewOwner;
    private javax.swing.JLabel lblBtnSearch;
    private javax.swing.JLabel lblExit;
    private java.awt.Label lblMinimize;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tableWork;
    // End of variables declaration//GEN-END:variables
}
