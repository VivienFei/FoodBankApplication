/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Truck;

import FoodBankSystem.Person.Person;

/**
 *
 * @author Cuishaowen
 */
public class Truck {
    private int id;
    private static int truckID;
    private int truckLoad;
    private String model;
    private String condition;
    private int purchasePrice;
    private String purchaseCondition;
    private String plateNum;
    private Person responsibleDriver;
    private String image;
    private String note;
    private String location;

    public Truck(Person responsibleDriver) {
        id = truckID++;
        this.responsibleDriver = responsibleDriver;
    }

    public int getId() {
        return id;
    }

    public int getTruckLoad() {
        return truckLoad;
    }

    public String getModel() {
        return model;
    }

    public String getCondition() {
        return condition;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public String getPurchaseCondition() {
        return purchaseCondition;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public Person getResponsibleDriver() {
        return responsibleDriver;
    }

    public String getImage() {
        return image;
    }

    public String getNote() {
        return note;
    }

    public void setTruckLoad(int truckLoad) {
        this.truckLoad = truckLoad;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseCondition(String purchaseCondition) {
        this.purchaseCondition = purchaseCondition;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public void setResponsibleDriver(Person responsibleDriver) {
        this.responsibleDriver = responsibleDriver;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
