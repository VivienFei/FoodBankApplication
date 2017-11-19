/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Role;

import FoodBankSystem.Foundation;
import FoodBankSystem.Organiztion.Organization;
import FoodBankSystem.UserAccount.UserAccount;
import UserInterface.FoundationEmployee.FoundationFinancial.FoundationFinancialWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Cuishaowen
 */
public class FoundationFinancialRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Foundation foundation) {
        return new FoundationFinancialWorkArea(userProcessContainer, foundation);
    }
    
}
