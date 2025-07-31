
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
public class Hold {
    private final int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight; 
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {        
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }

    }

    // Helper mathord
    private int totalWeight() {
        int total = 0;
        
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }
    
    public void printItems() {       
         for (Suitcase item : this.suitcases) {
             item.printItems();
         }
    }
    
    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases " + " (" + totalWeight() + " kg)";
    }
}
