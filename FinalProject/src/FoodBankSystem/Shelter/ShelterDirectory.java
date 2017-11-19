/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Shelter;

import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class ShelterDirectory {
    private ArrayList<Shelter> shelters;

    public ShelterDirectory() {
        shelters = new ArrayList<Shelter>();
    }

    public ArrayList<Shelter> getShelters() {
        return shelters;
    }
    
    public Shelter addShelter(String name){
        Shelter s = new Shelter(name);
        shelters.add(s);
        return s;
    }
    
    public void removeShelter(Shelter s){
        shelters.remove(s);
    }
}
