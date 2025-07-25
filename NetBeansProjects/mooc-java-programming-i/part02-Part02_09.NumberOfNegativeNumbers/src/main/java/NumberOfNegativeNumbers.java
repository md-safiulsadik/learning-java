
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negatives = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextInt());

            if (number > 0) {
                continue;
            }

            if (number == 0) {
                break;
            }

            negatives += 1;
        }
        
        System.out.println("Number of negative numbers: " + negatives);
    
    }
}
