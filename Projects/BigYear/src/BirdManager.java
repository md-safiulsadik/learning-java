import java.util.ArrayList;
import java.util.Scanner;

public class BirdManager {
    private ArrayList<Bird> birds;
    private Scanner scanner;

    public BirdManager(Scanner scanner, ArrayList<Bird> birds) {
        this.birds = birds;
        this.scanner = scanner;
    }

    public void addBird() {
        System.out.print("Name: ");
        String name = this.scanner.nextLine();

        System.out.print("Name is Latin: ");
        String latinName =  this.scanner.nextLine();

        Bird newBird = new Bird(name, latinName);

        if (this.birds.contains(newBird)) {
            System.out.println("Bird already exists");
        } else  {
            birds.add(newBird);
        }
    }

    public void observation () {
        System.out.print("Birds? ");
        String  observation = this.scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < birds.size(); i++) {
            if (this.birds.get(i).getName().equals(observation)) {
                birds.get(i).setObserve(1);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not a bird!");;
        }
    }

    public void printOneBird() {
        System.out.print("Bird? ");
        String name = this.scanner.nextLine();

        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }

    public void printAllBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
