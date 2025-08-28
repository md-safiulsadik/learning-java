
import storeManager.StoreManager;
import storeManager.UserInterface;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StoreManager storeManager = new StoreManager();
        UserInterface ui = new UserInterface(scanner, storeManager);

//        Electronics electronics = new Electronics("E34", "Fan", 43.34f, 5);
//        Clothing clothing = new Clothing("E34", "Fan", 43.34f, "M");
//        Book book = new Book("E34", "Fan", 43.34f, "NAde");

//        storeManager.add(book);
//        storeManager.add(clothing);
//        storeManager.add(electronics);
//
//        Book book1 = (Book) storeManager.products.get(0);
//        book1.getAuthor();
//
//        System.out.println(storeManager.products.get(0).display());
//        System.out.println(storeManager.products.get(1).display());
//        System.out.println(storeManager.products.get(2).display());
//

    }

}
