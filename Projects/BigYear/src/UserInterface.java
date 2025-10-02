import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdManager manager;

    public  UserInterface(Scanner scanner,  BirdManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void run() {
        while (true) {
            System.out.print("? ");
            String input = this.scanner.nextLine();

            if (input.equalsIgnoreCase("Quit")) {
                break;
            }

            switch (input.toLowerCase()) {
                case "add":
                    manager.addBird();
                    break;
                case "observation":
                    manager.observation();
                    break;
                case "all":
                    manager.printAllBirds();
                    break;
                case "one":
                    manager.printOneBird();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
