package DrivingSchoolHome;

import ButtonPackage.Render;
import CustomerHome.*;
import com.gi.login.LoginFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class DrivingSchoolFrame extends javax.swing.JFrame {

    int did;
    String dname;
    List<StatusModel> tv = null;
    List<ApplyModel> tv1 = null;
    List<TestModel> tv2 = null;
    List<VehicleModel> tv3 = null;
    List<OffDaysModel> tv4 = null;
    List<ApplicantModel> tv5 = null;

    public DrivingSchoolFrame(int did,String dname) {
        initComponents();
        ver_dsvTable(dsvehicleTable);
        //dsf1.populateTable3(dsvehicleTable);
     
        
        this.did=did;
        this.dname=dname;
        drivingschoolLabel.setText(dname);
        
        JTableHeader tableHeader = dsvehicleTable.getTableHeader();
        tableHeader.setBackground(Color.red);
        tableHeader.setForeground(Color.white);
        Font headerFont = new Font("Verdana", Font.BOLD, 16);
        tableHeader.setFont(headerFont);
        tableHeader.setPreferredSize(new Dimension(500, 32));
        dsvehicleTable.setRowHeight(20);

        JTableHeader tableHeader1 = applicantTable.getTableHeader();
        tableHeader1.setBackground(Color.red);
        tableHeader1.setForeground(Color.white);
        Font headerFont1 = new Font("Verdana", Font.BOLD, 16);
        tableHeader1.setFont(headerFont1);
        tableHeader1.setPreferredSize(new Dimension(500, 32));
        applicantTable.setRowHeight(20);
        
        JTableHeader tableHeader2 = offdaysTable.getTableHeader();
        tableHeader2.setBackground(Color.red);
        tableHeader2.setForeground(Color.white);
        Font headerFont2 = new Font("Verdana", Font.BOLD, 16);
        tableHeader2.setFont(headerFont2);
        tableHeader2.setPreferredSize(new Dimension(500, 32));
        offdaysTable.setRowHeight(20);
    }

    private DrivingSchoolFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        drivingschoolLabel = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        applicantBtn = new javax.swing.JButton();
        applicantBtn1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Vehicle2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        dsvehicleTable = new javax.swing.JTable();
        ApplicantPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        applicantTable = new javax.swing.JTable();
        offdayPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        offdaysTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));

        drivingschoolLabel.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        drivingschoolLabel.setForeground(new java.awt.Color(153, 0, 0));
        drivingschoolLabel.setText("Driving School");

        logoutBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(153, 0, 0));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        applicantBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        applicantBtn.setForeground(new java.awt.Color(153, 0, 0));
        applicantBtn.setText("Applicants");
        applicantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicantBtnActionPerformed(evt);
            }
        });

        applicantBtn1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        applicantBtn1.setForeground(new java.awt.Color(153, 0, 0));
        applicantBtn1.setText("Upcoming Test");
        applicantBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicantBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drivingschoolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addComponent(applicantBtn1)
                .addGap(18, 18, 18)
                .addComponent(applicantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drivingschoolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applicantBtn)
                    .addComponent(logoutBtn)
                    .addComponent(applicantBtn1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dsvehicleTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dsvehicleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Fees", "Delete"
            }
        ));
        dsvehicleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dsvehicleTableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(dsvehicleTable);

        javax.swing.GroupLayout Vehicle2Layout = new javax.swing.GroupLayout(Vehicle2);
        Vehicle2.setLayout(Vehicle2Layout);
        Vehicle2Layout.setHorizontalGroup(
            Vehicle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        );
        Vehicle2Layout.setVerticalGroup(
            Vehicle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vehicle2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(154, 154, 154))
        );

        jPanel4.add(Vehicle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 500));

        applicantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer Name", "Mobile", "Vehicle", "Apply Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(applicantTable);

        javax.swing.GroupLayout ApplicantPanelLayout = new javax.swing.GroupLayout(ApplicantPanel);
        ApplicantPanel.setLayout(ApplicantPanelLayout);
        ApplicantPanelLayout.setHorizontalGroup(
            ApplicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 857, Short.MAX_VALUE)
            .addGroup(ApplicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE))
        );
        ApplicantPanelLayout.setVerticalGroup(
            ApplicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(ApplicantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
        );

        jPanel4.add(ApplicantPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 6, -1, -1));

        offdaysTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(offdaysTable);

        javax.swing.GroupLayout offdayPanelLayout = new javax.swing.GroupLayout(offdayPanel);
        offdayPanel.setLayout(offdayPanelLayout);
        offdayPanelLayout.setHorizontalGroup(
            offdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
            .addGroup(offdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(offdayPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(370, Short.MAX_VALUE)))
        );
        offdayPanelLayout.setVerticalGroup(
            offdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(offdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(offdayPanelLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addGap(15, 15, 15)))
        );

        jPanel4.add(offdayPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void applicantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicantBtnActionPerformed
        // TODO add your handling code here:
        ApplicantPanel.setVisible(true);
        offdayPanel.setVisible(false);

        try {
            populateTable1();
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_applicantBtnActionPerformed

    private void populateTable1() throws Exception {

        ApplicantDao dBOperations1 = new ApplicantDao();

        DefaultTableModel model = (DefaultTableModel) applicantTable.getModel();
        model.setRowCount(0);
        tv5 = dBOperations1.fetchApplicant();
        for (ApplicantModel person1 : tv5) {

            System.out.println(person1);
            Object[] row = new Object[11];
            row[0] = person1.getId();
            row[1] = person1.getCustomer_name();
            row[2] = person1.getCustomer_contact();
            row[3] = person1.getVehicle();
            row[4] = person1.getApply_date();
            row[5] = person1.getStatus();
            //row[8] = "Enable";

            /*if (person1.getStatus() == "true") {
                row[5] = "Active";
            } else {
                row[5] = "Deactive";
            }*/
            model.addRow(row);
        }
    }

    private void populateTable3() throws Exception {
        VehicleDao dBOperations1 = new VehicleDao();

        DefaultTableModel model = (DefaultTableModel) dsvehicleTable.getModel();
        model.setRowCount(0);
        tv3 = dBOperations1.fetchVehicle();
        for (VehicleModel person1 : tv3) {

            System.out.println(person1);
            Object[] row = new Object[11];
            row[0] = person1.getId();
            row[1] = person1.getName();
            row[2] = person1.getFees();
            row[8] = "DELETE";

            /*if (person1.getStatus() == "true") {
                row[5] = "Active";
            } else {
                row[5] = "Deactive";
            }*/
            model.addRow(row);
        }
    }
    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, null, "Are you sure you want to logout?", 1);
        
        this.setVisible(false);
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        lf.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        lf.setUndecorated(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void dsvehicleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dsvehicleTableMouseClicked
        int column = dsvehicleTable.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / dsvehicleTable.getRowHeight();

        if (row < dsvehicleTable.getRowCount() && row >= 0 && column < dsvehicleTable.getColumnCount() && column >= 0) {
            Object value = dsvehicleTable.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getName().equals("d")) {
                    System.out.println("Click on Delete Btn");
                    //EVENTOS MODIFICAR
                }

            }
            if (value instanceof JCheckBox) {
                //((JCheckBox)value).doClick();
                JCheckBox ch = (JCheckBox) value;
                if (ch.isSelected() == true) {
                    ch.setSelected(false);
                }
                if (ch.isSelected() == false) {
                    ch.setSelected(true);
                }

            }
        }
    }//GEN-LAST:event_dsvehicleTableMouseClicked

    private void applicantBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicantBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_applicantBtn1ActionPerformed

    private void populateTable2() throws Exception {
        OffDaysDao dBOperations2 = new OffDaysDao();

        DefaultTableModel model1 = (DefaultTableModel) offdaysTable.getModel();
        model1.setRowCount(0);
        tv4 = dBOperations2.fetchOffDays();
        for (OffDaysModel person1 : tv4) {

            System.out.println(person1);
            Object[] row = new Object[11];
            row[0] = person1.getId();
            row[1] = person1.getDate();
            model1.addRow(row);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DrivingSchoolFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrivingSchoolFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrivingSchoolFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrivingSchoolFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrivingSchoolFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ApplicantPanel;
    private javax.swing.JPanel Vehicle2;
    private javax.swing.JButton applicantBtn;
    private javax.swing.JButton applicantBtn1;
    private javax.swing.JTable applicantTable;
    private javax.swing.JLabel drivingschoolLabel;
    private javax.swing.JTable dsvehicleTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel offdayPanel;
    private javax.swing.JTable offdaysTable;
    // End of variables declaration//GEN-END:variables

    private void ver_dsvTable(JTable mainTable) {

        mainTable.setDefaultRenderer(Object.class, new Render());

        JButton btn1 = new JButton("Delete");
        btn1.setName("d");

        DefaultTableModel d = new DefaultTableModel(
                new Object[][]{{"1", "Pedro", "15000", btn1}, {"2", "Juan", "15700", btn1}, {"3", "Rosa", "14000", btn1}, {"4", "Maria", "10000", btn1}},
                new Object[]{"ID", "Name", "fees", "DELETE"}
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        mainTable.setModel(d);

        mainTable.setPreferredScrollableViewportSize(mainTable.getPreferredSize());

    }
}
