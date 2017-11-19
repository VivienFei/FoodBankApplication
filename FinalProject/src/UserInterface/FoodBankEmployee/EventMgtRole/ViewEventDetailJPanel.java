/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FoodBankEmployee.EventMgtRole;

import FoodBankSystem.Activity.Activity;
import FoodBankSystem.FoodBank.FoodBank;
import FoodBankSystem.Staff.Employee.Employee;
import java.awt.CardLayout;
import java.util.Calendar;
import javax.swing.JPanel;

/**
 *
 * @author Rui
 */
public class ViewEventDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EventDetailJPanel
     */
    JPanel userProcessContainer;
    Activity activity;
    FoodBank foodbank;
    
    public ViewEventDetailJPanel(JPanel userProcessContainer, Activity activity, FoodBank foodbank) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.activity = activity;
        this.foodbank = foodbank;
        
        popAllInformation();
        
        eventNameText.setEnabled(false);
        eventTypeCombox.setEnabled(false);
        eventDateChooser.setEnabled(false);
        eventLocationText.setEnabled(false);
        eventTargetText.setEnabled(false);
        responsiblePersonCombox.setEnabled(false);
        saveButton.setEnabled(false);
                
    }

    public void popEventTypeCombox()
    {
        eventTypeCombox.removeAllItems();
        eventTypeCombox.addItem("Funding raising");
        eventTypeCombox.addItem("Advertising Campaign");
        eventTypeCombox.addItem("Hiring");
        eventTypeCombox.addItem("Volunteer Activities");
        
    }
    
    public void popResponsiblePersonCombox()
    {
        responsiblePersonCombox.removeAllItems();
        
        for (Employee responsiblePerson : foodbank.getStaffDirectory().getEmployeeDirectory().getEmployees())
        {            
            responsiblePersonCombox.addItem(responsiblePerson);
        }
        
    }
    
    private void popAllInformation()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(activity.getDate());
        
        eventNameText.setText(activity.getName());
        popEventTypeCombox();
        eventTypeCombox.setSelectedItem(activity.getType());
        eventDateChooser.setSelectedDate(calendar);
        eventLocationText.setText(activity.getLocation());
        eventTargetText.setText(activity.getTarget());
        popResponsiblePersonCombox();
        responsiblePersonCombox.setSelectedItem(activity.getResponsiblePerson());        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eventNameText = new javax.swing.JTextField();
        eventTypeCombox = new javax.swing.JComboBox();
        eventDateChooser = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventLocationText = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventTargetText = new javax.swing.JTextArea();
        viewManageVolunteerButton = new javax.swing.JButton();
        updateInformationButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        responsiblePersonCombox = new javax.swing.JComboBox();

        eventTypeCombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("View/Manage Event");

        jLabel2.setText("Event Name");

        jLabel3.setText("Event Type");

        jLabel4.setText("Event Date");

        jLabel5.setText("Target");

        jLabel6.setText("Responsible person");

        jLabel7.setText("Event Location");

        eventLocationText.setColumns(20);
        eventLocationText.setRows(5);
        jScrollPane2.setViewportView(eventLocationText);

        eventTargetText.setColumns(20);
        eventTargetText.setRows(5);
        jScrollPane1.setViewportView(eventTargetText);

        viewManageVolunteerButton.setText("View/Manage Volunteer");
        viewManageVolunteerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewManageVolunteerButtonActionPerformed(evt);
            }
        });

        updateInformationButton.setText("Update Information");
        updateInformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInformationButtonActionPerformed(evt);
            }
        });

        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        responsiblePersonCombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(responsiblePersonCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backButton)
                    .addComponent(viewManageVolunteerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(updateInformationButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(eventDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(eventTypeCombox, javax.swing.GroupLayout.Alignment.LEADING, 0, 127, Short.MAX_VALUE)
                                    .addComponent(eventNameText, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addGap(0, 161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eventNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(eventTypeCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(responsiblePersonCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateInformationButton)
                    .addComponent(saveButton))
                .addGap(17, 17, 17)
                .addComponent(viewManageVolunteerButton)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateInformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInformationButtonActionPerformed
        updateInformationButton.setEnabled(false);
        eventNameText.setEnabled(true);
        eventTypeCombox.setEnabled(true);
        popEventTypeCombox();
        eventDateChooser.setEnabled(true);
        eventLocationText.setEnabled(true);
        eventTargetText.setEnabled(true);
        responsiblePersonCombox.setEnabled(true);
        
        saveButton.setEnabled(true);
        
        popResponsiblePersonCombox();
        
    }//GEN-LAST:event_updateInformationButtonActionPerformed

    private void viewManageVolunteerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewManageVolunteerButtonActionPerformed
        ManageEventVolunteerJPanel mevjp = new ManageEventVolunteerJPanel(userProcessContainer, activity, foodbank);
        userProcessContainer.add("ManageEventVolunteerJPanel", mevjp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewManageVolunteerButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        String eventName = eventNameText.getText();
        String eventType = (String)eventTypeCombox.getSelectedItem();
        Calendar eventDate = eventDateChooser.getSelectedDate();
        String eventLocation = eventLocationText.getText();
        String eventTarget = eventTargetText.getText();
        Employee responsiblePerson = (Employee)responsiblePersonCombox.getSelectedItem();
        
        activity.setName(eventName);
        activity.setType(eventType);
        activity.setDate(eventDate.getTime());
        activity.setLocation(eventLocation);
        activity.setTarget(eventTarget);
        activity.setResponsiblePerson(responsiblePerson);                       
        
        updateInformationButton.setEnabled(true);
        eventNameText.setEnabled(false);
        eventTypeCombox.setEnabled(false);
        eventDateChooser.setEnabled(false);
        eventLocationText.setEnabled(false);
        eventTargetText.setEnabled(false);
        responsiblePersonCombox.setEnabled(false);
        saveButton.setEnabled(false);
       
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private datechooser.beans.DateChooserCombo eventDateChooser;
    private javax.swing.JTextArea eventLocationText;
    private javax.swing.JTextField eventNameText;
    private javax.swing.JTextArea eventTargetText;
    private javax.swing.JComboBox eventTypeCombox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox responsiblePersonCombox;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton updateInformationButton;
    private javax.swing.JButton viewManageVolunteerButton;
    // End of variables declaration//GEN-END:variables
}