
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
public class Box implements Packable {
    private ArrayList<Packable> items;
    private final double capacity; 
    
    public Box(double capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public void add(Packable item) {
        
        if (this.weight() + item.weight() <=  capacity) {
            items.add(item);
        }
    }
    

    @Override
    public double weight() {
        double weight = 0;
        
        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
    
}
