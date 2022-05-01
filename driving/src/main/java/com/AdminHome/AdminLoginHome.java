package com.AdminHome;

import AuthorityLogin.AuthorityModel;
import AuthorityLogin.DrivingSchoolDao;
import AuthorityLogin.DrivingSchoolModel;
import AuthorityLogin.TypeVehicleModel;
import com.gi.login.AuthorityLogin.AuthorityLoginDao;
import com.gi.login.DrivingSchoolLogin.DrivingSchoolLoginDao;
import com.gi.login.LoginFrame;
import com.gi.signup.SignupModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Yash Patel
 */
public class AdminLoginHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    int adid;
    String adname;

    List<AuthorityModel> tv = null;
    List<DrivingSchoolModel> tv1 = null;
    List<SignupModel> tv2 = null;

    public AdminLoginHome(int adid, String adname) throws Exception {
        initComponents();

        //adminBPanel.setVisible(true);
        this.adid = adid;
        this.adname = adname;
        adminLabel.setText(adname);
        populateTable();

        decorateTable(aaTable);
        decorateTable(adTable);
        decorateTable(acTable);
    }

    void decorateTable(JTable table)
    {
        JTableHeader tableHeader2 = table.getTableHeader();
        tableHeader2.setBackground(Color.red);
        tableHeader2.setForeground(Color.white);
        Font headerFont2 = new Font("Verdana", Font.BOLD, 16);
        tableHeader2.setFont(headerFont2);
        tableHeader2.setPreferredSize(new Dimension(500, 32));
        table.setRowHeight(20);
    }
    public AdminLoginHome() {

    }
    //fetch authority
    private void populateTable() throws Exception {
        DefaultTableModel model = (DefaultTableModel) aaTable.getModel();
        model.setRowCount(0);

        AuthorityAdminDao dBOperations = new AuthorityAdminDao();

        tv = dBOperations.fetchAuthority();
        for (AuthorityModel person : tv) {

            System.out.println(person);
            Object[] row = new Object[5];
            row[0] = person.getId();
            row[1] = person.getName();
            row[2] = person.getMobile();
            
            model.addRow(row);
        }
    }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aaTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        adTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        acTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        adminLabel = new javax.swing.JLabel();
        logoutadminBtn = new javax.swing.JButton();
        authorityBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        aaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Name", "Mobile"
            }
        ));
        jScrollPane1.setViewportView(aaTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1031, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Authority", jPanel5);

        adTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Address", "Email", "Year Of Establishment", "Contact", "Contact Person", "Mobile"
            }
        ));
        jScrollPane4.setViewportView(adTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1031, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Driving School", jPanel6);

        acTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "First Name", "Last Name", "Date Of Birth", "Birth place", "Email", "Address", "Mobile"
            }
        ));
        jScrollPane5.setViewportView(acTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1031, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
                    .addGap(4, 4, 4)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Customers", jPanel7);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        adminLabel.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        adminLabel.setText("Admin");

        logoutadminBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutadminBtn.setText("Logout");
        logoutadminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutadminBtnActionPerformed(evt);
            }
        });

        authorityBtn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        authorityBtn1.setText("Chagne Password");
        authorityBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorityBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(adminLabel)
                .addGap(444, 444, 444)
                .addComponent(authorityBtn1)
                .addGap(18, 18, 18)
                .addComponent(logoutadminBtn))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(adminLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logoutadminBtn)
                            .addComponent(authorityBtn1))))
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //fetch Driving school
    private void populateTable1() throws Exception {
        DefaultTableModel model = (DefaultTableModel) adTable.getModel();
        model.setRowCount(0);
        DrivingSchoolDao dBOperations1 = new DrivingSchoolDao();
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
            row[7] = person1.getActive();
            System.out.println(person1);
            model.addRow(row);
        }
    }    //fetch customer deta
    private void populateTable3() throws Exception {
        DefaultTableModel model = (DefaultTableModel) acTable.getModel();
        model.setRowCount(0);
        CustomerAdminDao dBOperations1 = new CustomerAdminDao();
        tv2 = dBOperations1.fetchCustomers();
        for (SignupModel person1 : tv2) {

            
            Object[] row = new Object[11];
            row[0] = person1.getId();
            row[1] = person1.getFirst_name();
            row[2] = person1.getLast_name();
            row[4] = person1.getBirth_place();
            row[3] = person1.getDob();
            row[5] = person1.getEmail_id();
            row[7] = person1.getMobile();
            row[6] = person1.getCurrent_address();
            //row[8] = "Enable";

            model.addRow(row);
        }
    }

    private void logoutadminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutadminBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        lf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        lf.setUndecorated(true);
    }//GEN-LAST:event_logoutadminBtnActionPerformed

    private void authorityBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorityBtn1ActionPerformed
        try {

            String newPassword = JOptionPane.showInputDialog("Enter new passowrd");
            if (newPassword.length() > 0) {
                AuthorityLoginDao dao = new AuthorityLoginDao();
                int n = dao.updatePassword(adid, newPassword);

                if (n > 0) {
                    JOptionPane.showMessageDialog(this, "password updated...");

                } else {
                    JOptionPane.showMessageDialog(this, "can not change password,plz try again...");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "DB related problem,plz contact to admin");
        }

    }//GEN-LAST:event_authorityBtn1ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        JTabbedPane temp = (JTabbedPane) evt.getSource();
        if (temp.getSelectedIndex() == 0) {
            try {
                populateTable();
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(this, ex.getMessage());
            }
        } else if (temp.getSelectedIndex() == 1) {
            try {
                populateTable1();
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(this, ex.getMessage());
            }
        } else if (temp.getSelectedIndex() == 2) {
            try {
                populateTable3();
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable aaTable;
    private javax.swing.JTable acTable;
    private javax.swing.JTable adTable;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JButton authorityBtn1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logoutadminBtn;
    // End of variables declaration//GEN-END:variables
}
