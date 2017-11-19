/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Order;

import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class OrderList {
    private ArrayList<Order> orders;

    public OrderList() {
        orders = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
    
    public void addOrder(Order o){
        orders.add(o);
    }
    
    public void removeOrder(Order o){
        orders.remove(o);
    }
}
