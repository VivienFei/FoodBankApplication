/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Hunger;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class HungerDirectory {
    private ArrayList<Hunger> hungers;

    public HungerDirectory() {
        hungers = new ArrayList<Hunger>();
    }

    public ArrayList<Hunger> getHungers() {
        return hungers;
    }
    
    public Hunger addHunger(String firstName, String lastName, Date birthday){
        Hunger h = new Hunger(firstName, lastName, birthday);
        hungers.add(h);
        return h;
    }
    
    public void removeHunger(Hunger h){
        hungers.remove(h);
    }
}
