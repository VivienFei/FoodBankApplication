/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ShelterAdmin;

import FoodBankSystem.Foundation;
import FoodBankSystem.Hunger.Hunger;
import FoodBankSystem.Menu.Menu;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Cuishaowen
 */
public class ViewHungerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHungerJPanel
     */
    
    private JPanel userProcessContainer;
    private Hunger hunger;
    private Foundation foundation;
    private String picPath;
    
    public ViewHungerJPanel(JPanel userProcessContainer, Hunger hunger, Foundation foundation) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hunger = hunger;
        populateComboBox();
        populateAll();
    }

    public void populateComboBox(){
        jComboBoxMenu.removeAllItems();
        
        for(Menu m : foundation.getMenuCatalog().getMenus())
        {
            jComboBoxMenu.addItem(m);
        }
    }
    
    private void populateAll(){
        txtFirstName.setText(hunger.getName().getFirstName());
        txtLastName.setText(hunger.getName().getLastName());
        
        if(hunger.getGender().equals("Male"))
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
        calendar.setTime(hunger.getBirthday());
        dateChooserComboBirthDay.setSelectedDate(calendar);
        
        txtIncome.setText(String.valueOf(hunger.getIncome()));
        txtGovernmentAid.setText(String.valueOf(hunger.getGovernmentaid()));
        txtHealthRanking.setText(String.valueOf(hunger.getHealthRanking()));
        jComboBoxMenu.setSelectedItem(hunger.getMenu());
        
        picPath = hunger.getPhoto();
        try {
                Image pic = ImageIO.read(new File(picPath));

                double pWidth = pic.getWidth(null);
                double pHeight = pic.getHeight(null);
                double pPercent = pWidth / pHeight;

                double lWidth = 155;
                double lHeight = 110;
                double lPercent = lWidth / lHeight;

                double percent;
                int newWidth;
                int newHeight;

                if(pPercent > lPercent)
                {
                    percent = lWidth / pWidth;
                    newWidth = (int)(pWidth * percent);
                    newHeight = (int) (pHeight * percent);
                }
                else
                {
                    percent = lHeight / pHeight;
                    newWidth = (int) (pWidth * percent);
                    newHeight = (int) (pHeight * percent);
                }

                BufferedImage bPic = new BufferedImage(newWidth,newHeight,BufferedImage.TYPE_INT_BGR);
                Graphics graphics = bPic.createGraphics();
                graphics.drawImage(pic, 0, 0, newWidth, newHeight, null);

                jLabelPhoto.setIcon(new ImageIcon(bPic));

                JOptionPane.showMessageDialog(null, "Select Picture Successfully!");

            } catch (IOException ex) {
                Logger.getLogger(ViewHungerJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        txtAddress1.setText(hunger.getAddress().getFirstLine());
        txtAddress2.setText(hunger.getAddress().getSecondLine());
        txtCity.setText(hunger.getAddress().getCity());
        txtState.setText(hunger.getAddress().getState());
        txtZip.setText(hunger.getAddress().getZipcode());
        txtAddress1.setText(hunger.getAddress().getCountry());
        
        txtFirstName.setEnabled(false);
        txtLastName.setEnabled(false);
        jRadioBtnMale.setEnabled(false);
        jRadioBtnFemale.setEnabled(false);
        dateChooserComboBirthDay.setEnabled(false);
        txtIncome.setEnabled(false);
        txtGovernmentAid.setEnabled(false);
        txtHealthRanking.setEnabled(false);
        jComboBoxMenu.setEnabled(false);
        txtAddress1.setEnabled(false);
        txtAddress2.setEnabled(false);
        txtCity.setEnabled(false);
        txtState.setEnabled(false);
        txtZip.setEnabled(false);
        txtCountry.setEnabled(false);
        uploadPicBtn.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtAddress2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        City = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        dateChooserComboBirthDay = new datechooser.beans.DateChooserCombo();
        jRadioBtnMale = new javax.swing.JRadioButton();
        jRadioBtnFemale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtIncome = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtGovernmentAid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtHealthRanking = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxMenu = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabelPhoto = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        uploadPicBtn = new javax.swing.JButton();

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setText("Gender:");

        jLabel3.setText("Last Name:");

        jLabel2.setText("First Name:");

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Hunger");

        jLabel9.setText("State:");

        City.setText("City:");

        jLabel11.setText("Country:");

        jLabel10.setText("Zip Code:");

        jLabel7.setText("Line 1:");

        jLabel8.setText("Line 2:");

        jLabel5.setText("BirthDay:");

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

        jLabel12.setText("Income:");

        jLabel13.setText("Government Aid:");

        jLabel14.setText("Health Ranking:");

        jLabel15.setText("Menu:");

        jComboBoxMenu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setText("Photo:");

        jLabelPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        uploadPicBtn.setText("Upload");
        uploadPicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPicBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioBtnMale)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioBtnFemale)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(dateChooserComboBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(uploadPicBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel15)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHealthRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGovernmentAid, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)
                        .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(City)
                        .addGap(18, 18, 18)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(jRadioBtnMale)
                    .addComponent(jRadioBtnFemale)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dateChooserComboBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(uploadPicBtn))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel13)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtHealthRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGovernmentAid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(City)
                            .addComponent(jLabel9))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate)
                        .addComponent(btnSave))
                    .addComponent(btnBack))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDashBottonJPanel mdbjp = (ManageDashBottonJPanel) component;
        mdbjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jRadioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnMaleActionPerformed
        jRadioBtnMale.setSelected(true);
        jRadioBtnFemale.setSelected(false);
    }//GEN-LAST:event_jRadioBtnMaleActionPerformed

    private void jRadioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnFemaleActionPerformed
        jRadioBtnMale.setSelected(false);
        jRadioBtnFemale.setSelected(true);
    }//GEN-LAST:event_jRadioBtnFemaleActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        txtFirstName.setEnabled(true);
        txtLastName.setEnabled(true);
        jRadioBtnMale.setEnabled(true);
        jRadioBtnFemale.setEnabled(true);
        dateChooserComboBirthDay.setEnabled(true);
        txtIncome.setEnabled(true);
        txtGovernmentAid.setEnabled(true);
        txtHealthRanking.setEnabled(true);
        jComboBoxMenu.setEnabled(true);
        txtAddress1.setEnabled(true);
        txtAddress2.setEnabled(true);
        txtCity.setEnabled(true);
        txtState.setEnabled(true);
        txtZip.setEnabled(true);
        txtCountry.setEnabled(true);
        btnSave.setEnabled(true);
        uploadPicBtn.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            hunger.getName().setFirstName(txtFirstName.getText());
            hunger.getName().setLastName(txtLastName.getText());

            if(jRadioBtnMale.isSelected())
            {
                hunger.setGender("Male");
            }
            else if(jRadioBtnFemale.isSelected())
            {
                hunger.setGender("Female");
            }

            Date birthday = dateChooserComboBirthDay.getSelectedDate().getTime();
            hunger.setBirthday(birthday);
            hunger.setGovernmentaid(Integer.parseInt(txtGovernmentAid.getText()));
            hunger.setIncome(Integer.parseInt(txtIncome.getText()));
            hunger.setHealthRanking(Integer.parseInt(txtHealthRanking.getText()));
            hunger.setMenu((Menu)jComboBoxMenu.getSelectedItem());
            hunger.setPhoto(picPath);
            
            hunger.getAddress().setFirstLine(txtAddress1.getText());
            hunger.getAddress().setSecondLine(txtAddress2.getText());
            hunger.getAddress().setCity(txtCity.getText());
            hunger.getAddress().setState(txtState.getText());
            hunger.getAddress().setZipcode(txtZip.getText());
            hunger.getAddress().setCountry(txtCountry.getText());

            populateAll();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void uploadPicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPicBtnActionPerformed

        JFileChooser picChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", "jpg");
        picChooser.setFileFilter(filter);
        int returnVal = picChooser.showOpenDialog(getParent());
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            picPath = picChooser.getSelectedFile().getPath();
            try {
                Image pic = ImageIO.read(new File(picPath));

                double pWidth = pic.getWidth(null);
                double pHeight = pic.getHeight(null);
                double pPercent = pWidth / pHeight;

                double lWidth = 155;
                double lHeight = 110;
                double lPercent = lWidth / lHeight;

                double percent;
                int newWidth;
                int newHeight;

                if(pPercent > lPercent)
                {
                    percent = lWidth / pWidth;
                    newWidth = (int)(pWidth * percent);
                    newHeight = (int) (pHeight * percent);
                }
                else
                {
                    percent = lHeight / pHeight;
                    newWidth = (int) (pWidth * percent);
                    newHeight = (int) (pHeight * percent);
                }

                BufferedImage bPic = new BufferedImage(newWidth,newHeight,BufferedImage.TYPE_INT_BGR);
                Graphics graphics = bPic.createGraphics();
                graphics.drawImage(pic, 0, 0, newWidth, newHeight, null);

                jLabelPhoto.setIcon(new ImageIcon(bPic));

                JOptionPane.showMessageDialog(null, "Select Picture Successfully!");

            } catch (IOException ex) {
                Logger.getLogger(ViewHungerJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadPicBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel City;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private datechooser.beans.DateChooserCombo dateChooserComboBirthDay;
    private javax.swing.JComboBox jComboBoxMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JRadioButton jRadioBtnFemale;
    private javax.swing.JRadioButton jRadioBtnMale;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGovernmentAid;
    private javax.swing.JTextField txtHealthRanking;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZip;
    private javax.swing.JButton uploadPicBtn;
    // End of variables declaration//GEN-END:variables
}
