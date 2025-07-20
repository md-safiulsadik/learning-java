/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Gauge {
    private int count = 0;
    
    public boolean full() {
        if (count >= 5) {
            return true;
        }
        return false;
    }
    
    public void decrease() {
       if (count > 0) {
           count -= 1;
       }
    }
    
    public void increase() {
        if (count < 5) {
            count += 1;
        }
    }
    
    public int value() {
        return count;
    }
}
