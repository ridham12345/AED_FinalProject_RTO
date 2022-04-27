/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AuthorityLogin;

import AddNewVehicle.AddNewVehicleFrame;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class AuthorityHomeFrame extends javax.swing.JFrame {

    List<TypeVehicleModel> tv = null;
    List<DrivingSchoolModel> tv1 = null;

    /**
     * Creates new form AuthorityHome
     */
    public AuthorityHomeFrame() throws Exception {
        initComponents();
        populateTable();

    }
    TypeVehicleDao dBOperations = new TypeVehicleDao();

    private void populateTable() throws Exception {
        DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
        model.setRowCount(0);
        tv = dBOperations.fetchTypeVehicle();
        for (TypeVehicleModel person : tv) {

            System.out.println(person);
            Object[] row = new Object[5];
            row[0] = person.getId();
            row[1] = person.getName();
            row[2] = person.getFees();
            row[3] = "Enable";
            row[4] = "Enable";

//            if (person.isIsPatient()) {
//                row[6] = "YES";
//            } else {
//                row[6] = "NO";
//            }
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        typebtn = new javax.swing.JButton();
        DrivingSchoolBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        typepanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        drivingSchoolpanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dstable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Authority Login    ");
        jPanel1.add(jLabel2, new java.awt.GridBagConstraints());

        typebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        typebtn.setForeground(new java.awt.Color(153, 0, 0));
        typebtn.setText("Vehicle Types");
        typebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        typebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typebtnActionPerformed(evt);
            }
        });

        DrivingSchoolBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DrivingSchoolBtn.setForeground(new java.awt.Color(153, 0, 0));
        DrivingSchoolBtn.setText("Driving School");
        DrivingSchoolBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        DrivingSchoolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrivingSchoolBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(typebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addComponent(DrivingSchoolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(562, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(typebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(DrivingSchoolBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Fees", "Edit", "Delete"
            }
        ));
        jScrollPane1.setViewportView(mainTable);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("+   Add New Vehicle ");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout typepanelLayout = new javax.swing.GroupLayout(typepanel);
        typepanel.setLayout(typepanelLayout);
        typepanelLayout.setHorizontalGroup(
            typepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, typepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        typepanelLayout.setVerticalGroup(
            typepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, typepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(typepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 12, -1, 467));

        dstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Driving Name", "Driving Address", "Driving Email", "Year Of Establishment", "Contact Person ", "Contact No", "Edit", "Delete"
            }
        ));
        jScrollPane2.setViewportView(dstable);

        javax.swing.GroupLayout drivingSchoolpanelLayout = new javax.swing.GroupLayout(drivingSchoolpanel);
        drivingSchoolpanel.setLayout(drivingSchoolpanelLayout);
        drivingSchoolpanelLayout.setHorizontalGroup(
            drivingSchoolpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drivingSchoolpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addContainerGap())
        );
        drivingSchoolpanelLayout.setVerticalGroup(
            drivingSchoolpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drivingSchoolpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(drivingSchoolpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 6, 870, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typebtnActionPerformed
        // TODO add your handling code here:
        typepanel.setVisible(true);
    }//GEN-LAST:event_typebtnActionPerformed

    private void DrivingSchoolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrivingSchoolBtnActionPerformed
        // TODO add your handling code here:
        typepanel.setVisible(false);
        drivingSchoolpanel.setVisible(true);

        try {
            populateTable1();
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_DrivingSchoolBtnActionPerformed
    DrivingSchoolDao dBOperations1 = new DrivingSchoolDao();

    private void populateTable1() throws Exception {
        DefaultTableModel model = (DefaultTableModel) dstable.getModel();
        model.setRowCount(0);
        tv1 = dBOperations1.fetchDrivingSchool();
        for (DrivingSchoolModel person1 : tv1) {

            System.out.println(person1);
            Object[] row = new Object[11];
            row[0] = person1.getId();
            row[1] = person1.getName();
            row[2] = person1.getAddress();
            row[3] = person1.getEmail();
            row[4] = person1.getYoe();
            row[5] = person1.getContactperson();
            row[6] = person1.getContactno();
            row[7] = "Enable";
            row[8] = "Enable";

//            if (person.isIsPatient()) {
//                row[6] = "YES";
//            } else {
//                row[6] = "NO";
//            }
            model.addRow(row);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AddNewVehicleFrame anv = new AddNewVehicleFrame();
        anv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AuthorityHomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorityHomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorityHomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorityHomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AuthorityHomeFrame().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AuthorityHomeFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DrivingSchoolBtn;
    private javax.swing.JPanel drivingSchoolpanel;
    private javax.swing.JTable dstable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable mainTable;
    private javax.swing.JButton typebtn;
    private javax.swing.JPanel typepanel;
    // End of variables declaration//GEN-END:variables
}
