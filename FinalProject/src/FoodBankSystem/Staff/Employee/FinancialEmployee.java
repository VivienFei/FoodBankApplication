/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Staff.Employee;

import FoodBankSystem.Role.FoundationFinancialRole;
import FoodBankSystem.Role.NutritionRole;
import FoodBankSystem.Role.Role;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class FinancialEmployee extends Employee{

    public FinancialEmployee(String firstName, String lastName, Date birthday) {
        super(firstName, lastName, birthday);
        super.setDepartment(Type.FoundationFinancial.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoundationFinancialRole());
        return roles;
    }
    
}
