/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Network;

import FoodBankSystem.FoodBank.FoodBankDirectory;

/**
 *
 * @author Cuishaowen
 */
public class Network {
    private String name;
    private FoodBankDirectory foodBankDirectory;
    
    public Network(String name){
        this.name = name;
        foodBankDirectory = new FoodBankDirectory();
    }

    public String getName() {
        return name;
    }

    public FoodBankDirectory getFoodBankDirectory() {
        return foodBankDirectory;
    }

    @Override
    public String toString() {
        return name;
    }
}
