
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = -1;
        String nameOfOldest = "";
        
        while (true) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            }
            
            String[] splitedWord = str.split(",");
            int age = Integer.valueOf(splitedWord[1]);
            
            if (age > oldest) {
                oldest = age; 
                nameOfOldest = splitedWord[0];
            }
            
        }
        
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
