/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.FoodBank;

import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class FoodBankDirectory {
    private ArrayList<FoodBank> foodBanks;
    
    public FoodBankDirectory(){
        foodBanks = new ArrayList<FoodBank>();
    }

    public ArrayList<FoodBank> getFoodBanks() {
        return foodBanks;
    }
    
    public FoodBank addFoodBank(String name){
        FoodBank f = new FoodBank(name);
        foodBanks.add(f);
        return f;
    }
    
    public void removeFoodBank(FoodBank f){
        foodBanks.remove(f);
    }
}
