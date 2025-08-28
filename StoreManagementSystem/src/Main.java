
import storeManager.StoreManager;
import storeManager.UserInterface;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StoreManager storeManager = new StoreManager();
        UserInterface ui = new UserInterface(scanner, storeManager);

        ui.start();

    }

}
