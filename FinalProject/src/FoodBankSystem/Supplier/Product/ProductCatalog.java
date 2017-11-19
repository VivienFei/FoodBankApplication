/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Supplier.Product;

import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class ProductCatalog {
    private ArrayList<Product> products;

    public ProductCatalog() {
        products = new ArrayList<Product>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public Product addProduct(String type){
        Product p = new Product(type);
        products.add(p);
        return p;
    }
    
    public void removeProduct(Product p){
        products.remove(p);
    }
    
    public Product searchProduct(String name){
        for (Product product : products) {
            if(product.getName()==name){
                return product;
            }
        }
        return null;
    }
    public void addProduct(Product p){
        products.add(p);
        
    }
}
