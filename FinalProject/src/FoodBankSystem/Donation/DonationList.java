/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Donation;

import FoodBankSystem.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class DonationList {
    private ArrayList<Donation> donations;
    
    public DonationList(){
        donations = new ArrayList<Donation>();
    }

    public ArrayList<Donation> getDonations() {
        return donations;
    }
    
    public Donation addDonation(Person p){
        Donation d = new Donation(p);
        donations.add(d);
        return d;
    }
    
    public void addDonation(Donation d){
        donations.add(d);
    }
    
    public void removeDonation(Donation d){
        donations.remove(d);
    }
}
