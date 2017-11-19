/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Menu;

import FoodBankSystem.Supplier.Product.Product;

/**
 *
 * @author Cuishaowen
 */
public class MenuItem {
    private Product product;
    private int quantity;

    public MenuItem(Product p) {
        product = p;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return product.getName();
    }
}
