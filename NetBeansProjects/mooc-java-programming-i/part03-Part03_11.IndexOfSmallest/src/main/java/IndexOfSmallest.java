
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextInt());
            
            if (input == 9999) {
                break;
            }
            
            list.add(input);
        }
        
        int minIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            
            if (list.get(minIndex)> list.get(i)) {
                minIndex = i;
            }
        }
        
        System.out.println("Smallest number: " + list.get(minIndex));
    
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == list.get(minIndex)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
