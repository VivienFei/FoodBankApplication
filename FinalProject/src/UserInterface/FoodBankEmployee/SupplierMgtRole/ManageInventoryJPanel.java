/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FoodBankEmployee.SupplierMgtRole;
import FoodBankSystem.FoodBank.FoodBank;
import FoodBankSystem.Inventory.Inventory;
import FoodBankSystem.Inventory.InventoryCatalog;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fjj1213
 */
public class ManageInventoryJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private FoodBank Foodbank;
    private InventoryCatalog inventoryCatalog;

    /**
     * Creates new form ManageInventoryJPanel
     */
    public ManageInventoryJPanel(JPanel userProcessContainer,FoodBank Foodbank) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.Foodbank=Foodbank;
        
        //populateTable();
        populateInventoryTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void populateInventoryTable(){
        DefaultTableModel model = (DefaultTableModel) InventoryCatalog.getModel();
        
        model.setRowCount(0);
        
        for (Inventory inventory:Foodbank.getInventoryCatalog().getInventory()){
            Object[] row = new Object[4];
            row[0] = inventory;
            row[1] = inventory.getQuantity();
            row[2] = inventory.getProduct().getType();
            row[3] = inventory.getProduct().getSubstitute();
            
            model.addRow(row);
        }
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        InventoryCatalog = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        addtoCartButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        InventoryCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ProductName", "ProductQuantity", "ProductType", "ProductSubstitute"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(InventoryCatalog);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("Manage Inventory ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        addtoCartButton6.setText("Decrease Quantity");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("Increase Quantity");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addtoCartButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel5)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addtoCartButton6))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(DeleteButton)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int row = InventoryCatalog.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the inventory?","Warning",dialogButton);
            if (dialogResult == JOptionPane.YES_NO_OPTION){
                  Inventory i = (Inventory) InventoryCatalog.getValueAt(row, 0);
                  inventoryCatalog.removeInventory(i);
                  
                  populateInventoryTable();
            
            }
       }
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        // TODO add your handling code here:
        int selectedRow = InventoryCatalog.getSelectedRow();
        Inventory selectedInventory;
        
         if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Select a row","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        } else{
            selectedInventory = (Inventory)InventoryCatalog.getValueAt(selectedRow,0);
        }
        
        int fetcheQty = (Integer)quantitySpinner.getValue();
        if(fetcheQty<=0){
            JOptionPane.showMessageDialog(this, "Select at least one quantity","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else {    
            int oldQuantity = selectedInventory.getQuantity();
            int newQuantity = oldQuantity-fetcheQty;
            selectedInventory.setQuantity(newQuantity);
            populateInventoryTable();
            

        }

    }//GEN-LAST:event_addtoCartButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = InventoryCatalog.getSelectedRow();
        Inventory selectedInventory;
        
         if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Select a row","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        } else{
            selectedInventory = (Inventory)InventoryCatalog.getValueAt(selectedRow,0);
        }
        
        int fetcheQty = (Integer)quantitySpinner.getValue();
        if(fetcheQty<=0){
            JOptionPane.showMessageDialog(this, "Select at least one quantity","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else {    
            int oldQuantity = selectedInventory.getQuantity();
            int newQuantity = oldQuantity+fetcheQty;
            selectedInventory.setQuantity(newQuantity);
            populateInventoryTable();
       
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTable InventoryCatalog;
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner quantitySpinner;
    // End of variables declaration//GEN-END:variables
}
