/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Supplier.Product;

/**
 *
 * @author Cuishaowen
 */
public class Product {
    private String type;
    private String name;
    private String substitute;

    public enum Type{
        Dairy("Dairy Product"), 
        Fruit("Fruit Product"),
        Grain("Grain Product"),
        Meat("Meat Product"),
        Confection("Confection Product"),
        Vegetable("Vegetable Product"),
        PersonalCare("Personal Care Product"),
        Cleaner("Cleaner Product"),
        Tissue("Tissue Product");
        
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
    
    public Product(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getSubstitute() {
        return substitute;
    }

    public void setSubstitute(String substitute) {
        this.substitute = substitute;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
