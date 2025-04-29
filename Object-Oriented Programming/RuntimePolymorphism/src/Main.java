import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Runtime polymorphism = When the method that gets executed is decided
        //                       at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        System.out.print("The 1 for cat 2 for dog: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1: Cat cat = new Cat();
                    cat.speak();
                    break;
            case 2: Dog dog = new Dog();
                    dog.speak();
                    break;
            default:
                System.out.println("Invalid !");
        }

        scanner.close();
    }
}
