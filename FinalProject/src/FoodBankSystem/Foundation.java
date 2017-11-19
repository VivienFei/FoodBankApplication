/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem;

import FoodBankSystem.Donation.DonationList;
import FoodBankSystem.Menu.MenuCatalog;
import FoodBankSystem.Network.NetworkCatalog;
import FoodBankSystem.Organiztion.Organization;
import FoodBankSystem.Role.FoundationAdminRole;
import FoodBankSystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class Foundation extends Organization{
    private static Foundation foundation;
    
    private NetworkCatalog networks;
    
    private DonationList donationList;
    private DonationList unreceived;
    
    private MenuCatalog menuCatalog;

    private Foundation() {
        super();
        networks = new NetworkCatalog();
        donationList = new DonationList();
        unreceived = new DonationList();
        menuCatalog = new MenuCatalog();
    }
    
    public static Foundation getInstance(){
        if(foundation == null)
        {
            foundation = new Foundation();
        }
        return foundation;
    }

    public NetworkCatalog getNetworks() {
        return networks;
    }

    public DonationList getDonationList() {
        return donationList;
    }

    public DonationList getUnreceived() {
        return unreceived;
    }

    public MenuCatalog getMenuCatalog() {
        return menuCatalog;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoundationAdminRole());
        return roles;
    }

    @Override
    public String toString() {
        return "Foundation";
    }
}
