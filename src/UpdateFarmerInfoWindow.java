/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class UpdateFarmerInfoWindow extends javax.swing.JFrame {

   
    private int id;
    private  String name;
    private  String nic;
    private  String address;
    private int con;
    private String desc;
    private DBConnector db;
    private String user;
    private String pswd;
    private Farmer f;
    
    public UpdateFarmerInfoWindow(int id,String user,String pswd) {
        this.id = id;
        this.user=user;
        this.pswd=pswd;
        db=new DBConnector(user, pswd);
        initComponents();
        
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2-10);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.setLayout(new java.awt.GridLayout(0, 2, 0, 10));

        jLabel1.setText("Name");
        jPanel1.add(jLabel1);

        txtName.setColumns(100);
        txtName.setToolTipText("");
        txtName.setName(""); // NOI18N
        jPanel1.add(txtName);

        jLabel2.setText("NIC");
        jPanel1.add(jLabel2);

        txtNIC.setColumns(10);
        jPanel1.add(txtNIC);

        jLabel3.setText("Address");
        jPanel1.add(jLabel3);
        jPanel1.add(txtAddress);

        jLabel4.setText("Contact No");
        jPanel1.add(jLabel4);
        jPanel1.add(txtContactNo);

        jLabel5.setText("Description");
        jPanel1.add(jLabel5);

        jScrollPane2.setViewportView(t);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Update Farmer Information");

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem2.setText("Exit");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setToolTipText("");

        jMenuItem3.setText("Clear");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel6)
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Update)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Update)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
           //editFarmer(String name, String NIC, int fid, String address, int contact, String desc)
           
            name=txtName.getText();
            nic=txtNIC.getText();
            address=txtAddress.getText();
            con=Integer.parseInt(txtContactNo.getText());
            desc=t.getText();
            db.editFarmer(name, nic, id, address, con, desc);
            JOptionPane.showMessageDialog(this,"You have updated farmer "+ name,
        "update",
        JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            
    }//GEN-LAST:event_UpdateActionPerformed

 public void init(Farmer f)
 {
    
     txtName.setText(f.getName());
     txtNIC.setText(f.getNIC());
     txtAddress.setText(f.getAddress());
     txtContactNo.setText(String.valueOf(f.getContct()));
     t.setText(f.getDescriptio());
 }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane t;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
