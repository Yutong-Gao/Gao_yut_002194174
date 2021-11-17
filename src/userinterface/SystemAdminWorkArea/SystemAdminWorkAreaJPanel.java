/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;

import Business.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        btnManageNetwork.setText("Manage All Customers");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        btnManageEnterprise.setText("Manage Restaurants");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManageAdmin.setText("Manage Deliveryman");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnManageAdmin)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnManageEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addGap(54, 54, 54)
                .addComponent(btnManageNetwork)
                .addGap(18, 18, 18)
                .addComponent(btnManageEnterprise)
                .addGap(18, 18, 18)
                .addComponent(btnManageAdmin)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed

        JPanel manageDeliveryManJPanel  = new ManageDeliveryManJPanel(userProcessContainer,ecosystem);
        userProcessContainer.add(manageDeliveryManJPanel);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed

        JPanel manageRestaurantJPanel  = new ManageRestaurantJPanel(userProcessContainer,ecosystem);
        userProcessContainer.add(manageRestaurantJPanel);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        JPanel manageCustomerJPanel  = new ManageCustomerJPanel(userProcessContainer,ecosystem);
        userProcessContainer.add(manageCustomerJPanel);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);

    }//GEN-LAST:event_btnManageNetworkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
