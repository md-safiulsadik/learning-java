
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        // Write your program here
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            inputs.add(input);
        }
        
        double avg = inputs.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .average()
                .getAsDouble();

        System.out.println(avg);
    }
}
