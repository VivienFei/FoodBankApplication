/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Staff;

import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer> volunteers;

    public VolunteerDirectory() {
        volunteers = new ArrayList<Volunteer>();
    }

    public ArrayList<Volunteer> getVolunteers() {
        return volunteers;
    }
    
    public void addVolunteer(Volunteer v){
        volunteers.add(v);
    }
    
    public void removeVolunteer(Volunteer v){
        volunteers.remove(v);
    }
}
