/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Order;

import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class DailyOrderList {
    private Date date;
    private OrderList orderList;

    public DailyOrderList() {
        date = new Date();
        orderList = new OrderList();
    }

    public Date getDate() {
        return date;
    }

    public OrderList getOrderList() {
        return orderList;
    }
}
