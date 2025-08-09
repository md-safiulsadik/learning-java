
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
public class Abbreviations {
    HashMap<String, String> abbreviationMap;

    public Abbreviations() {
        this.abbreviationMap = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationMap.put(abbreviation, explanation);
    }   

    public boolean hasAbbreviation(String abbreviation) {
        if (abbreviationMap.containsKey(abbreviation)) return true;
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        return abbreviationMap.get(abbreviation);
    }
}


