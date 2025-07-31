/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Item {
    private final String id;
    private final String name;    
    
    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        
        if (!(compare instanceof Item)) {
            return false;
        }
        
        Item compareItem = (Item)compare;
        
        return this.id.equalsIgnoreCase(compareItem.id);
    }
    
    @Override
    public String toString() {
        return this.getId() + ": " + this.getName();
    }
}
