/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Staff;

import FoodBankSystem.Person.Person;
import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class Volunteer extends Person{
    private boolean futurContact;
    private String phoneNum;
    private String phoneNumType;
    private String email;
    
    public Volunteer(String firstName, String lastName, Date birthday) {
        super(firstName, lastName, birthday);
    }

    public boolean isFuturContact() {
        return futurContact;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getPhoneNumType() {
        return phoneNumType;
    }

    public String getEmail() {
        return email;
    }

    public void setFuturContact(boolean futurContact) {
        this.futurContact = futurContact;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setPhoneNumType(String phoneNumType) {
        this.phoneNumType = phoneNumType;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
