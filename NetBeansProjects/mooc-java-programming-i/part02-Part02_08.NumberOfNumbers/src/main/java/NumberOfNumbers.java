
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ones = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextInt());

            if (number == 0) {
                break;
            } else if (number < 0) {
                ones += 1;
            }
        }

        System.out.printf("Number of negative numbers: %d", ones);
    }
}
