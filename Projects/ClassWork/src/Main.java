import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program takes 3 integer and print there sum and average: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        Sum sum = new Sum(a, b, c);
        System.out.println(sum);

        Average avg = new Average(a, b, c);
        System.out.println(avg);
    }
}
