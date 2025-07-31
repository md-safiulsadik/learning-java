
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);           
        }
    }
    
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (!(obj instanceof Menu)) {
            return false;
        }
        
        Menu compare = (Menu)obj;
        
        return this.meals.equals(compare.meals);
    }
}
