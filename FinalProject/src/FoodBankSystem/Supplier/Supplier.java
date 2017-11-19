/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Supplier;

import FoodBankSystem.Supplier.Product.ProductCatalog;
import FoodBankSystem.Person.Person;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cuishaowen
 */
public class Supplier {
    private int id;
    private static int supplierID;
    private String name;
    private String type;
    private ProductCatalog productCatalog;
    private String location;
    private Person person;
    private Date beginDate;
    private boolean weekly;

    public enum Type{
        Retailer("Retailer Supplier"), 
        Church("Church Supplier"), 
        Gardener("Gardener Supplier"),
        Individual("Individual Supplier"),
        Manufacturer("Manufacturer Supplier"),
        Government("Government Supplier"),
        Charity("Charity Supplier");
        
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
    
    public Supplier(Person person) {
        id = supplierID++;
        productCatalog = new ProductCatalog();
        beginDate = new Date();
        this.person = person;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public String getLocation() {
        return location;
    }

    public Person getPerson() {
        return person;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public boolean isWeekly() {
        return weekly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public void setWeekly(boolean weekly) {
        this.weekly = weekly;
    }
    
    public String toString()
    {
        return name;
    }
}
