/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Order;

import FoodBankSystem.Supplier.Product.Product;

/**
 *
 * @author Cuishaowen
 */
public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
}
