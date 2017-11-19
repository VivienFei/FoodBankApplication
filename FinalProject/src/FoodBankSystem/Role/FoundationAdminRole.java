/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Role;

import FoodBankSystem.Foundation;
import FoodBankSystem.Organiztion.Organization;
import FoodBankSystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.foundationadmin.FoundationAdminWorkArea;

/**
 *
 * @author Cuishaowen
 */
public class FoundationAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Foundation foundation) {
        return new FoundationAdminWorkArea(userProcessContainer, foundation);
    }
    
}
