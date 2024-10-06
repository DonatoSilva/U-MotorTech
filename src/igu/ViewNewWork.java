package igu;

import java.awt.Color;
import javax.swing.JFrame;
import motortech.Inputs;
import motortech.MotorTech;
import motortech.Views;

public class ViewNewWork extends javax.swing.JFrame {
    private int xMouse;
    private int yMouse;
    
    private String textCedula;
    private String textPlaca;
    private JFrame callerOrigin;
    
    public ViewNewWork(JFrame callerOriginFrame) {
        initComponents();
        
        callerOrigin = callerOriginFrame;
        initInput();
    }
    
    public ViewNewWork() {
        initComponents();
        initInput();
    }
    
    private void initInput() {
        textCedula = inputCedula.getText();
        textPlaca = inputPlaca.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JPanel();
        lblMinimize = new java.awt.Label();
        btnPrev = new javax.swing.JPanel();
        lblBtnPrev = new javax.swing.JLabel();
        btnEnd = new javax.swing.JPanel();
        lblBtnEnd = new javax.swing.JLabel();
        ContainerInputs = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNameUser = new java.awt.Label();
        inputCedula = new javax.swing.JTextField();
        SepNameUser = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        inputPlaca = new javax.swing.JTextField();
        lblNameUser1 = new java.awt.Label();
        btnAutoSearch = new javax.swing.JPanel();
        lblAutoSearch = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SepNameUser1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        btnNewAutomobile = new javax.swing.JPanel();
        lblNewAutomobile = new javax.swing.JLabel();
        btnNewOwner = new javax.swing.JPanel();
        lblNewOwner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 600));
        setResizable(false);

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        Container.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Container.setPreferredSize(new java.awt.Dimension(1200, 600));
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

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Motortech.jpg"))); // NOI18N

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
        lblMinimize.setMinimumSize(new java.awt.Dimension(35, 35));
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
            .addComponent(lblMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
        btnMinimizeLayout.setVerticalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnPrev.setBackground(new java.awt.Color(255, 255, 255));
        btnPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        lblBtnPrev.setText("Cancelar");
        lblBtnPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnPrev.add(lblBtnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnEnd.setBackground(new java.awt.Color(0, 153, 153));
        btnEnd.setForeground(new java.awt.Color(255, 255, 255));
        btnEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnd.setPreferredSize(new java.awt.Dimension(100, 35));
        btnEnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEndMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEndMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEndMouseExited(evt);
            }
        });
        btnEnd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnEnd.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnEnd.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnEnd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnEnd.setText("Guardar");
        lblBtnEnd.setToolTipText("");
        lblBtnEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnEnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnEndMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnEndMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnEndMouseExited(evt);
            }
        });
        btnEnd.add(lblBtnEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        ContainerInputs.setBackground(new java.awt.Color(255, 255, 255));
        ContainerInputs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione los motivos de ingreso");
        ContainerInputs.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        lblNameUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblNameUser.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblNameUser.setText("Cedula del propietario");
        ContainerInputs.add(lblNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        inputCedula.setBackground(new java.awt.Color(255, 255, 255));
        inputCedula.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputCedula.setForeground(new java.awt.Color(204, 204, 204));
        inputCedula.setText("Intriduzca la cedula completa");
        inputCedula.setToolTipText("");
        inputCedula.setBorder(null);
        inputCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCedulaFocusLost(evt);
            }
        });
        ContainerInputs.add(inputCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 310, 30));

        SepNameUser.setForeground(new java.awt.Color(153, 153, 153));
        SepNameUser.setPreferredSize(new java.awt.Dimension(310, 10));
        ContainerInputs.add(SepNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(80, 35));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContainerInputs.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Nombre");
        ContainerInputs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 60, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("---------- -----");
        ContainerInputs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Cédula");
        ContainerInputs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 70, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("----------");
        ContainerInputs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Dirección");
        ContainerInputs.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 70, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("---------");
        ContainerInputs.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Teléfono");
        ContainerInputs.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("---------");
        ContainerInputs.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Correo");
        ContainerInputs.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 90, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("-----------");
        ContainerInputs.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, -1));

        inputPlaca.setBackground(new java.awt.Color(255, 255, 255));
        inputPlaca.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        inputPlaca.setForeground(new java.awt.Color(204, 204, 204));
        inputPlaca.setText("Intriduzca la placa del vehículo");
        inputPlaca.setToolTipText("");
        inputPlaca.setBorder(null);
        inputPlaca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputPlacaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputPlacaFocusLost(evt);
            }
        });
        ContainerInputs.add(inputPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 310, 30));

        lblNameUser1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblNameUser1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblNameUser1.setText("Placa del vehículo");
        ContainerInputs.add(lblNameUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        btnAutoSearch.setBackground(new java.awt.Color(0, 153, 153));
        btnAutoSearch.setPreferredSize(new java.awt.Dimension(80, 35));

        lblAutoSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblAutoSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAutoSearch.setText("Buscar");

        javax.swing.GroupLayout btnAutoSearchLayout = new javax.swing.GroupLayout(btnAutoSearch);
        btnAutoSearch.setLayout(btnAutoSearchLayout);
        btnAutoSearchLayout.setHorizontalGroup(
            btnAutoSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAutoSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAutoSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAutoSearchLayout.setVerticalGroup(
            btnAutoSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAutoSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAutoSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContainerInputs.add(btnAutoSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, -1, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Datos del Propetario");
        ContainerInputs.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        SepNameUser1.setForeground(new java.awt.Color(153, 153, 153));
        SepNameUser1.setPreferredSize(new java.awt.Dimension(310, 10));
        ContainerInputs.add(SepNameUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Placa");
        ContainerInputs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 60, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("-----------------");
        ContainerInputs.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("----------------");
        ContainerInputs.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Número de targeta de propiedad");
        ContainerInputs.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 230, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Tipo");
        ContainerInputs.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 60, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("--------------");
        jLabel20.setToolTipText("");
        ContainerInputs.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 100, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Datos del Vehiculo");
        ContainerInputs.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Chapa y pintura ");
        ContainerInputs.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Mecánica en general ");
        ContainerInputs.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setText("Alineación y rotación de ruedas");
        ContainerInputs.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setText("Sistemas de suspensión");
        ContainerInputs.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox5.setText("Cambio de aceite ");
        ContainerInputs.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox6.setText("Reparación de llantas");
        ContainerInputs.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox7.setText("Servicio de frenos");
        ContainerInputs.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox8.setText("Aire acondicionado y calefacción");
        ContainerInputs.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        btnNewAutomobile.setBackground(new java.awt.Color(255, 255, 255));
        btnNewAutomobile.setPreferredSize(new java.awt.Dimension(80, 35));
        btnNewAutomobile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewAutomobileMouseClicked(evt);
            }
        });

        lblNewAutomobile.setForeground(new java.awt.Color(0, 0, 0));
        lblNewAutomobile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewAutomobile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-circular-plus (1).png"))); // NOI18N
        lblNewAutomobile.setText("Vehículo");
        lblNewAutomobile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNewAutomobile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewAutomobileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNewAutomobileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNewAutomobileMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnNewAutomobileLayout = new javax.swing.GroupLayout(btnNewAutomobile);
        btnNewAutomobile.setLayout(btnNewAutomobileLayout);
        btnNewAutomobileLayout.setHorizontalGroup(
            btnNewAutomobileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNewAutomobile, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnNewAutomobileLayout.setVerticalGroup(
            btnNewAutomobileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNewAutomobile, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        btnNewOwner.setBackground(new java.awt.Color(255, 255, 255));
        btnNewOwner.setPreferredSize(new java.awt.Dimension(80, 35));
        btnNewOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewOwnerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewOwnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewOwnerMouseExited(evt);
            }
        });

        lblNewOwner.setForeground(new java.awt.Color(0, 0, 0));
        lblNewOwner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewOwner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-circular-plus (1).png"))); // NOI18N
        lblNewOwner.setText("Propietario");
        lblNewOwner.setToolTipText("");
        lblNewOwner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNewOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewOwnerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNewOwnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNewOwnerMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnNewOwnerLayout = new javax.swing.GroupLayout(btnNewOwner);
        btnNewOwner.setLayout(btnNewOwnerLayout);
        btnNewOwnerLayout.setHorizontalGroup(
            btnNewOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNewOwner, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnNewOwnerLayout.setVerticalGroup(
            btnNewOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNewOwner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContainerInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 766, Short.MAX_VALUE)
                        .addComponent(btnNewOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewAutomobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ContainerInputs, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                        .addGap(13, 13, 13)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNewAutomobile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNewOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Nuevo ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void lblBtnEndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEndMouseClicked
        btnEndMouseClicked(evt);
    }//GEN-LAST:event_lblBtnEndMouseClicked

    private void lblBtnEndMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEndMouseEntered
        btnEndMouseEntered(evt);
    }//GEN-LAST:event_lblBtnEndMouseEntered

    private void lblBtnEndMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEndMouseExited
        btnEndMouseExited(evt);
    }//GEN-LAST:event_lblBtnEndMouseExited

    private void btnEndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEndMouseClicked
        callerOrigin.setVisible(true);
    }//GEN-LAST:event_btnEndMouseClicked

    private void btnEndMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEndMouseEntered
        btnEnd.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_btnEndMouseEntered

    private void btnEndMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEndMouseExited
        btnEnd.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_btnEndMouseExited

    private void ContainerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContainerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_ContainerMousePressed

    private void ContainerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContainerMouseDragged
        Views.moveWindows(this, evt, xMouse, yMouse);
    }//GEN-LAST:event_ContainerMouseDragged

    private void inputCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCedulaFocusGained
        Inputs.inputTextFocus(inputCedula, textCedula);
    }//GEN-LAST:event_inputCedulaFocusGained

    private void inputCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCedulaFocusLost
        Inputs.inputTextFocus(inputCedula, textCedula, true);
    }//GEN-LAST:event_inputCedulaFocusLost

    private void inputPlacaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPlacaFocusGained
        Inputs.inputTextFocus(inputPlaca, textPlaca);
    }//GEN-LAST:event_inputPlacaFocusGained

    private void inputPlacaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPlacaFocusLost
        Inputs.inputTextFocus(inputPlaca, textPlaca, true);
    }//GEN-LAST:event_inputPlacaFocusLost

    private void lblNewAutomobileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewAutomobileMouseClicked
        btnNewAutomobileMouseClicked(evt);
    }//GEN-LAST:event_lblNewAutomobileMouseClicked

    private void btnNewAutomobileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewAutomobileMouseClicked
        ViewNewAutomobile automobile = new ViewNewAutomobile(true);
        Views.openWindows(automobile);
    }//GEN-LAST:event_btnNewAutomobileMouseClicked

    private void lblNewAutomobileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewAutomobileMouseEntered
        lblNewAutomobile.setForeground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblNewAutomobileMouseEntered

    private void lblNewAutomobileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewAutomobileMouseExited
        lblNewAutomobile.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblNewAutomobileMouseExited

    private void lblNewOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewOwnerMouseClicked
        btnNewOwnerMouseClicked(evt);
    }//GEN-LAST:event_lblNewOwnerMouseClicked

    private void lblNewOwnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewOwnerMouseEntered
        lblNewOwner.setForeground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblNewOwnerMouseEntered

    private void lblNewOwnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewOwnerMouseExited
        lblNewOwner.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblNewOwnerMouseExited

    private void btnNewOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewOwnerMouseClicked
        ViewNewOwner newOwner  = new ViewNewOwner();
        Views.openWindows(newOwner);
    }//GEN-LAST:event_btnNewOwnerMouseClicked

    private void btnNewOwnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewOwnerMouseEntered
        lblNewOwnerMouseEntered(evt);
    }//GEN-LAST:event_btnNewOwnerMouseEntered

    private void btnNewOwnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewOwnerMouseExited
        lblNewOwnerMouseExited(evt);
    }//GEN-LAST:event_btnNewOwnerMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel ContainerInputs;
    private javax.swing.JSeparator SepNameUser;
    private javax.swing.JSeparator SepNameUser1;
    private javax.swing.JPanel btnAutoSearch;
    private javax.swing.JPanel btnEnd;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JPanel btnNewAutomobile;
    private javax.swing.JPanel btnNewOwner;
    private javax.swing.JPanel btnPrev;
    private javax.swing.JTextField inputCedula;
    private javax.swing.JTextField inputPlaca;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAutoSearch;
    private javax.swing.JLabel lblBtnEnd;
    private javax.swing.JLabel lblBtnPrev;
    private javax.swing.JLabel lblExit;
    private java.awt.Label lblMinimize;
    private java.awt.Label lblNameUser;
    private java.awt.Label lblNameUser1;
    private javax.swing.JLabel lblNewAutomobile;
    private javax.swing.JLabel lblNewOwner;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
