/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Order;

import FoodBankSystem.Shelter.Shelter;
import FoodBankSystem.Supplier.Product.Product;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class Order {
    private ArrayList<OrderItem> order;
    private Shelter shelter;
    private Date date;

    public Order(Shelter s) {
        order = new ArrayList<OrderItem>();
        date = new Date();
        this.shelter = s;
    }

    public ArrayList<OrderItem> getOrder() {
        return order;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public Date getDate() {
        return date;
    }
    
    public OrderItem addOrderItem(Product p){
        OrderItem o = new OrderItem(p);
        order.add(o);
        return o;
    }
    
    public void removeOrderItem(OrderItem o){
        order.remove(o);
    }
}
