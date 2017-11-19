/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FoodBankEmployee.TransportationRole;

import FoodBankSystem.FoodBank.FoodBank;
import FoodBankSystem.Truck.Truck;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rui
 */
public class TruckManagementJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private FoodBank Foodbank;

    /**
     * Creates new form TransportationDeptJPanel
     */
    public TruckManagementJPanel(JPanel userProcessContainer,FoodBank Foodbank) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.Foodbank=Foodbank;
        populateTruckTable();
    }
    
    public void populateTruckTable(){
        int rowCount = TruckManagementTable.getRowCount();
        DefaultTableModel model=(DefaultTableModel)TruckManagementTable.getModel();
        for(int i = rowCount-1; i>=0;i--){
            model.removeRow(i);
        }
        for(Truck t: Foodbank.getTruckList().getTrucks()){
            Object row[]=new Object[6];
           row[0]=t;
           row[1]=t.getCondition();
           row[2]=t.getModel();
           row[3]=t.getTruckLoad();
           row[4]=t.getResponsibleDriver();
           //row[5]=t.getCondition();
           model.addRow(row);

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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TruckManagementTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        ViewTruckDetail = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Truck Management");

        TruckManagementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Truck ID", "Truck Model", "Truck Max Load", "Responsible Driver", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TruckManagementTable);

        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        ViewTruckDetail.setText("View Truck Detail");
        ViewTruckDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTruckDetailActionPerformed(evt);
            }
        });

        jButton3.setText("Add Truck");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Remove Truck");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(406, 406, 406)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ViewTruckDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(28, 28, 28)
                        .addComponent(ViewTruckDetail)))
                .addGap(28, 28, 28)
                .addComponent(jButton3)
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewTruckDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTruckDetailActionPerformed
        // TODO add your handling code here:
        int row = TruckManagementTable.getSelectedRow();  
        if (row < 0){
            JOptionPane.showMessageDialog(null,"Please select row from table first to view detail!", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        
            Truck t = (Truck) TruckManagementTable.getValueAt(row, 0);
            ViewTruckDetailJPanel vpdj = new ViewTruckDetailJPanel(userProcessContainer, t);
            userProcessContainer.add("ViewTruckDetailJPanel", vpdj);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);  
    }//GEN-LAST:event_ViewTruckDetailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AddTruckJPanel atjp = new AddTruckJPanel(userProcessContainer,Foodbank);
        userProcessContainer.add("AddTruckJPanel", atjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int row = TruckManagementTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Truck t = (Truck) TruckManagementTable.getValueAt(row, 0);
        Foodbank.getTruckList().removeTruck(t);
        populateTruckTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TruckManagementTable;
    private javax.swing.JButton ViewTruckDetail;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
