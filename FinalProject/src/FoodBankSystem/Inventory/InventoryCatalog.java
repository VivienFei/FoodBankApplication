/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Inventory;

import FoodBankSystem.Supplier.Product.Product;
import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class InventoryCatalog {
    private ArrayList<Inventory> inventory;

    public InventoryCatalog() {
        inventory = new ArrayList<Inventory>();
    }

    public ArrayList<Inventory> getInventory() {
        return inventory;
    }
    
    public Inventory addInventory(Product p){
        Inventory i = new Inventory(p);
        inventory.add(i);
        return i;
    }
    
    public void removeInventory(Inventory i){
        inventory.remove(i);
    }
}
