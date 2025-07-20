
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avg = 0;
        int sum = 0;
        int numOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextInt());

            if (number == 0) {
                if (numOfNumbers == 0) {
                    System.out.println("Cannot calculate the average");
                }
                break;
            } else if (number > 0) {
                sum += number;
                numOfNumbers += 1;
            }

        }

        avg = (double) sum / numOfNumbers;
        System.out.println(avg);

    }
}
