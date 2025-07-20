
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avg = 0;
        int sum = 0;
        int numOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextInt());

            if (number == 0) {
                break;
            }

            sum += number;
            numOfNumbers += 1;
        }

        avg = (double) sum / numOfNumbers;
        System.out.println("Average of the numbers: " + avg);

    }
}
