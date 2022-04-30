package CustomerHome;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerHomeFrame1 extends javax.swing.JFrame {

    int cid;
    List<StatusModel> tv = null;
    List<ApplyModel> tv1 = null;
    List<TestModel> tv2 = null;
    List<TestModel> tv3 = null;
    Map<String,Integer> vechicleMap,drivingSchoolMap;
    public CustomerHomeFrame1(int cid) throws Exception {
        
        this.cid = cid;
        initComponents();
        drivingname();
        vehiclename();
    }

    private CustomerHomeFrame1() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        applyBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        testBtn = new javax.swing.JButton();
        licenseBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        applyPanel = new javax.swing.JPanel();
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
        statusTable = new javax.swing.JTable();
        testPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        testTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("User");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        applyBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        applyBtn.setForeground(new java.awt.Color(153, 0, 0));
        applyBtn.setText("Apply");
        applyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyBtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        testBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        testBtn.setForeground(new java.awt.Color(153, 0, 0));
        testBtn.setText("Test");
        testBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testBtnActionPerformed(evt);
            }
        });

        licenseBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        licenseBtn.setForeground(new java.awt.Color(153, 0, 0));
        licenseBtn.setText("License");
        licenseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(applyBtn)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(testBtn)
                .addGap(18, 18, 18)
                .addComponent(licenseBtn)
                .addContainerGap(487, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyBtn)
                    .addComponent(jButton2)
                    .addComponent(testBtn)
                    .addComponent(licenseBtn))
                .addGap(14, 14, 14))
        );

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
                .addGap(27, 27, 27)
                .addComponent(signuplbl, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(450, 450, 450))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(vnameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(dsNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daysBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(signuplbl)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dsNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vnameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daysBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(submitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout applyPanelLayout = new javax.swing.GroupLayout(applyPanel);
        applyPanel.setLayout(applyPanelLayout);
        applyPanelLayout.setHorizontalGroup(
            applyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        applyPanelLayout.setVerticalGroup(
            applyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        statusTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(statusTable);

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        testTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(testTable);

        javax.swing.GroupLayout testPanelLayout = new javax.swing.GroupLayout(testPanel);
        testPanel.setLayout(testPanelLayout);
        testPanelLayout.setHorizontalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                .addContainerGap())
        );
        testPanelLayout.setVerticalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(applyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(5, 5, 5)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(testPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(applyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(4, 4, 4)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(testPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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

    }//GEN-LAST:event_jButton2ActionPerformed

    private void populateTable1() throws Exception {
        StatusDao dBOperations1 = new StatusDao();

        DefaultTableModel model = (DefaultTableModel) statusTable.getModel();
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

    private void applyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyBtnActionPerformed
        //get driving school id from driving school login page
        //pass that id to apply_driving_school and get cid,vech_id,apply_date,status
        //find customer details using cid
        //find vechicle name using vech_id
        // and load on table
        applyPanel.setVisible(true);
        statusPanel.setVisible(false);
        testPanel.setVerifyInputWhenFocusTarget(false);

        drivingname();
        vehiclename();
    }//GEN-LAST:event_applyBtnActionPerformed

    private void testBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testBtnActionPerformed
        // TODO add your handling code here:
        testPanel.setVisible(true);
        applyPanel.setVisible(false);
        statusPanel.setVisible(false);

        try {
            populateTable2();
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_testBtnActionPerformed

    private void populateTable2() throws Exception {
        TestDao dBOperations2 = new TestDao();

        DefaultTableModel model1 = (DefaultTableModel) testTable.getModel();
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

    private void licenseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseBtnActionPerformed

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
    private javax.swing.JButton applyBtn;
    private javax.swing.JPanel applyPanel;
    private javax.swing.JComboBox<String> daysBox;
    private javax.swing.JComboBox<String> dsNameBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JButton licenseBtn;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JLabel signuplbl;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JTable statusTable;
    private javax.swing.JButton submitBtn1;
    private javax.swing.JButton testBtn;
    private javax.swing.JPanel testPanel;
    private javax.swing.JTable testTable;
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
