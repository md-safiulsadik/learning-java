
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            
            if (id.equals("")) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.equals("")) {
                break;
            } 
            
            Item item = new Item(id, name);
            if (!items.contains(item)) {
                items.add(item);
            }
        }
            
        System.out.println("==Items==");
        
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
