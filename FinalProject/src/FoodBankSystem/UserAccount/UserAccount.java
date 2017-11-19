/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.UserAccount;

import FoodBankSystem.Organiztion.Organization;
import FoodBankSystem.Person.Person;
import FoodBankSystem.Role.Role;

/**
 *
 * @author Cuishaowen
 */
public class UserAccount {
    private String userName;
    private String password;
    private Person person;
    private Organization organization;
    private Role role;
    
    private int id;
    private static int userAccountID;

    public UserAccount(String userName, String password, Person person) {
        this.userName = userName;
        this.password = password;
        this.person = person;
        id = userAccountID++;
    }

    public UserAccount(String userName, String password, Organization organization) {
        this.userName = userName;
        this.password = password;
        this.organization = organization;
        id = userAccountID++;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public Person getPerson() {
        return person;
    }

    public Organization getOrganization() {
        return organization;
    }

    public int getId() {
        return id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
