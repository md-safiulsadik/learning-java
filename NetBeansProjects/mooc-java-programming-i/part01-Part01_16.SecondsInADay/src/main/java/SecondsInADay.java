
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int secInDay = 86400;
        System.out.println("How many days would you like to convert to seconds?");
        int day = Integer.valueOf(scanner.nextLine());
        System.out.println(day * secInDay);
    }
}
