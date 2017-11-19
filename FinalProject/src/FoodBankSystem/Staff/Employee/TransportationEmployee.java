/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Staff.Employee;

import FoodBankSystem.Role.Role;
import FoodBankSystem.Role.TransportationRole;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class TransportationEmployee extends Employee{

    public TransportationEmployee(String firstName, String lastName, Date birthday) {
        super(firstName, lastName, birthday);
        super.setDepartment(Type.Transportation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportationRole());
        return roles;    
    }
    
}
