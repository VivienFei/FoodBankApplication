/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.DashButton;

import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class DashButtonRecorderList {
    private ArrayList<DashBottonRecorder> dashBottonRecorder;

    public DashButtonRecorderList() {
        dashBottonRecorder = new ArrayList<DashBottonRecorder>();
    }

    public ArrayList<DashBottonRecorder> getDashBottonRecorder() {
        return dashBottonRecorder;
    }
    
    public DashBottonRecorder addDashBottonRecorder(){
        DashBottonRecorder dbr = new DashBottonRecorder();
        dashBottonRecorder.add(dbr);
        return dbr;
    }
}
