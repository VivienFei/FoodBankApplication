/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.DashButton;

import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class DashBottonList {
    private ArrayList<DashBotton> dashBottons;

    public DashBottonList() {
        dashBottons = new ArrayList<DashBotton>();
    }

    public ArrayList<DashBotton> getDashBottons() {
        return dashBottons;
    }
    
    public void addDashBotton(DashBotton db){
        dashBottons.add(db);
    }
    
    public void removeDashBotton(DashBotton db){
        dashBottons.remove(db);
    }
}
