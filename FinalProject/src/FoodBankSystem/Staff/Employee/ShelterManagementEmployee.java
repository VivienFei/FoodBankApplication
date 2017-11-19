/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Staff.Employee;

import FoodBankSystem.Role.Role;
import FoodBankSystem.Role.ShelterManagementRole;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class ShelterManagementEmployee extends Employee{

    public ShelterManagementEmployee(String firstName, String lastName, Date birthday) {
        super(firstName, lastName, birthday);
        super.setDepartment(Type.ShelterManagement.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShelterManagementRole());
        return roles;    
    }
    
}
