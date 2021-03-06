/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FoodBankEmployee.EventMgtRole;

import FoodBankSystem.Activity.Activity;
import FoodBankSystem.FoodBank.FoodBank;
import FoodBankSystem.Staff.Volunteer;
import FoodBankSystem.Staff.VolunteerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rui
 */
public class ManageEventVolunteerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewManageVolunteerJPanel
     */
     JPanel userProcessContainer;
     Activity activity;
     FoodBank foodbank;
     VolunteerDirectory volunteerDirectory;
    public ManageEventVolunteerJPanel( JPanel userProcessContainer,Activity activity, FoodBank foodbank) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.activity = activity;
        this.foodbank = foodbank;
        volunteerDirectory = foodbank.getStaffDirectory().getVolunteerDirectory();
        popVolunteerCombox();
        popVolunteerTable();
    }

    public void popVolunteerCombox()
    {
        volunteerCombox.removeAllItems();
        for (Volunteer volunteer : volunteerDirectory.getVolunteers())
        {
            volunteerCombox.addItem(volunteer);
        }
    }
    public void popVolunteerTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)volunteerTable.getModel();
        dtm.setRowCount(0);
        
        for(Volunteer volunteer : activity.getVolunteerDirectory().getVolunteers())
        {
            Object[] row = new Object[1];
            row[0] = volunteer;
            dtm.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        volunteerTable = new javax.swing.JTable();
        addVolunteerButton = new javax.swing.JButton();
        volunteerCombox = new javax.swing.JComboBox();
        removeButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Manage Event Volunteer");

        volunteerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ));
        jScrollPane1.setViewportView(volunteerTable);

        addVolunteerButton.setText("Add Volunteer");
        addVolunteerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVolunteerButtonActionPerformed(evt);
            }
        });

        volunteerCombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        removeButton.setText("Remove Volunteer");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volunteerCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addVolunteerButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volunteerCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addVolunteerButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(backButton))
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addVolunteerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVolunteerButtonActionPerformed
        Volunteer volunteer = (Volunteer) volunteerCombox.getSelectedItem();
        
        activity.getVolunteerDirectory().addVolunteer(volunteer);
        
        volunteerDirectory.removeVolunteer(volunteer);
        
        popVolunteerTable();
        popVolunteerCombox();
    }//GEN-LAST:event_addVolunteerButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int selectedRow = volunteerTable.getSelectedRow();
        
        Volunteer volunteer = (Volunteer)volunteerTable.getValueAt(selectedRow, 0);
        
        activity.getVolunteerDirectory().removeVolunteer(volunteer);
        volunteerDirectory.addVolunteer(volunteer);
        popVolunteerCombox();
        popVolunteerTable();
    }//GEN-LAST:event_removeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVolunteerButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeButton;
    private javax.swing.JComboBox volunteerCombox;
    private javax.swing.JTable volunteerTable;
    // End of variables declaration//GEN-END:variables
}
