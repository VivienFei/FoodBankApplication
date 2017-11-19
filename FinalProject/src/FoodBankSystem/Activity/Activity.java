/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Activity;

import FoodBankSystem.Staff.Employee.Employee;
import FoodBankSystem.Staff.VolunteerDirectory;
import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class Activity {
    private String name;
    private int id;
    private static int activityID;
    private String type;
    private Date date;
    private String target;
    private String location;
    private Employee responsiblePerson;
    private VolunteerDirectory volunteerDirectory;

    public Activity(Employee e) {
        id = activityID++;
        date = new Date();
        responsiblePerson = e;
        volunteerDirectory = new VolunteerDirectory();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public String getTarget() {
        return target;
    }

    public String getLocation() {
        return location;
    }

    public Employee getResponsiblePerson() {
        return responsiblePerson;
    }

    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setResponsiblePerson(Employee responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public void setVolunteerDirectory(VolunteerDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }
    
    @Override
    public String toString()
    {
        return  String.valueOf(id);
    }
}
