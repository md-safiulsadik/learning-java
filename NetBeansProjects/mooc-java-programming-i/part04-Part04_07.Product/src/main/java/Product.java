/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Product {
    private String initialName; 
    private double initialPrice;
    private int initialQuantity;
    
    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.initialName = initialName;
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
    }
    
    public void printProduct() {
        System.out.printf("%s, price %.1f, %d pcs\n", this.initialName, this.initialPrice, this.initialQuantity);
    }
}
