/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Donation;

import FoodBankSystem.Person.Person;
import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class Donation {
    private int id;
    private static int donationID;
    private Person person;
    private double quantity;
    private Date donationDate;
    private Date receiveDate;
    private String network;
    private String foodBank;

    public Donation(Person p) {
        id = donationID++;
        person = p;
        donationDate = new Date();
        receiveDate = new Date();
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public double getQuantity() {
        return quantity;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getFoodBank() {
        return foodBank;
    }

    public void setFoodBank(String foodBank) {
        this.foodBank = foodBank;
    }
    
    @Override
    public String toString(){
        return person.getName().getFirstName() + " " + person.getName().getLastName();
    }
}
