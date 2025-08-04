
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        
        UserInterface userInterface = new UserInterface(manager, scanner);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        userInterface.start();

    }
}
