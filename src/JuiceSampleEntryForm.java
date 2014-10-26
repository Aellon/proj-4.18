



import javax.swing.JFrame;

public class JuiceSampleEntryForm extends javax.swing.JFrame {

    DBConnector db ;
    
    public JuiceSampleEntryForm(int id,String user,String pswd) {
        initComponents();
      //  this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        db=new DBConnector(user, pswd);
        
        
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMixedJuice = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMJBrix = new javax.swing.JTextField();
        txtMJPol = new javax.swing.JTextField();
        jPanelLastExpressed = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLastExBrix = new javax.swing.JTextField();
        txtLastExPol = new javax.swing.JTextField();
        jPanelFirstExpressed1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFirsrExBrix1 = new javax.swing.JTextField();
        txtFirstExPol1 = new javax.swing.JTextField();
        jPanelFirstExpressed2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txflBrix2 = new javax.swing.JTextField();
        txtflPol2 = new javax.swing.JTextField();
        jPanelFirstExpressed3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtclBrix3 = new javax.swing.JTextField();
        txclPol3 = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanelFirstExpressed4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtSyrupBrix = new javax.swing.JTextField();
        txtSyrupPol = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuNew = new javax.swing.JMenuItem();
        jMenuClose = new javax.swing.JMenuItem();
        jMenuDecFont = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanelMixedJuice.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        jPanelMixedJuice.setPreferredSize(new java.awt.Dimension(350, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Mixed Juice");

        jLabel2.setText("BRIX");

        jLabel3.setText("Polarity");

        txtMJBrix.setColumns(2);

        javax.swing.GroupLayout jPanelMixedJuiceLayout = new javax.swing.GroupLayout(jPanelMixedJuice);
        jPanelMixedJuice.setLayout(jPanelMixedJuiceLayout);
        jPanelMixedJuiceLayout.setHorizontalGroup(
            jPanelMixedJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMixedJuiceLayout.createSequentialGroup()
                .addGroup(jPanelMixedJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMixedJuiceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMixedJuiceLayout.createSequentialGroup()
                        .addGroup(jPanelMixedJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMixedJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMJBrix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMJPol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );
        jPanelMixedJuiceLayout.setVerticalGroup(
            jPanelMixedJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMixedJuiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMixedJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMixedJuiceLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMixedJuiceLayout.createSequentialGroup()
                        .addGroup(jPanelMixedJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMJBrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanelMixedJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMJPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLastExpressed.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        jPanelLastExpressed.setPreferredSize(new java.awt.Dimension(350, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Last Expressed Juice");

        jLabel5.setText("BRIX");

        jLabel6.setText("Polarity");

        txtLastExBrix.setColumns(2);

        javax.swing.GroupLayout jPanelLastExpressedLayout = new javax.swing.GroupLayout(jPanelLastExpressed);
        jPanelLastExpressed.setLayout(jPanelLastExpressedLayout);
        jPanelLastExpressedLayout.setHorizontalGroup(
            jPanelLastExpressedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLastExpressedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLastExpressedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelLastExpressedLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(jPanelLastExpressedLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelLastExpressedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(150, 150, 150)
                .addGroup(jPanelLastExpressedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLastExPol)
                    .addComponent(txtLastExBrix, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLastExpressedLayout.setVerticalGroup(
            jPanelLastExpressedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLastExpressedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLastExpressedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLastExpressedLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5))
                    .addComponent(txtLastExBrix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLastExpressedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLastExPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21))
        );

        jPanelFirstExpressed1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        jPanelFirstExpressed1.setPreferredSize(new java.awt.Dimension(350, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("First Expressed Juice");

        jLabel8.setText("BRIX");

        jLabel9.setText("Polarity");

        txtFirsrExBrix1.setColumns(2);
        txtFirsrExBrix1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirsrExBrix1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFirstExpressed1Layout = new javax.swing.GroupLayout(jPanelFirstExpressed1);
        jPanelFirstExpressed1.setLayout(jPanelFirstExpressed1Layout);
        jPanelFirstExpressed1Layout.setHorizontalGroup(
            jPanelFirstExpressed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFirstExpressed1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFirstExpressed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelFirstExpressed1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(jPanelFirstExpressed1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelFirstExpressed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(150, 150, 150)
                .addGroup(jPanelFirstExpressed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFirstExPol1)
                    .addComponent(txtFirsrExBrix1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanelFirstExpressed1Layout.setVerticalGroup(
            jPanelFirstExpressed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFirstExpressed1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFirstExpressed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFirstExpressed1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8))
                    .addComponent(txtFirsrExBrix1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFirstExpressed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFirstExPol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFirstExpressed2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        jPanelFirstExpressed2.setPreferredSize(new java.awt.Dimension(350, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Filtrate");

        jLabel11.setText("BRIX");

        jLabel12.setText("Polarity");

        txflBrix2.setColumns(2);

        javax.swing.GroupLayout jPanelFirstExpressed2Layout = new javax.swing.GroupLayout(jPanelFirstExpressed2);
        jPanelFirstExpressed2.setLayout(jPanelFirstExpressed2Layout);
        jPanelFirstExpressed2Layout.setHorizontalGroup(
            jPanelFirstExpressed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFirstExpressed2Layout.createSequentialGroup()
                .addGroup(jPanelFirstExpressed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFirstExpressed2Layout.createSequentialGroup()
                        .addGroup(jPanelFirstExpressed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFirstExpressed2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFirstExpressed2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(143, 143, 143)))
                        .addComponent(txtflPol2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFirstExpressed2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txflBrix2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
        );
        jPanelFirstExpressed2Layout.setVerticalGroup(
            jPanelFirstExpressed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFirstExpressed2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFirstExpressed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFirstExpressed2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFirstExpressed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txflBrix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFirstExpressed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtflPol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26))
        );

        jPanelFirstExpressed3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        jPanelFirstExpressed3.setPreferredSize(new java.awt.Dimension(350, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Clarified Juice");

        jLabel14.setText("BRIX");

        jLabel15.setText("Polarity");

        txtclBrix3.setColumns(2);

        javax.swing.GroupLayout jPanelFirstExpressed3Layout = new javax.swing.GroupLayout(jPanelFirstExpressed3);
        jPanelFirstExpressed3.setLayout(jPanelFirstExpressed3Layout);
        jPanelFirstExpressed3Layout.setHorizontalGroup(
            jPanelFirstExpressed3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFirstExpressed3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanelFirstExpressed3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFirstExpressed3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txclPol3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFirstExpressed3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtclBrix3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104))
            .addGroup(jPanelFirstExpressed3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFirstExpressed3Layout.setVerticalGroup(
            jPanelFirstExpressed3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFirstExpressed3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(9, 9, 9)
                .addGroup(jPanelFirstExpressed3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtclBrix3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(14, 14, 14)
                .addGroup(jPanelFirstExpressed3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txclPol3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18))
        );

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jButton5.setText("View");

        jPanelFirstExpressed4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        jPanelFirstExpressed4.setPreferredSize(new java.awt.Dimension(350, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Syrup");

        jLabel17.setText("BRIX");

        jLabel18.setText("Polarity");

        txtSyrupBrix.setColumns(2);

        javax.swing.GroupLayout jPanelFirstExpressed4Layout = new javax.swing.GroupLayout(jPanelFirstExpressed4);
        jPanelFirstExpressed4.setLayout(jPanelFirstExpressed4Layout);
        jPanelFirstExpressed4Layout.setHorizontalGroup(
            jPanelFirstExpressed4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFirstExpressed4Layout.createSequentialGroup()
                .addGroup(jPanelFirstExpressed4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFirstExpressed4Layout.createSequentialGroup()
                        .addGroup(jPanelFirstExpressed4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFirstExpressed4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFirstExpressed4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(143, 143, 143)))
                        .addComponent(txtSyrupPol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFirstExpressed4Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSyrupBrix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
        );
        jPanelFirstExpressed4Layout.setVerticalGroup(
            jPanelFirstExpressed4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFirstExpressed4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFirstExpressed4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFirstExpressed4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFirstExpressed4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSyrupBrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFirstExpressed4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSyrupPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(26, 26, 26))
        );

        jMenuFile.setText("File");
        jMenuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileActionPerformed(evt);
            }
        });

        jMenuNew.setText("New");
        jMenuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuNew);

        jMenuClose.setText("Close");
        jMenuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCloseActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuClose);

        jMenuBar1.add(jMenuFile);

        jMenuDecFont.setText("Edit");

        jMenuItem1.setText("Increase Font Size");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuDecFont.add(jMenuItem1);

        jMenuItem2.setText("Decrease Font Size");
        jMenuDecFont.add(jMenuItem2);

        jMenuBar1.add(jMenuDecFont);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelFirstExpressed2, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jPanelMixedJuice, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jPanelLastExpressed, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jPanelFirstExpressed3, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jPanelFirstExpressed1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jPanelFirstExpressed4, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFirstExpressed1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLastExpressed, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMixedJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelFirstExpressed4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelFirstExpressed2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelFirstExpressed3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addGap(251, 251, 251)))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewActionPerformed
        
    }//GEN-LAST:event_jMenuNewActionPerformed

    private void jMenuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuCloseActionPerformed

    private void jMenuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileActionPerformed

    }//GEN-LAST:event_jMenuFileActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        float FX_Brix = Float.valueOf(txtFirsrExBrix1.getText());
        float FX_Pol = Float.valueOf(txtFirstExPol1.getText());
        SampleEntity firstEx= new SampleEntity(FX_Brix,FX_Pol);
        
        float LX_Brix = Float.valueOf(txtLastExBrix.getText());
        float LX_Pol = Float.valueOf(txtLastExPol.getText());
        SampleEntity lastEx= new SampleEntity(LX_Brix,LX_Pol);
        
        float MJ_Brix = Float.valueOf(txtMJBrix.getText());
        float MJ_Pol = Float.valueOf(txtMJPol.getText());
        SampleEntity mixed= new SampleEntity(MJ_Brix,MJ_Pol);
        
        float CL_Brix = Float.valueOf(txtclBrix3.getText());
        float CL_Pol = Float.valueOf(txclPol3.getText());
        SampleEntity clarified= new SampleEntity(CL_Brix,CL_Pol);
        
        float FL_Brix = Float.valueOf(txflBrix2.getText());
        float FL_Pol = Float.valueOf(txtflPol2.getText());
        SampleEntity filtrate= new SampleEntity(FL_Brix,FL_Pol);
        
        float S_Brix = Float.valueOf(txtSyrupBrix.getText());
        float S_Pol = Float.valueOf(txtSyrupPol.getText());
        SampleEntity syrup= new SampleEntity(S_Brix,S_Pol);
        
        CaneJuiceSample js = new CaneJuiceSample(firstEx,lastEx,mixed,clarified,filtrate,syrup);
        
        db.putJuiceSample(js);
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtFirsrExBrix1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirsrExBrix1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirsrExBrix1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuClose;
    private javax.swing.JMenu jMenuDecFont;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuNew;
    private javax.swing.JPanel jPanelFirstExpressed1;
    private javax.swing.JPanel jPanelFirstExpressed2;
    private javax.swing.JPanel jPanelFirstExpressed3;
    private javax.swing.JPanel jPanelFirstExpressed4;
    private javax.swing.JPanel jPanelLastExpressed;
    private javax.swing.JPanel jPanelMixedJuice;
    private javax.swing.JTextField txclPol3;
    private javax.swing.JTextField txflBrix2;
    private javax.swing.JTextField txtFirsrExBrix1;
    private javax.swing.JTextField txtFirstExPol1;
    private javax.swing.JTextField txtLastExBrix;
    private javax.swing.JTextField txtLastExPol;
    private javax.swing.JTextField txtMJBrix;
    private javax.swing.JTextField txtMJPol;
    private javax.swing.JTextField txtSyrupBrix;
    private javax.swing.JTextField txtSyrupPol;
    private javax.swing.JTextField txtclBrix3;
    private javax.swing.JTextField txtflPol2;
    // End of variables declaration//GEN-END:variables
}
