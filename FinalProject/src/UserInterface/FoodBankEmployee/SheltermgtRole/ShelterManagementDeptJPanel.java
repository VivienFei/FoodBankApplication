/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FoodBankEmployee.ShelterMgtRole;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rui
 */
public class ShelterManagementDeptJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShelterManagementDeptJPanel
     */
    JPanel userProcessContainer;
    public ShelterManagementDeptJPanel(JPanel userProcessContainer) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageShelterButton = new javax.swing.JButton();
        manageShelterOrdersButton = new javax.swing.JButton();
        viewPastOrdersButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Shelter Management Dept");

        manageShelterButton.setText("Manage Shelter");
        manageShelterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageShelterButtonActionPerformed(evt);
            }
        });

        manageShelterOrdersButton.setText("Manage Shelter Orders");
        manageShelterOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageShelterOrdersButtonActionPerformed(evt);
            }
        });

        viewPastOrdersButton.setText("View Past Orders");
        viewPastOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPastOrdersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageShelterOrdersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageShelterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewPastOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(manageShelterButton)
                .addGap(32, 32, 32)
                .addComponent(manageShelterOrdersButton)
                .addGap(29, 29, 29)
                .addComponent(viewPastOrdersButton)
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageShelterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageShelterButtonActionPerformed
        ManageShelterJPanel msjp = new ManageShelterJPanel(userProcessContainer);
        userProcessContainer.add("ManageShelterJPanel", msjp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageShelterButtonActionPerformed

    private void manageShelterOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageShelterOrdersButtonActionPerformed
        ManageShelterOrderJPanel msojp = new ManageShelterOrderJPanel(userProcessContainer);
        userProcessContainer.add("msojp", msojp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageShelterOrdersButtonActionPerformed

    private void viewPastOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPastOrdersButtonActionPerformed
        ViewShelterOrderJPanel vsojp = new ViewShelterOrderJPanel(userProcessContainer);
        userProcessContainer.add("vsojp", vsojp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPastOrdersButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageShelterButton;
    private javax.swing.JButton manageShelterOrdersButton;
    private javax.swing.JButton viewPastOrdersButton;
    // End of variables declaration//GEN-END:variables
}
