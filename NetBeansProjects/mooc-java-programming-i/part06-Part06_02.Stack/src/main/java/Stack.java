
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
public class Stack {
    private ArrayList<String> list;
    
    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
            
            
    public void add(String value) {
        list.add(0, value);
    }
    
    public String take() {
        return this.list.remove(this.list.size() - 1);
    }
            
    public ArrayList<String> values() {
        return this.list;
    }
    
}
