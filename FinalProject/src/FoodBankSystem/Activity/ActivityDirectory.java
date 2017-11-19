/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Activity;

import FoodBankSystem.Staff.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class ActivityDirectory {
    private ArrayList<Activity> activities;

    public ActivityDirectory() {
        activities = new ArrayList<Activity>();
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
    
    public Activity addActivity(Employee e){
        Activity a = new Activity(e);
        activities.add(a);
        return a;
    }
    
    public void removeActivity(Activity a){
        activities.remove(a);
    }
}
