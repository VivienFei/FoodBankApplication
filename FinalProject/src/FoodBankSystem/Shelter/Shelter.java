/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Shelter;

import FoodBankSystem.DashButton.DashBottonList;
import FoodBankSystem.DashButton.DashButtonRecorderList;
import FoodBankSystem.Hunger.HungerDirectory;
import FoodBankSystem.Menu.MenuCatalog;
import FoodBankSystem.Order.OrderList;
import FoodBankSystem.Organiztion.Organization;
import FoodBankSystem.Person.Address;
import FoodBankSystem.Role.Role;
import FoodBankSystem.Role.ShelterAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class Shelter extends Organization{
    private String name;
    private static int shelterID;
    private int id;
    private Address location;
    
    private DashButtonRecorderList dashButtonRecorderList;
    private OrderList orderList;
    private MenuCatalog menuCatalog;
    private HungerDirectory hungerDirectory;
    private DashBottonList dashBottonList;
    
    public Shelter(String name){
        super();
        this.name = name;
        id = shelterID++;
        dashButtonRecorderList = new DashButtonRecorderList();
        orderList = new OrderList();
        menuCatalog = new MenuCatalog();
        hungerDirectory = new HungerDirectory();
        dashBottonList = new DashBottonList();
        location = new Address();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public DashButtonRecorderList getDashButtonRecorderList() {
        return dashButtonRecorderList;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public MenuCatalog getMenuCatalog() {
        return menuCatalog;
    }

    public HungerDirectory getHungerDirectory() {
        return hungerDirectory;
    }

    public DashBottonList getDashBottonList() {
        return dashBottonList;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShelterAdminRole());
        return roles;
    }

    @Override
    public String toString() {
        return name;
    }
}
