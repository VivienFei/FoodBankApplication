/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem;

import FoodBankSystem.Role.FoundationAdminRole;
import FoodBankSystem.UserAccount.UserAccount;

/**
 *
 * @author Cuishaowen
 */
public class ConfigureASystem {
    public static Foundation Configure(){
        Foundation foundation = Foundation.getInstance();
        
        
        UserAccount ua = foundation.getUserAccountDirectory().addUserAccount("Sysadmin", "admin", foundation, new FoundationAdminRole());
        
        return foundation;
    }
}
