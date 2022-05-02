package CustomerHome;

import com.gi.login.LoginFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class CustomerHomeFrame1 extends javax.swing.JFrame {

    int cid;
    String cname;
    List<StatusModel> tv = null;
    List<ApplyModel> tv1 = null;
    List<TestModel> tv2 = null;
    List<TestModel> tv3 = null;
    Map<String,Integer> vechicleMap,drivingSchoolMap;
    public CustomerHomeFrame1(int cid,String cname) throws Exception {
        
      
        this.cid = cid; 
        this.cname = cname;
        initComponents();
        drivingname();
        vehiclename();
        userLabel.setText(cname);
        setResizable(false);
        
        JTableHeader tableHeader =appliedTable.getTableHeader();
           tableHeader.setBackground(Color.red);
           tableHeader.setForeground(Color.white);
           Font headerFont =new Font("Verdana",Font.BOLD,16);
           tableHeader.setFont(headerFont);
           tableHeader.setPreferredSize(new Dimension(500,32));
           appliedTable.setRowHeight(20);
           
           
        JTableHeader tableHeader1 =upcomingTable.getTableHeader();
           tableHeader1.setBackground(Color.red);
           tableHeader1.setForeground(Color.white);
           Font headerFont1 =new Font("Verdana",Font.BOLD,16);
           tableHeader1.setFont(headerFont1);
           tableHeader1.setPreferredSize(new Dimension(500,32));
           upcomingTable.setRowHeight(20);
           applyPanel.setVisible(true);
        statusPanel.setVisible(false);
        testPanel.setVerifyInputWhenFocusTarget(false);

    }

    private CustomerHomeFrame1() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        applyBtn = new javax.swing.JButton();
        appliedBtn = new javax.swing.JButton();
        upcomingBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        applyPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        signuplbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        daysBox = new javax.swing.JComboBox<>();
        monthBox = new javax.swing.JComboBox<>();
        yearBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        vnameBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        dsNameBox = new javax.swing.JComboBox<>();
        submitBtn1 = new javax.swing.JButton();
        statusPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appliedTable = new javax.swing.JTable();
        testPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        upcomingTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        userLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(153, 0, 0));
        userLabel.setText("User");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 40, 22, 0);
        jPanel2.add(userLabel, gridBagConstraints);

        applyBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        applyBtn.setForeground(new java.awt.Color(153, 0, 0));
        applyBtn.setText("Apply");
        applyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 322, 0, 0);
        jPanel2.add(applyBtn, gridBagConstraints);

        appliedBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        appliedBtn.setForeground(new java.awt.Color(153, 0, 0));
        appliedBtn.setText("Applied");
        appliedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appliedBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 18, 0, 0);
        jPanel2.add(appliedBtn, gridBagConstraints);

        upcomingBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        upcomingBtn.setForeground(new java.awt.Color(153, 0, 0));
        upcomingBtn.setText("Up Coming");
        upcomingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upcomingBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 19, 0, 0);
        jPanel2.add(upcomingBtn, gridBagConstraints);

        logoutBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(153, 0, 0));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 16, 0, 38);
        jPanel2.add(logoutBtn, gridBagConstraints);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signuplbl.setBackground(new java.awt.Color(255, 255, 255));
        signuplbl.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        signuplbl.setForeground(new java.awt.Color(153, 0, 0));
        signuplbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signuplbl.setText("Apply For License");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Date Of Birth :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        daysBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        daysBox.setForeground(new java.awt.Color(153, 0, 0));
        daysBox.setMaximumRowCount(10);
        daysBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        monthBox.setForeground(new java.awt.Color(153, 0, 0));
        monthBox.setMaximumRowCount(10);
        monthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));

        yearBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        yearBox.setForeground(new java.awt.Color(153, 0, 0));
        yearBox.setMaximumRowCount(10);
        yearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Vehicle");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        vnameBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        vnameBox.setForeground(new java.awt.Color(153, 0, 0));
        vnameBox.setMaximumRowCount(10);
        vnameBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 Wheeler" }));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Driving School");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        dsNameBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dsNameBox.setForeground(new java.awt.Color(153, 0, 0));
        dsNameBox.setMaximumRowCount(10);
        dsNameBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shradha Motor", "Apt Motor", "C B Motor" }));
        dsNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsNameBoxActionPerformed(evt);
            }
        });

        submitBtn1.setBackground(new java.awt.Color(153, 0, 0));
        submitBtn1.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn1.setText("Submit");
        submitBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true));
        submitBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(signuplbl))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(dsNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(vnameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(daysBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(submitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(signuplbl)
                .addGap(51, 51, 51)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(dsNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(vnameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(daysBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addComponent(submitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout applyPanelLayout = new javax.swing.GroupLayout(applyPanel);
        applyPanel.setLayout(applyPanelLayout);
        applyPanelLayout.setHorizontalGroup(
            applyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applyPanelLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        applyPanelLayout.setVerticalGroup(
            applyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applyPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanel5.add(applyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 542, 874, -1));

        appliedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Driving School Name", "Contact No", "Vehicle", "Apply Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(appliedTable);

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel5.add(statusPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 874, -1));

        upcomingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Driving School Name", "Contact No", "Vehicle", "Apply Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(upcomingTable);

        javax.swing.GroupLayout testPanelLayout = new javax.swing.GroupLayout(testPanel);
        testPanel.setLayout(testPanelLayout);
        testPanelLayout.setHorizontalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                .addContainerGap())
        );
        testPanelLayout.setVerticalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(testPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1147, 874, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appliedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appliedBtnActionPerformed
        // TODO add your handling code here:
        statusPanel.setVisible(true);
        applyPanel.setVisible(false);
        testPanel.setVisible(false);
        //lic.setVisible(false);
        try {
            populateTable1();
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_appliedBtnActionPerformed

    private void populateTable1() throws Exception {
        StatusDao dBOperations1 = new StatusDao();

        DefaultTableModel model = (DefaultTableModel) appliedTable.getModel();
        model.setRowCount(0);
        tv = dBOperations1.fetchStatus();
        for (StatusModel person1 : tv) {

            System.out.println(person1);
            Object[] row = new Object[11];
            row[0] = person1.getId();
            row[1] = person1.getDriving_school_name();
            row[2] = person1.getContact_no();
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

    private void applyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyBtnActionPerformed
        //get driving school id from driving school login page
        //pass that id to apply_driving_school and get cid,vech_id,apply_date,status
        //find customer details using cid
        //find vechicle name using vech_id
        // and load on table
        getContentPane().remove(statusPanel);
        getContentPane().add(applyPanel);
//        buildPanel(); // panel needs a builder method
        revalidate(); // in- and validate in one !! 
//        pack(); 
        System.out.println("Applied clicked");
//        applyPanel.setVisible(true);
//        this.remove(statusPanel);
//        statusPanel.setVisible(false);
        testPanel.setVerifyInputWhenFocusTarget(false);

        drivingname();
        vehiclename();
    }//GEN-LAST:event_applyBtnActionPerformed

    private void upcomingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upcomingBtnActionPerformed
        // TODO add your handling code here:
        testPanel.setVisible(true);
        applyPanel.setVisible(false);
        statusPanel.setVisible(false);

        try {
            populateTable2();
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_upcomingBtnActionPerformed

    private void populateTable2() throws Exception {
        TestDao dBOperations2 = new TestDao();

        DefaultTableModel model1 = (DefaultTableModel) upcomingTable.getModel();
        model1.setRowCount(0);
        tv2 = dBOperations2.fetchTest();
        for (TestModel person1 : tv2) {

            System.out.println(person1);
            Object[] row = new Object[11];
            row[0] = person1.getId();
            row[1] = person1.getDriving_school_name();
            row[2] = person1.getContact_no();
            row[3] = person1.getVehicle();
            row[4] = person1.getApply_date();

            model1.addRow(row);
        }
    }

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this,null, "Are you sure you want to logout?", 1);
        this.setVisible(false);
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        lf.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        lf.setUndecorated(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void submitBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn1ActionPerformed
        // TODO add your handling code here:
        String vname = vnameBox.getSelectedItem().toString();
        String dsname = dsNameBox.getSelectedItem().toString();
        System.out.println(Integer.parseInt(yearBox.getSelectedItem().toString())+":"+
            monthBox.getSelectedIndex()+":"+
            Integer.parseInt(daysBox.getSelectedItem().toString()));
        LocalDate date = LocalDate.of(
            Integer.parseInt(yearBox.getSelectedItem().toString()),
            monthBox.getSelectedIndex()+1,
            Integer.parseInt(daysBox.getSelectedItem().toString()));
        String adate = yearBox.getSelectedItem().toString() + monthBox.getSelectedItem().toString() + daysBox.getSelectedItem().toString();
        int rs, n;
        ApplyModel am = null;
        try {
            ApplyDao sd = new ApplyDao();
            ApplyModel sm1 = new ApplyModel(cid, vechicleMap.get(vname), drivingSchoolMap.get(dsname), date);

            n = sd.insertApply(sm1);
            if (n > 0) {
                //this.setVisible(false);
                //new LoginFrame().setVisible(true);
                JOptionPane.showMessageDialog(this, "Successfully Apply");
            } else {
                JOptionPane.showConfirmDialog(this, "Plz Choose another date!!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showConfirmDialog(this, ex.getMessage()
            );
        }
    }//GEN-LAST:event_submitBtn1ActionPerformed

    private void dsNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsNameBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_dsNameBoxActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerHomeFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerHomeFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerHomeFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerHomeFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerHomeFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appliedBtn;
    private javax.swing.JTable appliedTable;
    private javax.swing.JButton applyBtn;
    private javax.swing.JPanel applyPanel;
    private javax.swing.JComboBox<String> daysBox;
    private javax.swing.JComboBox<String> dsNameBox;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JLabel signuplbl;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JButton submitBtn1;
    private javax.swing.JPanel testPanel;
    private javax.swing.JButton upcomingBtn;
    private javax.swing.JTable upcomingTable;
    private javax.swing.JLabel userLabel;
    private javax.swing.JComboBox<String> vnameBox;
    private javax.swing.JComboBox<String> yearBox;
    // End of variables declaration//GEN-END:variables

    private void vehiclename() {

        try {
            ApplyDao ld = new ApplyDao();
            ApplyModel sm = new ApplyModel();

            vechicleMap = ld.fetchVehicle();
            if (vechicleMap!= null) {
                //String vehicleName = map.get();
                vnameBox.setModel(new DefaultComboBoxModel<>(vechicleMap.keySet().toArray(new String[0])));
                /*Map<String, String> strMap = new LinkedHashMap<>();
                JComboBox<String> combo = new JComboBox<>();
                combo.setModel(new DefaultComboBoxModel<>(strMap.values().toArray(new String[0])));*/
            } else {
                JOptionPane.showInputDialog(this, "No Vehicles are registerd!!!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("vehicle's catch");
        } catch (SQLException e) {

            JOptionPane.showInputDialog(this, "Data base issues plz contact to admin!!!");
        }
    }

    private void drivingname() {
        try {
            ApplyDao ld = new ApplyDao();
            ApplyModel sm = new ApplyModel();

            drivingSchoolMap = ld.fetchDrivingSchoolName();
            if (drivingSchoolMap!= null) {
                //System.out.println("FoundCustomerHomeFrame  CustomerHomeFrame    HomeFrame hf = new HomeFrame();
                //JOptionPane.showMessageDialog(this, "Suucessfully Login");
                //String drivingschoolname = status. ;
           
                dsNameBox.setModel(new DefaultComboBoxModel<>(drivingSchoolMap.keySet().toArray(new String[0])));
            } else {
                JOptionPane.showInputDialog(this, "No driving schools are registerd!!!");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("vehicle's catch");
        } catch (SQLException ex) {
            JOptionPane.showInputDialog(this, "Data base issues plz contact to admin!!!");
        }
    }

}
