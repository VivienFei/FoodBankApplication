/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Staff.Employee;

import FoodBankSystem.Person.Person;
import FoodBankSystem.Role.Role;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public abstract class Employee extends Person{
    private String department;
    
    private int id;
    private static int employeeID;
    private String ssn;
    private String email;
    private String phoneNum;
    private String phoneNumType;
    
    public enum Type{
        ActivityManagement("Activity Management Department"), 
        Nutrition("Nutrition Department"),
        SupplierManagement("Supplier Management Department"),
        Transportation("Transportation Department"),
        ShelterManagement("Shelter Management Department"),
        ShelterEmployee("Shelter Employee Management Department"),
        FoundationFinancial("Foundation Financial Department");
        
        private String value;
        
        private Type(String value) 
        {
            this.value = value;
        }
        
        public String getValue() 
        {
            return value;
        }
    }
    
    public Employee(String firstName, String lastName, Date birthday) {
        super(firstName, lastName, birthday);
        id = employeeID++;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public String getSsn() {
        return ssn;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getPhoneNumType() {
        return phoneNumType;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setPhoneNumType(String phoneNumType) {
        this.phoneNumType = phoneNumType;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
