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
public class MasterOrderList {
    private ArrayList<DailyOrderList> orderLists;

    public MasterOrderList() {
        orderLists = new ArrayList<DailyOrderList>();
    }

    public ArrayList<DailyOrderList> getOrderLists() {
        return orderLists;
    }
    
    public DailyOrderList addDailyOrderList(){
        DailyOrderList dol = new DailyOrderList();
        orderLists.add(dol);
        return dol;
    }
    
    public void removeDailyOrderList(DailyOrderList ol){
        orderLists.remove(ol);
    }
}
