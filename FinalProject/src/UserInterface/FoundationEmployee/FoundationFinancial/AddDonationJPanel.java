/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FoundationEmployee.FoundationFinancial;

import FoodBankSystem.Foundation;
import javax.swing.JPanel;

/**
 *
 * @author Cuishaowen
 */
public class AddDonationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDonationJPanel
     */
    
    private JPanel userProcessContainer;
    private Foundation foundation;
    
    public AddDonationJPanel(JPanel userProcessContainer, Foundation foundation) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.foundation = foundation;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
