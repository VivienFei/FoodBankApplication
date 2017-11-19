/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Staff.Employee;

import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    public void addEmployee(Employee e){
        employees.add(e);
    }
    
    public void removeEmployee(Employee e){
        employees.remove(e);
    }
}
