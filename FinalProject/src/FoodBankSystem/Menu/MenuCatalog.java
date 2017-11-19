/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Menu;

import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class MenuCatalog {
    private ArrayList<Menu> menus;

    public MenuCatalog() {
        menus = new ArrayList<Menu>();
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }
    
    public Menu addMenu(){
        Menu m = new Menu();
        menus.add(m);
        return m;
    }
    
    public void removeMenu(Menu m){
        menus.remove(m);
    }
}
