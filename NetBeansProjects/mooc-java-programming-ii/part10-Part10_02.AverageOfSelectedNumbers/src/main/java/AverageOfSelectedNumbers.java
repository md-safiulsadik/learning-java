
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

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
        
        System.out.println("Print the average of the negative"
                + " numbers or the positive numbers? (n/p)");
        
        String choice = scanner.nextLine();
        
        switch(choice) {
            case "n":
                printNegative(inputs);
                break;
            case "p":
                printPositive(inputs);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        
        
    }
    
    public static void printPositive(List<String> inputs) {
        
        double avg = inputs.stream()
                .mapToInt(Integer::parseInt)
                .filter(s -> s > 0)
                .average()
                .getAsDouble();
                
        System.out.println("Average of the positive numbers: " + avg);
    }
    
    public static void printNegative(List<String> inputs) {
        
        double avg = inputs.stream()
                .mapToInt(Integer::parseInt)
                .filter(s -> s < 0)
                .average()
                .getAsDouble();
        
        System.out.println("Average of the negative numbers: " + avg);
    }
}
