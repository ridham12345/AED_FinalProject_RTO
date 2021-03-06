/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.AdminHome;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.table.JTableHeader;


/**
 *
 * @author Yash Patel
 */
public class AdminCustomer extends javax.swing.JPanel {

    /**
     * Creates new form AdminCustomer
     */
    public AdminCustomer() {
        initComponents();
        
        JTableHeader tableHeader = acTable.getTableHeader();
        tableHeader.setBackground(Color.red);
        tableHeader.setForeground(Color.white);
        Font headerFont = new Font("Verdana", Font.BOLD, 16);
        tableHeader.setFont(headerFont);    
        tableHeader.setPreferredSize(new Dimension(500, 32));
        acTable.setRowHeight(20);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acPanel = new javax.swing.JPanel();
        acButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        acTable = new javax.swing.JTable();

        acButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        acButton.setText("+ Add New Customer");

        acTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Date Of Birth", "Birth place", "Email", "Address", "Mobile", "Password", "Status"
            }
        ));
        jScrollPane1.setViewportView(acTable);

        javax.swing.GroupLayout acPanelLayout = new javax.swing.GroupLayout(acPanel);
        acPanel.setLayout(acPanelLayout);
        acPanelLayout.setHorizontalGroup(
            acPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                    .addGroup(acPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(acButton)))
                .addGap(18, 18, 18))
        );
        acPanelLayout.setVerticalGroup(
            acPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(acButton)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 932, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(acPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(acPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acButton;
    private javax.swing.JPanel acPanel;
    private javax.swing.JTable acTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
