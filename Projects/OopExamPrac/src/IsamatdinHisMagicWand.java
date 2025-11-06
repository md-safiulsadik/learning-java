import java.util.Arrays;
import java.util.Scanner;

public class IsamatdinHisMagicWand {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfArr = scanner.nextInt();
        int[][] arr = new int[numOfArr][];

        for (int i = 0; i < numOfArr; i++) {

            int arrSize = scanner.nextInt();
            arr[i] = new int[arrSize];

            for (int j = 0; j < arrSize; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int[] ints : arr) {
            if (ints.length >= 2) {
                boolean firstEven = ints[0] % 2 == 0;
                boolean secondEven = ints[1] % 2 == 0;

                if (firstEven != secondEven) {
                    Arrays.sort(ints);
                }
            }
        }

        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
