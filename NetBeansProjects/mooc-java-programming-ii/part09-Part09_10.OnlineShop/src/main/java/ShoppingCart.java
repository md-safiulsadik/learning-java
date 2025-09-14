
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class ShoppingCart {
    
    private Map<String, Item> itemMap;
    
    public ShoppingCart() {
        this.itemMap = new HashMap<>();
    }
    
    public void add(String product, int price) {
        
        this.itemMap.putIfAbsent(product, new Item(product, 0, price));
        this.itemMap.get(product).increaseQuantity();
        
//        itemMap.putIfAbsent(product, new Item(product, 1, price));
    }
    
    public int price() {
        int price = 0;
        
        for (Item unitPrice : itemMap.values()) {
            price += unitPrice.price();
        }
        return price;
    }
    
    public void print() {
        for (String product : itemMap.keySet()) {
            System.out.println(product + ": " + itemMap.get(product).getQty());
        }
    }
}
