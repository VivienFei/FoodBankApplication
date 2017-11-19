/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Supplier;

import FoodBankSystem.Person.Person;
import FoodBankSystem.Supplier.Product.Product;
import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class SupplierDirectory {
    private ArrayList<Supplier> suppliers;
    
    public SupplierDirectory(){
        suppliers = new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSuppliers() {
        return suppliers;
    }
    
    public Supplier addSupplier(Person person){
        Supplier s = new Supplier(person);
        suppliers.add(s);
        return s;
    }
    
    public void removeSupplier(Supplier s){
        suppliers.remove(s);
    }
}
