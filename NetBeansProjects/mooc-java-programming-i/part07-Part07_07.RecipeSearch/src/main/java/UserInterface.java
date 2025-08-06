import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    private Reader reader;

    public UserInterface(Scanner scanner, ArrayList<Recipe> recipes, Reader reader) {
        this.scanner = scanner;
        this.recipes = recipes;
        this.reader = reader;
    }

    public void start() {
        System.out.print("File to read: ");
        String path = scanner.nextLine();

        if (!reader.isReadable(path)) {
            System.out.println(reader.error());
            return;
        }

        printCommands();

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine().toLowerCase().trim();

            switch (command) {
                case "stop":
                    return;
                case "list":
                    listRecipes();
                    break;
                case "find name":
                    findByName();
                    break;
                case "find cooking time":
                    findByCookingTime();
                    break;
                case "find ingredient":
                    findByIngredient();
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }

    private void printCommands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    private void listRecipes() {
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    private void findByName() {
        System.out.print("Searched word: ");
        String word = scanner.nextLine().toLowerCase();

        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(word)) {
                System.out.println(recipe);
            }
        }
    }

    private void findByCookingTime() {
        System.out.print("Max cooking time: ");
        try {
            int maxTime = Integer.parseInt(scanner.nextLine());

            for (Recipe recipe : recipes) {
                if (recipe.getTime() <= maxTime) {
                    System.out.println(recipe);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Please enter an integer.");
        }
    }

    private void findByIngredient() {
        System.out.print("Ingredient: ");
        String ingredient = scanner.nextLine().toLowerCase();

        for (Recipe recipe : recipes) {
            for (String ing : recipe.getIngredients()) {
                if (ing.equalsIgnoreCase(ingredient)) {
                    System.out.println(recipe);
                    break; // avoid printing the same recipe multiple times
                }
            }
        }
    }
}
