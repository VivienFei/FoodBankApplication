/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Menu;

import FoodBankSystem.Supplier.Product.Product;
import java.util.ArrayList;

/**
 *
 * @author Rui
 */
public class MenuItemList {
    private ArrayList<MenuItem> menuItems;

    public MenuItemList() {
        menuItems = new ArrayList<MenuItem>();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }    
    
    public MenuItem addMenuItem(Product p){
        MenuItem mi = new MenuItem(p);
        menuItems.add(mi);
        return mi;
    }
    
    public void removeMenuItem(MenuItem mi){
        menuItems.remove(mi);
    }

}
