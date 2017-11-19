/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.FoodBank;

import FoodBankSystem.Donation.DonationList;
import FoodBankSystem.Activity.ActivityDirectory;
import FoodBankSystem.Inventory.InventoryCatalog;
import FoodBankSystem.Order.MasterOrderList;
import FoodBankSystem.Organiztion.Organization;
import FoodBankSystem.Role.FoodBankAdminRole;
import FoodBankSystem.Role.Role;
import FoodBankSystem.Shelter.ShelterDirectory;
import FoodBankSystem.Supplier.SupplierDirectory;
import FoodBankSystem.Truck.TruckList;
import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class FoodBank extends Organization{
    private String name;
    private static int count;
    private int ID;
    
    private TruckList truckList;
    private DonationList donationList;
    private MasterOrderList masterOrderList;
    private SupplierDirectory supplierDirectory;
    private ShelterDirectory shelterDirectory;
    private ActivityDirectory activityDirectory;
    private InventoryCatalog inventoryCatalog;

    public FoodBank(String name) {
        super();
        ID = count++;
        this.name = name;
        truckList = new TruckList();
        donationList = new DonationList();
        masterOrderList = new MasterOrderList();
        supplierDirectory = new SupplierDirectory();
        shelterDirectory = new ShelterDirectory();
        activityDirectory = new ActivityDirectory();
        inventoryCatalog = new InventoryCatalog();
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public TruckList getTruckList() {
        return truckList;
    }

    public DonationList getDonationList() {
        return donationList;
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public ShelterDirectory getShelterDirectory() {
        return shelterDirectory;
    }

    public ActivityDirectory getActivityDirectory() {
        return activityDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodBankAdminRole());
        return roles;
    }

    @Override
    public String toString() {
        return name;
    }
}
