
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        
        while (true) {
            int num = scanner.nextInt();
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                nums.add(num);
            }
            
        }
        
        if (nums.isEmpty()) {
//            System.out.println(nums.size());
            System.out.println("Cannot calculate the average");
        } else {
            int sum = 0;
            for (Integer num : nums) {
                sum += num;
            }

            System.out.println(sum / (double) nums.size());
        }
    }
}
