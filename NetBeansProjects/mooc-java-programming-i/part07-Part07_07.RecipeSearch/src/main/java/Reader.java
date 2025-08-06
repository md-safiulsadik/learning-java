
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Reader {
    private ArrayList<Recipe> recipes;
    private String errorMassage;
    
    public Reader(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
        this.errorMassage = "No error occured!";
    }
    
    public boolean isReadable(String path) {

        try (Scanner reader = new Scanner(Paths.get(path))) {
            while (reader.hasNextLine()) {
                // This reads the name
                String name = reader.nextLine();
                if (name.trim().isEmpty()) {
                    continue;
                }
                // Reads time
                int time = Integer.valueOf(reader.nextLine());
                
                // Here we are creating a list of ingredients
                ArrayList<String> ingredients = new ArrayList<>();
                
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    
                    if (line.trim().isEmpty()) {
                        break;
                    }
                    
                    ingredients.add(line);
                }
                
                this.recipes.add(new Recipe(name, time, ingredients));
            }
            return true;
            
        } catch (Exception e) {
            this.errorMassage = "Error: " + e.getMessage();
            return false;
        }
    }
    
    public String error() {
        return this.errorMassage;
    }
}
