
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Suitcase {
    private final int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public int totalWeight() { // Helper function...
        int totalWeight = 0;
        
        for (Item itemWeight : this.items) {
            totalWeight += itemWeight.getWeight();
        }
        
        return totalWeight;
    }
    
    public void addItem(Item item) {
        int totalWeight = this.totalWeight();
        
        totalWeight += item.getWeight();
        
        if (this.maxWeight >= totalWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems() {       
         for (Item item : this.items) {
             System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
         }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        int max = this.items.get(0).getWeight();
        Item heaviest = this.items.get(0);
        
        for (Item item : this.items) {
            if (max < item.getWeight()) {
                max = item.getWeight();
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return this.items.size() + " item " + "(" + this.totalWeight() + "kg)" + "\n";
        }

        String string = "";
        
        for (Item item : items) {
            string += this.items.size() + " items " + "(" + this.totalWeight() + "kg)" + "\n";
        }
        
        return string;
    }
}
