
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();  
        Reader reader = new Reader(recipes);
        
        UserInterface ui = new UserInterface(scanner, recipes, reader);
        
        ui.start();
        
    }

}
