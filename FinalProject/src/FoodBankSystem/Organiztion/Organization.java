/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Organiztion;

import FoodBankSystem.Inventory.InventoryCatalog;
import FoodBankSystem.Role.Role;
import FoodBankSystem.Staff.StaffDirectory;
import FoodBankSystem.StorageCondition.StorageCondition;
import FoodBankSystem.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public abstract class Organization {
    private double funds;
    
    private StorageCondition storageCondition;
    private StaffDirectory staffDirectory;
    private UserAccountDirectory userAccountDirectory;
    private InventoryCatalog inventoryCatalog;

    public Organization() {
        storageCondition = new StorageCondition();
        staffDirectory = new StaffDirectory();
        userAccountDirectory = new UserAccountDirectory();
        inventoryCatalog = new InventoryCatalog();
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public StorageCondition getStorageCondition() {
        return storageCondition;
    }

    public void setStorageCondition(StorageCondition storageCondition) {
        this.storageCondition = storageCondition;
    }

    public StaffDirectory getStaffDirectory() {
        return staffDirectory;
    }

    public void setStaffDirectory(StaffDirectory staffDirectory) {
        this.staffDirectory = staffDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public InventoryCatalog getInventoryCatalog() {
        return inventoryCatalog;
    }

    public void setInventoryCatalog(InventoryCatalog inventoryCatalog) {
        this.inventoryCatalog = inventoryCatalog;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }
    
}
