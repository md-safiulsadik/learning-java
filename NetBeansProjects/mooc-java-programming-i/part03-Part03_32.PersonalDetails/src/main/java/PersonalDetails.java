
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sumOfYears = 0;
        int nameSize = -1;
        String longestName = "";
        
        while (true) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            }
            
            String[] values = str.split(",");
            
            sumOfYears += Integer.valueOf(values[1]);
            count++;
            
            if (nameSize < values[0].length()) {
                nameSize = values[0].length();
                longestName = values[0];
            }
            
        }
        
        System.out.println("name: " + longestName);
        System.out.println("the average: " + (double)sumOfYears / count);

    }
}
