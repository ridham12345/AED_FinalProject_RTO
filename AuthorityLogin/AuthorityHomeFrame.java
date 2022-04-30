package AuthorityLogin;

import AddNewVehicle.AddNewVehicleFrame;
import ButtonPackage.Render;
import com.gi.login.LoginFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class AuthorityHomeFrame extends javax.swing.JFrame {

    int aid;
    String aname;
    List<TypeVehicleModel> tv = null;
    List<DrivingSchoolModel> tv1 = null;

    public AuthorityHomeFrame(int aid, String aname) throws Exception {
        this.aid = aid;
        this.aname = aname;
        initComponents();
        populateTable();
        setResizable(false);
        ver_dsvTable(mainTable);
        anameLabel.setText(aname);

        JTableHeader tableHeader = mainTable.getTableHeader();
        tableHeader.setBackground(Color.red);
        tableHeader.setForeground(Color.white);
        Font headerFont = new Font("Verdana", Font.BOLD, 16);
        tableHeader.setFont(headerFont);
        tableHeader.setPreferredSize(new Dimension(500, 32));
        mainTable.setRowHeight(20);

        JTableHeader tableHeader1 = dstable.getTableHeader();
        tableHeader1.setBackground(Color.red);
        tableHeader1.setForeground(Color.white);
        Font headerFont1 = new Font("Verdana", Font.BOLD, 16);
        tableHeader1.setFont(headerFont1);
        tableHeader1.setPreferredSize(new Dimension(500, 32));
        dstable.setRowHeight(20);

    }

    public AuthorityHomeFrame() {
    }

    

    private void populateTable() throws Exception {
        DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
        model.setRowCount(0);

        TypeVehicleDao dBOperations = new TypeVehicleDao();

        tv = dBOperations.fetchTypeVehicle();
        for (TypeVehicleModel person : tv) {

            System.out.println(person);
            Object[] row = new Object[5];
            row[0] = person.getId();
            row[1] = person.getName();
            row[2] = person.getFees();

            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        anameLabel = new javax.swing.JLabel();
        typebtn = new javax.swing.JButton();
        DrivingSchoolBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
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

        anameLabel.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        anameLabel.setForeground(new java.awt.Color(153, 0, 0));
        anameLabel.setText("Authority Login    ");

        typebtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        typebtn.setForeground(new java.awt.Color(153, 0, 0));
        typebtn.setText("Vehicle Types");
        typebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        typebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typebtnActionPerformed(evt);
            }
        });

        DrivingSchoolBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        DrivingSchoolBtn.setForeground(new java.awt.Color(153, 0, 0));
        DrivingSchoolBtn.setText("Driving School");
        DrivingSchoolBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        DrivingSchoolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrivingSchoolBtnActionPerformed(evt);
            }
        });

        LogoutBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(153, 0, 0));
        LogoutBtn.setText("Logout");
        LogoutBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(anameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(typebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DrivingSchoolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DrivingSchoolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anameLabel))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel4.setLayout(new java.awt.GridBagLayout());

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
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        mainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainTableMouseClicked(evt);
            }
        });
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
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 653;
        gridBagConstraints.ipady = 463;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 9, 4, 0);
        jPanel4.add(typepanel, gridBagConstraints);

        dstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Driving Name", "Driving Address", "Driving Email", "Year Of Establishment", "Contact Person ", "Contact No", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(dstable);

        javax.swing.GroupLayout drivingSchoolpanelLayout = new javax.swing.GroupLayout(drivingSchoolpanel);
        drivingSchoolpanel.setLayout(drivingSchoolpanelLayout);
        drivingSchoolpanelLayout.setHorizontalGroup(
            drivingSchoolpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drivingSchoolpanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        drivingSchoolpanelLayout.setVerticalGroup(
            drivingSchoolpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drivingSchoolpanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 0, 5);
        jPanel4.add(drivingSchoolpanel, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void populateTable1() throws Exception {
        DefaultTableModel model = (DefaultTableModel) dstable.getModel();
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
            //row[8] = "Enable";

            if (person1.getActive() != false) {
                row[7] = "Active";
            } else {
                row[7] = "Deactive";
            }
            model.addRow(row);
        }
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AddNewVehicleFrame anv = new AddNewVehicleFrame();
        anv.setVisible(true);

        anv.setExtendedState(JFrame.MAXIMIZED_BOTH);
        anv.setUndecorated(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void mainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTableMouseClicked
        // TODO add your handling code here:
        int column = mainTable.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / mainTable.getRowHeight();

        if (row < mainTable.getRowCount() && row >= 0 && column < mainTable.getColumnCount() && column >= 0) {
            Object value = mainTable.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getName().equals("e")) {
                    System.out.println("Click On Edit Btn!!");
                    //EVENTOS MODIFICAR
                }
                if (boton.getName().equals("d")) {
                    JOptionPane.showConfirmDialog(null, "Are You want to delete?");
                    System.out.println("Click en el boton eliminar");
                    //EVENTOS ELIMINAR
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
    }//GEN-LAST:event_mainTableMouseClicked

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, null, "Are you sure you want to logout?", 1);
        this.setVisible(false);
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        lf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        lf.setUndecorated(true);

    }//GEN-LAST:event_LogoutBtnActionPerformed

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
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JLabel anameLabel;
    private javax.swing.JPanel drivingSchoolpanel;
    private javax.swing.JTable dstable;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable mainTable;
    private javax.swing.JButton typebtn;
    private javax.swing.JPanel typepanel;
    // End of variables declaration//GEN-END:variables

    private void ver_dsvTable(JTable mainTable) {

        mainTable.setDefaultRenderer(Object.class, new Render());

        JButton btn1 = new JButton("Edit");
        btn1.setName("e");
        JButton btn2 = new JButton("Delete");
        btn2.setName("d");

        DefaultTableModel d = new DefaultTableModel(
                new Object[][]{{"1", "Pedro", "15000", btn1, btn2}, {"2", "Juan", "15700", btn1, btn2}, {"3", "Rosa", "14000", btn1, btn2}, {"4", "Maria", "10000",}},
                new Object[]{"ID", "Name", "fees", "EDIT", "DELETE"}
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        mainTable.setModel(d);

        mainTable.setPreferredScrollableViewportSize(mainTable.getPreferredSize());

    }
}
