package igu;

import controller.NewWorkController;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import motortech.Inputs;
import motortech.MotorTech;
import motortech.Views;
import motortech.Work;

public class ViewNewWork extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    private String textCedula;
    private String textPlaca;

    private Work work = null;
    private NewWorkController newWorkController;

    public ViewNewWork(Work work) {
        initComponents();

        this.work = work;
        initInput();
    }

    public ViewNewWork() {
        initComponents();
        initInput();
    }

    private void initInput() {
        cbEMal.setActionCommand("Mal");
        cbERegular.setActionCommand("Regular");
        cbEBien.setActionCommand("Bien");

        textCedula = inputCedula.getText();
        textPlaca = inputPlaca.getText();
    }

    public NewWorkController getNewWorkController() {
        return newWorkController;
    }

    public void setNewWorkController(NewWorkController newWorkController) {
        this.newWorkController = newWorkController;
    }

    public Work getWork() {
        return work;
    }

    public String getCedula() {
        if (textCedula.equals(inputCedula.getText())) {
            return "";
        }

        return inputCedula.getText();
    }

    public void setInputCedula(String text) {
        inputCedula.setText(text);
    }

    public String getInputPlaca() {
        if (textPlaca.equals(inputPlaca.getText())) {
            return "";
        }

        return inputPlaca.getText();
    }

    public void setInputPlaca(String text) {
        inputPlaca.setText(text);
    }

    public void setTextNameOwner(String nameOwner) {
        lblNameOwner.setText(nameOwner);
    }

    public void setTextIdCardOwner(String idCardOwner) {
        lblIdCardOwner.setText(idCardOwner);
    }

    public int getIdCard() {
        return Integer.parseInt(lblIdCardOwner.getText());
    }

    public void setTextCellOwner(String cellOwner) {
        lblCellOwner.setText(cellOwner);
    }

    public void setTextEmailOwner(String emailOwner) {
        lblEmailOwner.setText(emailOwner);
    }

    public void setTextAddresOwner(String addres) {
        lblAddresOwner.setText(addres);
    }

    public void setTextPlaca(String placa) {
        lblPlaca.setText(placa);
    }

    public String getTextPlaca() {
        return lblPlaca.getText();
    }

    public void setTextType(String type) {
        lblType.setText(type);
    }

    public void setTextTNumber(String tNumber) {
        lblTNumber.setText(tNumber);
    }

    public String getTypeSelect() {
        ButtonModel selectModel = btnTypeGroup.getSelection();
        if (selectModel != null) {
            return selectModel.getActionCommand();
        }
        return null;
    }

    public void setTypeSelect(String actionCommand) {
        Enumeration<AbstractButton> buttons = btnTypeGroup.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            if (button.getActionCommand().equals(actionCommand)) {
                button.setSelected(true);
                break;
            }
        }
    }

    public String getSelectCheckBox() {
        List<JCheckBox> checkBoxes = new ArrayList<JCheckBox>();

        checkBoxes.add(cbMecanica);
        checkBoxes.add(cbAire);
        checkBoxes.add(cbAlineacion);
        checkBoxes.add(cbPintura);
        checkBoxes.add(cbAceite);
        checkBoxes.add(cbSuspension);
        checkBoxes.add(cbLLantas);
        checkBoxes.add(cbFrenos);

        List<String> selectedOptions = new ArrayList<>();

        for (JCheckBox checkBox : checkBoxes) {
            if (checkBox.isSelected()) {
                selectedOptions.add(checkBox.getActionCommand());
            }
        }

        return String.join(", ", selectedOptions);
    }

    public void setSelectCheckBox(List<String> listActionCommand) {
        List<JCheckBox> checkBoxes = new ArrayList<JCheckBox>();
        checkBoxes.add(cbMecanica);
        checkBoxes.add(cbAire);
        checkBoxes.add(cbAlineacion);
        checkBoxes.add(cbPintura);
        checkBoxes.add(cbAceite);
        checkBoxes.add(cbSuspension);
        checkBoxes.add(cbLLantas);
        checkBoxes.add(cbFrenos);

        for (JCheckBox checkBox : checkBoxes) {
            for (String actionCommand : listActionCommand) {
                if (actionCommand.trim().equals(checkBox.getActionCommand())) {
                    checkBox.setSelected(true);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTypeGroup = new javax.swing.ButtonGroup();
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
        btnSearchOwner = new javax.swing.JPanel();
        lblSearchOwner = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNameOwner = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblIdCardOwner = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblAddresOwner = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCellOwner = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblEmailOwner = new javax.swing.JLabel();
        inputPlaca = new javax.swing.JTextField();
        lblNameUser1 = new java.awt.Label();
        btnAutoSearch = new javax.swing.JPanel();
        lblAutoSearch = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SepNameUser1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblTNumber = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbPintura = new javax.swing.JCheckBox();
        cbMecanica = new javax.swing.JCheckBox();
        cbAlineacion = new javax.swing.JCheckBox();
        cbSuspension = new javax.swing.JCheckBox();
        cbEMal = new javax.swing.JCheckBox();
        cbLLantas = new javax.swing.JCheckBox();
        cbFrenos = new javax.swing.JCheckBox();
        cbAire = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        cbAceite = new javax.swing.JCheckBox();
        cbEBien = new javax.swing.JCheckBox();
        cbERegular = new javax.swing.JCheckBox();
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
        jLabel1.setText("Seleccione el estado del vehiculo");
        ContainerInputs.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

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

        btnSearchOwner.setBackground(new java.awt.Color(0, 153, 153));
        btnSearchOwner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchOwner.setPreferredSize(new java.awt.Dimension(80, 35));
        btnSearchOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchOwnerMouseClicked(evt);
            }
        });

        lblSearchOwner.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchOwner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchOwner.setText("Buscar");
        lblSearchOwner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSearchOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchOwnerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSearchOwnerLayout = new javax.swing.GroupLayout(btnSearchOwner);
        btnSearchOwner.setLayout(btnSearchOwnerLayout);
        btnSearchOwnerLayout.setHorizontalGroup(
            btnSearchOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSearchOwnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearchOwner, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSearchOwnerLayout.setVerticalGroup(
            btnSearchOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSearchOwnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearchOwner, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContainerInputs.add(btnSearchOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Nombre");
        ContainerInputs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 60, -1));

        lblNameOwner.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNameOwner.setForeground(new java.awt.Color(0, 0, 0));
        lblNameOwner.setText("---------- -----");
        ContainerInputs.add(lblNameOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Cédula");
        ContainerInputs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 70, -1));

        lblIdCardOwner.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIdCardOwner.setForeground(new java.awt.Color(0, 0, 0));
        lblIdCardOwner.setText("----------");
        ContainerInputs.add(lblIdCardOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Dirección");
        ContainerInputs.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 70, -1));

        lblAddresOwner.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblAddresOwner.setForeground(new java.awt.Color(0, 0, 0));
        lblAddresOwner.setText("---------");
        ContainerInputs.add(lblAddresOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Teléfono");
        ContainerInputs.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, -1));

        lblCellOwner.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCellOwner.setForeground(new java.awt.Color(0, 0, 0));
        lblCellOwner.setText("---------");
        ContainerInputs.add(lblCellOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Correo");
        ContainerInputs.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 90, -1));

        lblEmailOwner.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmailOwner.setForeground(new java.awt.Color(0, 0, 0));
        lblEmailOwner.setText("-----------");
        ContainerInputs.add(lblEmailOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, -1));

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
        btnAutoSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAutoSearch.setPreferredSize(new java.awt.Dimension(80, 35));
        btnAutoSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAutoSearchMouseClicked(evt);
            }
        });

        lblAutoSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblAutoSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAutoSearch.setText("Buscar");
        lblAutoSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAutoSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAutoSearchMouseClicked(evt);
            }
        });

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

        lblPlaca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(0, 0, 0));
        lblPlaca.setText("-----------------");
        ContainerInputs.add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        lblTNumber.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTNumber.setForeground(new java.awt.Color(0, 0, 0));
        lblTNumber.setText("----------------");
        ContainerInputs.add(lblTNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Número de targeta de propiedad");
        ContainerInputs.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 230, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Tipo");
        ContainerInputs.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 60, -1));

        lblType.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblType.setForeground(new java.awt.Color(0, 0, 0));
        lblType.setText("--------------");
        lblType.setToolTipText("");
        ContainerInputs.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 100, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Datos del Vehiculo");
        ContainerInputs.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        cbPintura.setBackground(new java.awt.Color(255, 255, 255));
        cbPintura.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbPintura.setForeground(new java.awt.Color(0, 0, 0));
        cbPintura.setText("Chapa y pintura");
        ContainerInputs.add(cbPintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        cbMecanica.setBackground(new java.awt.Color(255, 255, 255));
        cbMecanica.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbMecanica.setForeground(new java.awt.Color(0, 0, 0));
        cbMecanica.setText("Mecánica en general");
        ContainerInputs.add(cbMecanica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        cbAlineacion.setBackground(new java.awt.Color(255, 255, 255));
        cbAlineacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbAlineacion.setForeground(new java.awt.Color(0, 0, 0));
        cbAlineacion.setText("Alineación y rotación de ruedas");
        ContainerInputs.add(cbAlineacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        cbSuspension.setBackground(new java.awt.Color(255, 255, 255));
        cbSuspension.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbSuspension.setForeground(new java.awt.Color(0, 0, 0));
        cbSuspension.setText("Sistemas de suspensión");
        ContainerInputs.add(cbSuspension, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        cbEMal.setBackground(new java.awt.Color(255, 255, 255));
        btnTypeGroup.add(cbEMal);
        cbEMal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbEMal.setForeground(new java.awt.Color(0, 0, 0));
        cbEMal.setText("Mal");
        ContainerInputs.add(cbEMal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        cbLLantas.setBackground(new java.awt.Color(255, 255, 255));
        cbLLantas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbLLantas.setForeground(new java.awt.Color(0, 0, 0));
        cbLLantas.setText("Reparación de llantas");
        ContainerInputs.add(cbLLantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        cbFrenos.setBackground(new java.awt.Color(255, 255, 255));
        cbFrenos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbFrenos.setForeground(new java.awt.Color(0, 0, 0));
        cbFrenos.setText("Servicio de frenos");
        ContainerInputs.add(cbFrenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        cbAire.setBackground(new java.awt.Color(255, 255, 255));
        cbAire.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbAire.setForeground(new java.awt.Color(0, 0, 0));
        cbAire.setText("Aire acondicionado y calefacción");
        ContainerInputs.add(cbAire, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seleccione los motivos de ingreso");
        ContainerInputs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        cbAceite.setBackground(new java.awt.Color(255, 255, 255));
        cbAceite.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbAceite.setForeground(new java.awt.Color(0, 0, 0));
        cbAceite.setText("Cambio de aceite");
        ContainerInputs.add(cbAceite, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        cbEBien.setBackground(new java.awt.Color(255, 255, 255));
        btnTypeGroup.add(cbEBien);
        cbEBien.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbEBien.setForeground(new java.awt.Color(0, 0, 0));
        cbEBien.setText("Bien");
        ContainerInputs.add(cbEBien, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, -1));

        cbERegular.setBackground(new java.awt.Color(255, 255, 255));
        btnTypeGroup.add(cbERegular);
        cbERegular.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbERegular.setForeground(new java.awt.Color(0, 0, 0));
        cbERegular.setText("Regular");
        ContainerInputs.add(cbERegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

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
        getNewWorkController().CloseApp();
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
        getNewWorkController().Prev();
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
        getNewWorkController().Action();
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
        getNewWorkController().NewAutomobile();
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
        getNewWorkController().NewOwner();
    }//GEN-LAST:event_btnNewOwnerMouseClicked

    private void btnNewOwnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewOwnerMouseEntered
        lblNewOwnerMouseEntered(evt);
    }//GEN-LAST:event_btnNewOwnerMouseEntered

    private void btnNewOwnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewOwnerMouseExited
        lblNewOwnerMouseExited(evt);
    }//GEN-LAST:event_btnNewOwnerMouseExited

    private void lblSearchOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchOwnerMouseClicked
        getNewWorkController().SearchOwner();
    }//GEN-LAST:event_lblSearchOwnerMouseClicked

    private void btnSearchOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchOwnerMouseClicked
        lblSearchOwnerMouseClicked(evt);
    }//GEN-LAST:event_btnSearchOwnerMouseClicked

    private void btnAutoSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutoSearchMouseClicked
        lblAutoSearchMouseClicked(evt);
    }//GEN-LAST:event_btnAutoSearchMouseClicked

    private void lblAutoSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAutoSearchMouseClicked
        getNewWorkController().SearchAuto();
    }//GEN-LAST:event_lblAutoSearchMouseClicked

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
    private javax.swing.JPanel btnSearchOwner;
    private javax.swing.ButtonGroup btnTypeGroup;
    private javax.swing.JCheckBox cbAceite;
    private javax.swing.JCheckBox cbAire;
    private javax.swing.JCheckBox cbAlineacion;
    private javax.swing.JCheckBox cbEBien;
    private javax.swing.JCheckBox cbEMal;
    private javax.swing.JCheckBox cbERegular;
    private javax.swing.JCheckBox cbFrenos;
    private javax.swing.JCheckBox cbLLantas;
    private javax.swing.JCheckBox cbMecanica;
    private javax.swing.JCheckBox cbPintura;
    private javax.swing.JCheckBox cbSuspension;
    private javax.swing.JTextField inputCedula;
    private javax.swing.JTextField inputPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAddresOwner;
    private javax.swing.JLabel lblAutoSearch;
    private javax.swing.JLabel lblBtnEnd;
    private javax.swing.JLabel lblBtnPrev;
    private javax.swing.JLabel lblCellOwner;
    private javax.swing.JLabel lblEmailOwner;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblIdCardOwner;
    private java.awt.Label lblMinimize;
    private javax.swing.JLabel lblNameOwner;
    private java.awt.Label lblNameUser;
    private java.awt.Label lblNameUser1;
    private javax.swing.JLabel lblNewAutomobile;
    private javax.swing.JLabel lblNewOwner;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblSearchOwner;
    private javax.swing.JLabel lblTNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables
}
