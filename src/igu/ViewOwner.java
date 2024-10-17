package igu;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import motortech.MotorTech;
import motortech.Views;

public class ViewOwner extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    private JFrame callerOrigin;

    public ViewOwner() {
        initComponents();
    }

    public ViewOwner(JFrame callerOrigin) {
        initComponents();
        this.callerOrigin = callerOrigin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JPanel();
        lblMinimize = new java.awt.Label();
        btnExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        btnDelete = new javax.swing.JPanel();
        lblBtnDelete = new javax.swing.JLabel();
        btnPrev = new javax.swing.JPanel();
        lblBtnPrev = new javax.swing.JLabel();
        lblBtnEditar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableWork = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        Container.setForeground(new java.awt.Color(0, 0, 0));
        Container.setMinimumSize(new java.awt.Dimension(900, 600));
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

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Correo");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("colorAlpino@gmail.com");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, -1));

        Container.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 89, 169, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Dirección");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Carrea 8 # 10 - 32");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        Container.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 89, 169, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Nombre");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Leonardo alpino");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        Container.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 89, 169, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Cédula");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("1005251123");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        Container.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 124, 169, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Teléfono");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("3160548990");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        Container.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 124, 169, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Motortech.jpg"))); // NOI18N
        Container.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 16, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Listado de vehículos");
        Container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

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
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 17, Short.MAX_VALUE)
                .addContainerGap())
        );

        Container.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 8, -1, -1));

        btnExit.setBackground(new java.awt.Color(0, 153, 153));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setMaximumSize(new java.awt.Dimension(35, 35));
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
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Container.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 8, -1, 38));

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setPreferredSize(new java.awt.Dimension(100, 35));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnDelete.setBackground(new java.awt.Color(255, 102, 102));
        lblBtnDelete.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnDelete.setText("Eliminar");
        lblBtnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnDelete.setPreferredSize(new java.awt.Dimension(45, 35));
        lblBtnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnDeleteMouseExited(evt);
            }
        });
        btnDelete.add(lblBtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        Container.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 100, -1));

        btnPrev.setBackground(new java.awt.Color(255, 255, 255));
        btnPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrev.setPreferredSize(new java.awt.Dimension(80, 35));
        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrevMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrevMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrevMouseExited(evt);
            }
        });
        btnPrev.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnPrev.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnPrev.setForeground(new java.awt.Color(0, 0, 0));
        lblBtnPrev.setText("Volver");
        lblBtnPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnPrev.setPreferredSize(new java.awt.Dimension(40, 35));
        lblBtnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnPrevMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnPrevMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnPrevMouseExited(evt);
            }
        });
        btnPrev.add(lblBtnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 35));

        Container.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 80, 35));

        lblBtnEditar.setBackground(new java.awt.Color(0, 0, 0));
        lblBtnEditar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnEditar.setForeground(new java.awt.Color(0, 0, 0));
        lblBtnEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnEditar.setText("Editar");
        lblBtnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnEditar.setPreferredSize(new java.awt.Dimension(100, 35));
        lblBtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnEditarMouseExited(evt);
            }
        });
        Container.add(lblBtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Datos del Propetario");
        Container.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 58, -1, -1));

        tableWork.setBackground(new java.awt.Color(255, 255, 255));
        tableWork.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tableWork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Placa", "Tipo", "Targeta de propiedad"
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

        Container.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 880, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        btnMinimizeminimizeApp(evt);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void btnMinimizeminimizeApp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeminimizeApp
        Views.minimizeWindows(this);
    }//GEN-LAST:event_btnMinimizeminimizeApp

    private void lblExitcloseApp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitcloseApp
        Views.closeWindows();
    }//GEN-LAST:event_lblExitcloseApp

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        btnExit.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        btnExit.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblExitMouseExited

    private void lblBtnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnDeleteMouseClicked
        btnDeleteMouseClicked(evt);
    }//GEN-LAST:event_lblBtnDeleteMouseClicked

    private void lblBtnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnDeleteMouseEntered
        btnDeleteMouseEntered(evt);
    }//GEN-LAST:event_lblBtnDeleteMouseEntered

    private void lblBtnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnDeleteMouseExited
        btnDeleteMouseExited(evt);
    }//GEN-LAST:event_lblBtnDeleteMouseExited

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        String title = "MotorTech - Trabajo";
        String message = "Seguro quiere eliminar este propietario";
        int option = Views.showDialogDelete(this, title, message);

        if (option == 0) {
            Views.openWindows(callerOrigin, this);
        }

        return;
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(MotorTech.getbgRed());
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(MotorTech.getbgRedSelect());
    }//GEN-LAST:event_btnDeleteMouseExited

    private void lblBtnPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnPrevMouseClicked
        btnPrevMouseClicked(evt);
    }//GEN-LAST:event_lblBtnPrevMouseClicked

    private void lblBtnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnPrevMouseEntered
        btnPrevMouseEntered(evt);
    }//GEN-LAST:event_lblBtnPrevMouseEntered

    private void lblBtnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnPrevMouseExited
        btnPrevMouseExited(evt);
    }//GEN-LAST:event_lblBtnPrevMouseExited

    private void btnPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseClicked
        if (callerOrigin == null) {
            Home home = new Home();
            Views.openWindows(home, this);

            return;
        }

        Views.openWindows(callerOrigin, this);
    }//GEN-LAST:event_btnPrevMouseClicked

    private void btnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseEntered
        lblBtnPrev.setForeground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_btnPrevMouseEntered

    private void btnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseExited
        lblBtnPrev.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnPrevMouseExited

    private void lblBtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEditarMouseClicked
        ViewNewOwner newOwner = new ViewNewOwner(true);

        Views.openWindows(newOwner);
    }//GEN-LAST:event_lblBtnEditarMouseClicked

    private void lblBtnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEditarMouseEntered
        lblBtnEditar.setForeground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblBtnEditarMouseEntered

    private void lblBtnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEditarMouseExited
        lblBtnEditar.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblBtnEditarMouseExited

    private void tableWorkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableWorkMouseClicked
        tableWork.setEnabled(false);
        if (evt.getClickCount() == 2) {

            int opcion = JOptionPane.showOptionDialog(
                    this,
                    "¿Seleccione lo que desea hacaer con este propietario?",
                    "MotorTech - Usuario",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    new String[]{"Cancelar", "Eliminar", "Editar"},
                    "Cancelar"
            );

            if (opcion == 0) {
                return;
            }

            if (opcion == 2) {
                ViewNewAutomobile automobile = new ViewNewAutomobile(true);
                Views.openWindows(automobile);
                return;
            }

            int deleteModal = JOptionPane.showOptionDialog(
                    this,
                    "¿Seguro que desea eliminar este propietario?",
                    "MotorTech - Usuario",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    new String[]{"Cancelar", "Eliminar"},
                    "Cancelar"
            );

            if (deleteModal == 0) {
                return;
            }

            return;
        }
    }//GEN-LAST:event_tableWorkMouseClicked

    private void ContainerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContainerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_ContainerMousePressed

    private void ContainerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContainerMouseDragged
        Views.moveWindows(this, evt, xMouse, yMouse);
    }//GEN-LAST:event_ContainerMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel btnDelete;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JPanel btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBtnDelete;
    private javax.swing.JLabel lblBtnEditar;
    private javax.swing.JLabel lblBtnPrev;
    private javax.swing.JLabel lblExit;
    private java.awt.Label lblMinimize;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tableWork;
    // End of variables declaration//GEN-END:variables
}
