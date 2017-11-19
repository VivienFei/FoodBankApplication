/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ShelterAdmin;

import FoodBankSystem.Shelter.Shelter;
import FoodBankSystem.Staff.Employee.Employee;
import FoodBankSystem.Staff.Employee.ShelterEmployee;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Cuishaowen
 */
public class ViewEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewEmployeeJPanel
     */
    
    private JPanel userProcessContainer;
    private Employee employee;
    
    public ViewEmployeeJPanel(JPanel userProcessContainer, Employee employee) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.employee = employee;
        populatePhoneTypeComboBox();
        populateAll();
    }
    
    private void populatePhoneTypeComboBox(){
        jComboBoxPhoneType.removeAllItems();
        
        jComboBoxPhoneType.addItem("home");
        jComboBoxPhoneType.addItem("work");
        jComboBoxPhoneType.addItem("mobile");
    }
    
    private void populateAll(){
        txtFirstName.setText(employee.getName().getFirstName());
        txtLastName.setText(employee.getName().getLastName());
        
        if(employee.getGender().equals("Male"))
        {
            jRadioBtnMale.setSelected(true);
            jRadioBtnFemale.setSelected(false);
        }
        else
        {
            jRadioBtnFemale.setSelected(true);
            jRadioBtnMale.setSelected(false);
        }
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(employee.getBirthday());
        dateChooserComboBirthDay.setSelectedDate(calendar);
        
        txtSSN.setText(employee.getSsn());
        txtEmail.setText(employee.getEmail());
        txtPhoneNum.setText(employee.getPhoneNum());
        
        if(employee.getPhoneNumType().equals("home"))
        {
            jComboBoxPhoneType.setSelectedItem("home");
        }
        else if(employee.getPhoneNumType().equals("work"))
        {
            jComboBoxPhoneType.setSelectedItem("work");
        }
        else
        {
            jComboBoxPhoneType.setSelectedItem("mobile");
        }
        
        txtAddress1.setText(employee.getAddress().getFirstLine());
        txtAddress2.setText(employee.getAddress().getSecondLine());
        txtCity.setText(employee.getAddress().getCity());
        txtState.setText(employee.getAddress().getState());
        txtZip.setText(employee.getAddress().getZipcode());
        txtCountry.setText(employee.getAddress().getCountry());
        
        txtFirstName.setEnabled(false);
        txtLastName.setEnabled(false);
        jRadioBtnMale.setEnabled(false);
        jRadioBtnFemale.setEnabled(false);
        dateChooserComboBirthDay.setEnabled(false);
        txtSSN.setEnabled(false);
        txtEmail.setEnabled(false);
        txtPhoneNum.setEnabled(false);
        jComboBoxPhoneType.setEnabled(false);
        txtAddress1.setEnabled(false);
        txtAddress2.setEnabled(false);
        txtCity.setEnabled(false);
        txtState.setEnabled(false);
        txtZip.setEnabled(false);
        txtCountry.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        City = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtAddress2 = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxPhoneType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        dateChooserComboBirthDay = new datechooser.beans.DateChooserCombo();
        jRadioBtnMale = new javax.swing.JRadioButton();
        jRadioBtnFemale = new javax.swing.JRadioButton();
        txtState = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        City.setText("City:");

        jLabel8.setText("Line 2:");

        jLabel7.setText("Line 1:");

        jLabel11.setText("Country:");

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Employee");

        jLabel9.setText("State:");

        jLabel10.setText("Zip Code:");

        jLabel3.setText("Last Name:");

        jLabel2.setText("First Name:");

        jComboBoxPhoneType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("BirthDay:");

        jLabel15.setText("Phone Type:");

        jLabel4.setText("Gender:");

        jLabel14.setText("SSN:");

        jLabel13.setText("Phone Number:");

        jLabel6.setText("Address");

        jRadioBtnMale.setText("Male");
        jRadioBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnMaleActionPerformed(evt);
            }
        });

        jRadioBtnFemale.setText("Female");
        jRadioBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnFemaleActionPerformed(evt);
            }
        });

        jLabel12.setText("E-mail:");

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateChooserComboBirthDay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail)
                    .addComponent(jComboBoxPhoneType, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnSave))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(City)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAddress2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                                .addComponent(txtAddress1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioBtnMale)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioBtnFemale))
                                .addComponent(txtFirstName)
                                .addComponent(txtSSN)
                                .addComponent(txtPhoneNum))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(txtCountry))
                            .addGap(58, 58, 58)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dateChooserComboBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBoxPhoneType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addGap(79, 79, 79))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jRadioBtnMale)
                        .addComponent(jRadioBtnFemale))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8))
                        .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(City)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(127, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnMaleActionPerformed
        jRadioBtnMale.setSelected(true);
        jRadioBtnFemale.setSelected(false);
    }//GEN-LAST:event_jRadioBtnMaleActionPerformed

    private void jRadioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnFemaleActionPerformed
        jRadioBtnMale.setSelected(false);
        jRadioBtnFemale.setSelected(true);
    }//GEN-LAST:event_jRadioBtnFemaleActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageEmployeeJPanel mejp = (ManageEmployeeJPanel) component;
        mejp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String firstName = txtFirstName.getText().trim();
        String lastName = txtLastName.getText().trim();
        
        if(firstName.equals("") || lastName.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter first name and last name", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
            employee.getName().setFirstName(txtFirstName.getText());
            employee.getName().setLastName(txtLastName.getText());
            
            if(jRadioBtnMale.isSelected())
            {
                employee.setGender("Male");
            }
            else if(jRadioBtnFemale.isSelected())
            {
                employee.setGender("Female");
            }            
            
            Date birthday = dateChooserComboBirthDay.getSelectedDate().getTime();
            employee.setBirthday(birthday);
            employee.setSsn(txtSSN.getText());
            employee.setEmail(txtEmail.getText());
            employee.setPhoneNum(txtPhoneNum.getText());
            employee.setPhoneNumType((String)jComboBoxPhoneType.getSelectedItem());
            employee.getAddress().setFirstLine(txtAddress1.getText());
            employee.getAddress().setSecondLine(txtAddress2.getText());
            employee.getAddress().setCity(txtCity.getText());
            employee.getAddress().setState(txtState.getText());
            employee.getAddress().setZipcode(txtZip.getText());
            employee.getAddress().setCountry(txtCountry.getText());
            
            populateAll();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        txtFirstName.setEnabled(true);
        txtLastName.setEnabled(true);
        jRadioBtnMale.setEnabled(true);
        jRadioBtnFemale.setEnabled(true);
        dateChooserComboBirthDay.setEnabled(true);
        txtSSN.setEnabled(true);
        txtEmail.setEnabled(true);
        txtPhoneNum.setEnabled(true);
        jComboBoxPhoneType.setEnabled(true);
        txtAddress1.setEnabled(true);
        txtAddress2.setEnabled(true);
        txtCity.setEnabled(true);
        txtState.setEnabled(true);
        txtZip.setEnabled(true);
        txtCountry.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel City;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private datechooser.beans.DateChooserCombo dateChooserComboBirthDay;
    private javax.swing.JComboBox<String> jComboBoxPhoneType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioBtnFemale;
    private javax.swing.JRadioButton jRadioBtnMale;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}