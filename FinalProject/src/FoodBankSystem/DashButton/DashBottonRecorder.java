/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.DashButton;

import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class DashBottonRecorder {
    private Date date;
    private DashBottonList dashBottonList;
    
    public DashBottonRecorder(){
        date = new Date();
        dashBottonList = new DashBottonList();
    }

    public Date getDate() {
        return date;
    }

    public DashBottonList getDashBottonList() {
        return dashBottonList;
    }
}
