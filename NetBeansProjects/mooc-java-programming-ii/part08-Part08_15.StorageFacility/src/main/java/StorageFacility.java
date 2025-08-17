
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) { 
// adds the parameter item to the storage unit that is also given as a parameter.
        storage.putIfAbsent(unit, new ArrayList<>());
        
        storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) { 
// returns a list that contains all the items in the storage unit indicated by the parameter. 
// If there is no such storage unit or it contains no items, the method should return an empty list.
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        storage.get(storageUnit).remove(item);
       
       if (storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
        
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        
        for (String unit : storage.keySet()) {
            if (unit.isEmpty()) {
                continue;
            }
            units.add(unit);
        }
        
        return units;
    }
}
