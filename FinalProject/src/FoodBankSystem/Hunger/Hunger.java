/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Hunger;

import FoodBankSystem.DashButton.DashBotton;
import FoodBankSystem.Menu.Menu;
import FoodBankSystem.Person.Person;
import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class Hunger extends Person{
    private DashBotton db;
    private Menu menu;
    private int governmentaid;
    private int income;
    private int healthRanking;
    private String photo;
    
    public Hunger(String firstName, String lastName, Date birthday) {
        super(firstName, lastName, birthday);
        db = new DashBotton(this);
        menu = new Menu();
    }

    public DashBotton getDb() {
        return db;
    }

    public void setDb(DashBotton db) {
        this.db = db;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getGovernmentaid() {
        return governmentaid;
    }

    public void setGovernmentaid(int governmentaid) {
        this.governmentaid = governmentaid;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getHealthRanking() {
        return healthRanking;
    }

    public void setHealthRanking(int healthRanking) {
        this.healthRanking = healthRanking;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
