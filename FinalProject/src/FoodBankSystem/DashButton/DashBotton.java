/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.DashButton;

import FoodBankSystem.Hunger.Hunger;

/**
 *
 * @author Cuishaowen
 */
public class DashBotton {
    private int id;
    private static int dbID;
    
    private Hunger hunger;

    public DashBotton(Hunger hunger) {
        id = dbID++;
        this.hunger = hunger;
    }

    public int getId() {
        return id;
    }

    public Hunger getHunger() {
        return hunger;
    }
}
