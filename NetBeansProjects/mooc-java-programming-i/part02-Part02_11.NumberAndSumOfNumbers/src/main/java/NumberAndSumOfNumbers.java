
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNumbers = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextInt());

            if (number == 0) {
                break;
            }

            sum += number;
            numOfNumbers += 1;
        }

        System.out.println("Number of numbers: " + numOfNumbers);
        System.out.println("Sum of the numbers: " + sum);

    }
}
