/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.UserAccount;

import FoodBankSystem.Organiztion.Organization;
import FoodBankSystem.Person.Person;
import FoodBankSystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccounts;

    public UserAccountDirectory() {
        userAccounts = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccounts() {
        return userAccounts;
    }
    
    public UserAccount addUserAccount(String userName, String password, Person person, Role role){
        UserAccount ua = new UserAccount(userName, password, person);
        ua.setRole(role);
        userAccounts.add(ua);
        return ua;
    }
    
    public UserAccount addUserAccount(String userName, String password, Organization organization, Role role){
        UserAccount ua = new UserAccount(userName, password, organization);
        ua.setRole(role);
        userAccounts.add(ua);
        return ua;
    }
    
    public void removeUserAccount(UserAccount ua){
        userAccounts.add(ua);
    }
    
    public UserAccount authenticateUser(String username, String password)
    {
        for (UserAccount ua : userAccounts)
        {
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password))
            {
                return ua;
            }
        }
        return null;
    }
    
    public boolean checkIfUsernameIsUnique(String username)
    {
        for (UserAccount ua : userAccounts)
        {
            if (ua.getUserName().equals(username))
            {
                return false;
            }
        }
        return true;
    }
}
