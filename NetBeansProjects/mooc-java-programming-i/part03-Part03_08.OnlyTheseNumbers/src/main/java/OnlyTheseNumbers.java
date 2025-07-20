
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        int min = Integer.valueOf(scanner.nextInt());
        int max = Integer.valueOf(scanner.nextInt());
        
        while (min <= max) {
            System.out.println(numbers.get(min++));
        }
    }
}
