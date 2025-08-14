import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();

        if ((weight < 1 || weight > 100)  || (weight % 2 != 0) || weight == 2 ) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
