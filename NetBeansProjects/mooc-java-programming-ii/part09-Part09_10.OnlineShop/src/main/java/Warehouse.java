
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Warehouse {
    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;

    
    public Warehouse() {
        this.priceMap = new HashMap<>();
        this.stockMap = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        priceMap.put(product, price);
        stockMap.put(product, stock);
    }

    public int price(String product) {
        if (priceMap.containsKey(product)) {
            return priceMap.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        if (stockMap.containsKey(product)) {
            return stockMap.get(product);
        }
        return 0;
    }
    
    public boolean take(String product) {
        if (stockMap.containsKey(product) && stockMap.get(product) > 0) {
            int newStock = stockMap.get(product);
            stockMap.replace(product, newStock, newStock - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return stockMap.keySet();
    }
}

