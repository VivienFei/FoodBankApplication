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

/**
 *
 * @author Cuishaowen
 */
public abstract class Role {
    
    public enum RoleType{
        ActivityManagement("Activity Management Role"), 
        Nutrition("Nutrition Role"),
        SupplierManagement("Supplier Management Role"),
        Transportation("Transportation Role"),
        ShelterManagement("Shelter Management Role"),
        FoundationAdmin("Foundation Admin Role"),
        FoundationFinancial("Foundation Financial Role"),
        FoodBankAdmin("Food Bank Admin Role"),
        ShelterAdmin("Shelter Admin Role");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Foundation foundation);
}
