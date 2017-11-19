/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Person;

import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class Person {
    private int id;
    private static int personID;
    private Name name;
    private String gender;
    private Date birthday;
    private Address address;
    private Date createDate;

    public Person(String firstName, String lastName, Date birthday) {
        id = personID++;
        name = new Name(firstName, lastName);
        this.birthday = birthday;
        createDate = new Date();
        address = new Address();
    }
    
    public int getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Address getAddress() {
        return address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    @Override
    public String toString(){
        return name.getFirstName() + " " + name.getLastName();
    }
}
