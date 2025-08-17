
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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.containsKey(licensePlate)) {
            return false;
        }
        
        this.registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        
        return false;
    }
    
    public void search(LicensePlate licensePlate) {
        System.out.println(this.registry.get(licensePlate));
    }
    
    public void printLicensePlates() {
        for (LicensePlate key : this.registry.keySet()) {
            System.out.println(key);
        }
    }
    
    public void printOwners() {
        ArrayList<String> seen = new ArrayList<>();
        
        for (String value : this.registry.values()) {
            if (!seen.contains(value)) {
                System.out.println(value);
                seen.add(value);
            }
            
        }
    }
}
