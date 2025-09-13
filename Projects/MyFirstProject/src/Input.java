import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        System.out.println("Hello!\nThis is 2nd program!");

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter you name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("Are you a student(true/false): ");
//        boolean is_student = scanner.nextBoolean();
//
//        System.out.println("Your name is " + name);
//        System.out.println("You're " + age + "yO");
//        if (is_student) {
//            System.out.println("You're enrolled as student.");
//        } else System.out.println("You're not enrolled");

        // common problem

        System.out.print("Your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // this will clear the input buffer

        System.out.print("Your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("Your age is "+ age + " your favorite color is " + color);
        // this print statement will not print what you want it to print
        // the nextInt() inputs a \n after the input
        // this is a input buffer

        scanner.close();
    }

}
