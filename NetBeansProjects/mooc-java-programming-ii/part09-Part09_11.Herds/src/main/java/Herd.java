
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Herd implements Movable {
    private final List<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    @Override
    public void move(int dx, int dy) {
        
        for (Movable organism : herd) {
            organism.move(dx, dy);
        }
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    
            
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (Movable organism : herd) {
            sb.append(organism.toString()).append("\n");
        }
        return sb.toString().trim();
    }
    
}
