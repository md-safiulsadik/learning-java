
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dict; 
    
    public DictionaryOfManyTranslations() {
        this.dict = new HashMap<>();
    }
    
    public void add(String word, String translation) { 
// adds the translation for the word and preserves the old translations.
        dict.putIfAbsent(word, new ArrayList<>());
        
        dict.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) { 
// returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.
        return dict.getOrDefault(word, new ArrayList<>());
    }
            
    public void remove(String word) { 
// removes the word and all its translations from the dictionary.
        dict.remove(word);
    }
}
