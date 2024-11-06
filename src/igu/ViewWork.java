package igu;

import controller.WorkController;
import java.awt.Color;
import motortech.MotorTech;
import motortech.Views;

public class ViewWork extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;
    
    private WorkController workController = null;
    
    public ViewWork() {
        initComponents();
    }

    public WorkController getWorkController() {
        return workController;
    }

    public void setWorkController(WorkController workController) {
        this.workController = workController;
    }
    
    public void setTextHours(String hours){
        lblHours.setText(hours + " hs");
    }
    
    public void setTextHandCost(String cost){
        lblHandCost.setText("<html> <strong>Manos de obra: </strong>" + cost + "</html>");
    }
    
    public void setTextSpareParts(String cost){
        lblSpareParts.setText("<html> <strong>Repuestos: </strong>" + cost + "</html>");
    }
    
    public void setTextTotal(String total){
        lblTotal.setText("Total a pagar: " + total);
    }
    
    public void setTextID(String ID){
        lblID.setText("ID: " + ID);
    }
    
    public void setTextName(String name){
        lblName.setText(name);
    }
    
    public void setTextIdCard(String idCard){
        lblIdCard.setText(idCard);
    }
    
    public void setTextAddres(String addres){
        lblAddres.setText(addres);
    }
    
    public void setTextCell(String cell){
        lblCell.setText(cell);
    }
    
    public void setTextEmail(String email){
        lblEmail.setText(email);
    }
    
    public void setTextPlaca(String placa){
        lblPlaca.setText(placa);
    }
    
    public void setTextType(String type){
        lblType.setText(type);
    }
    
    public void setTextStateAuto(String state){
        lblStateAuto.setText(state);
    }
    
    public void setTextTnumber(String tNumber){
        lblTNumber.setText(tNumber);
    }
    
    public void setTextReason(String reason){
        lblReason.setText(reason);
    }
    
    public void setTextInDate(String date){
        lblInDate.setText(date);
    }
    
    public void setTextStatus(String status){
        lblStatus.setText(status);
    }
    
    public void setTextOutDate(String date){
        lblOutDate.setText(date);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Container = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JPanel();
        lblMinimize = new java.awt.Label();
        btnExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        btnPrev = new javax.swing.JPanel();
        lblBtnPrev = new javax.swing.JLabel();
        btnEnd = new javax.swing.JPanel();
        lblBtnEnd = new javax.swing.JLabel();
        btnDelete = new javax.swing.JPanel();
        lblBtnDelete = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblIdCard = new javax.swing.JLabel();
        lblBtnEditar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblCell = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblAddres = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        lblStateAuto = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        lblInDate = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        lblOutDate = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        lblHours = new javax.swing.JLabel();
        btnHours = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        lblSpareParts = new javax.swing.JLabel();
        lblHandCost = new javax.swing.JLabel();
        btnSpareParts = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTNumber = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblReason = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setUndecorated(true);
        setResizable(false);

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        Container.setMinimumSize(new java.awt.Dimension(850, 600));
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
            .addComponent(lblExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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
        lblBtnPrev.setText("Volver");
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

        btnEnd.setBackground(new java.awt.Color(204, 204, 204));
        btnEnd.setForeground(new java.awt.Color(255, 255, 255));
        btnEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEnd.setPreferredSize(new java.awt.Dimension(100, 35));
        btnEnd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnEnd.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBtnEnd.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnEnd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnEnd.setText("Terminar");
        lblBtnEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnd.add(lblBtnEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

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
        lblBtnDelete.setPreferredSize(new java.awt.Dimension(100, 35));
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
        btnDelete.add(lblBtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Datos del Propetario");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Datos del Vehiculo");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Datos de la mecanica");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        lblName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Leonardo alpino");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Cédula");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        lblIdCard.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIdCard.setForeground(new java.awt.Color(0, 0, 0));
        lblIdCard.setText("1005251123");
        jPanel2.add(lblIdCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Teléfono");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        lblCell.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCell.setForeground(new java.awt.Color(0, 0, 0));
        lblCell.setText("3160548990");
        jPanel4.add(lblCell, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Dirección");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        lblAddres.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblAddres.setForeground(new java.awt.Color(0, 0, 0));
        lblAddres.setText("Carrea 8 # 10 - 32");
        jPanel5.add(lblAddres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Correo");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("colorAlpino@gmail.com");
        jPanel6.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 310, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Placa");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        lblPlaca.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(0, 0, 0));
        lblPlaca.setText("QOD59F");
        jPanel7.add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Tipo");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblType.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblType.setForeground(new java.awt.Color(0, 0, 0));
        lblType.setText("Camioneta");
        jPanel8.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Estado del vehiculo");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        lblStateAuto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblStateAuto.setForeground(new java.awt.Color(0, 0, 0));
        lblStateAuto.setText("Regular");
        jPanel9.add(lblStateAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Fecha ingreso");
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        lblInDate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblInDate.setForeground(new java.awt.Color(0, 0, 0));
        lblInDate.setText("12 Sep 2024");
        jPanel11.add(lblInDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 9, -1, 20));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Fecha entrega");
        jPanel12.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        lblOutDate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblOutDate.setForeground(new java.awt.Color(0, 0, 0));
        lblOutDate.setText("15 Sep 2024");
        jPanel12.add(lblOutDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Horas de trabajo");
        jPanel13.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblHours.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblHours.setForeground(new java.awt.Color(0, 0, 0));
        lblHours.setText("15 hs");
        jPanel13.add(lblHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 150, 30));

        btnHours.setText("Cambiar");
        btnHours.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHoursMouseClicked(evt);
            }
        });
        jPanel13.add(btnHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 50, 40));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Costo del servicio");
        jPanel14.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        lblSpareParts.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblSpareParts.setForeground(new java.awt.Color(0, 0, 0));
        lblSpareParts.setText("<html> <strong>Repuestos:  </strong> 250.000</html>");
        jPanel14.add(lblSpareParts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 30));

        lblHandCost.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblHandCost.setForeground(new java.awt.Color(0, 0, 0));
        lblHandCost.setText("<html> <strong>Manos de obra:  </strong> 450.000</html>");
        jPanel14.add(lblHandCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 190, 30));

        btnSpareParts.setText("Cambiar");
        btnSpareParts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSpareParts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSparePartsMouseClicked(evt);
            }
        });
        jPanel14.add(btnSpareParts, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 60, 30));

        lblStatus.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 51, 102));
        lblStatus.setText("TERMINADO");
        lblStatus.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true), javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        lblID.setText("ID: 01");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Número de tarjeta de propiedad");

        lblTNumber.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTNumber.setForeground(new java.awt.Color(0, 0, 0));
        lblTNumber.setText("15555480000");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Motivo de ingreso:");

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total a pagar:  $700.000");

        lblReason.setEditable(false);
        lblReason.setBackground(new java.awt.Color(255, 255, 255));
        lblReason.setColumns(20);
        lblReason.setForeground(new java.awt.Color(0, 0, 0));
        lblReason.setLineWrap(true);
        lblReason.setRows(5);
        lblReason.setFocusable(false);
        lblReason.setOpaque(false);
        jScrollPane1.setViewportView(lblReason);

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(83, 83, 83)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(lblTNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblID)
                                    .addComponent(lblStatus))
                                .addGap(185, 185, 185))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContainerLayout.createSequentialGroup()
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContainerLayout.createSequentialGroup()
                                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ContainerLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel3)
                                                .addGap(35, 35, 35))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContainerLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContainerLayout.createSequentialGroup()
                                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ContainerLayout.createSequentialGroup()
                                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(721, 721, 721)
                                        .addComponent(lblBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(867, 867, 867)
                                .addComponent(lblTotal)))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblTitle))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblStatus)))
                .addGap(68, 68, 68)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblTNumber))
                            .addComponent(jLabel8)))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel22)
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(lblTotal)))
                        .addGap(32, 32, 32)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );

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

        getAccessibleContext().setAccessibleName("Ver Trabajo");
        getAccessibleContext().setAccessibleDescription("Se encuentran los detalles del trabajo ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContainerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContainerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_ContainerMousePressed

    private void ContainerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContainerMouseDragged
        Views.moveWindows(this, evt, xMouse, yMouse);
    }//GEN-LAST:event_ContainerMouseDragged

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        btnMinimizeminimizeApp(evt);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void btnMinimizeminimizeApp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeminimizeApp
        Views.minimizeWindows(this);
    }//GEN-LAST:event_btnMinimizeminimizeApp

    private void lblExitcloseApp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitcloseApp
        getWorkController().CloseApp();
    }//GEN-LAST:event_lblExitcloseApp

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        btnExit.setBackground(MotorTech.getBgPrimarySelect());
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        btnExit.setBackground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblExitMouseExited

    private void btnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseExited
        lblBtnPrev.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnPrevMouseExited

    private void btnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseEntered
        lblBtnPrev.setForeground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_btnPrevMouseEntered

    private void btnPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseClicked
        this.getWorkController().Prev();
    }//GEN-LAST:event_btnPrevMouseClicked

    private void lblBtnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnPrevMouseExited
        btnPrevMouseExited(evt);
    }//GEN-LAST:event_lblBtnPrevMouseExited

    private void lblBtnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnPrevMouseEntered
        btnPrevMouseEntered(evt);
    }//GEN-LAST:event_lblBtnPrevMouseEntered

    private void lblBtnPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnPrevMouseClicked
        btnPrevMouseClicked(evt);
    }//GEN-LAST:event_lblBtnPrevMouseClicked

    private void lblBtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEditarMouseClicked
        //iniciar controlador
    }//GEN-LAST:event_lblBtnEditarMouseClicked

    private void lblBtnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEditarMouseEntered
        lblBtnEditar.setForeground(MotorTech.getBgPrimary());
    }//GEN-LAST:event_lblBtnEditarMouseEntered

    private void lblBtnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEditarMouseExited
        lblBtnEditar.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblBtnEditarMouseExited

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
        this.getWorkController().delete();
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(MotorTech.getbgRed());
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(MotorTech.getbgRedSelect());
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnHoursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoursMouseClicked
        getWorkController().hours();
    }//GEN-LAST:event_btnHoursMouseClicked

    private void btnSparePartsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSparePartsMouseClicked
        getWorkController().spareParts();
    }//GEN-LAST:event_btnSparePartsMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel btnDelete;
    private javax.swing.JPanel btnEnd;
    private javax.swing.JPanel btnExit;
    private javax.swing.JLabel btnHours;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JPanel btnPrev;
    private javax.swing.JLabel btnSpareParts;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddres;
    private javax.swing.JLabel lblBtnDelete;
    private javax.swing.JLabel lblBtnEditar;
    private javax.swing.JLabel lblBtnEnd;
    private javax.swing.JLabel lblBtnPrev;
    private javax.swing.JLabel lblCell;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHandCost;
    private javax.swing.JLabel lblHours;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIdCard;
    private javax.swing.JLabel lblInDate;
    private java.awt.Label lblMinimize;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOutDate;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JTextArea lblReason;
    private javax.swing.JLabel lblSpareParts;
    private javax.swing.JLabel lblStateAuto;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables
}
