
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author md-safiulsadik
 */
public class Recipe {
    private final ArrayList<String> ingredients;
    private final String name;
    private final int time;
    
    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTime() {
        return this.time;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
}
