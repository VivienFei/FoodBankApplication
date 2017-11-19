/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Staff.Employee;

import FoodBankSystem.Role.NutritionRole;
import FoodBankSystem.Role.Role;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class NutritionEmployee extends Employee{

    public NutritionEmployee(String firstName, String lastName, Date birthday) {
        super(firstName, lastName, birthday);
        super.setDepartment(Type.Nutrition.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NutritionRole());
        return roles;    
    }
    
}
