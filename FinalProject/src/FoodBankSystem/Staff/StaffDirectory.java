/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Staff;

import FoodBankSystem.Staff.Employee.EmployeeDirectory;

/**
 *
 * @author Cuishaowen
 */
public class StaffDirectory {
    private EmployeeDirectory employeeDirectory;
    private VolunteerDirectory volunteerDirectory;

    public StaffDirectory() {
        employeeDirectory = new EmployeeDirectory();
        volunteerDirectory = new VolunteerDirectory();
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }
}
