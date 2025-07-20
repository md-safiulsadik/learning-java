
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            String str = scanner.nextLine();
        
            if (str.isEmpty()) {
                break;
            }
            String[] splitedWord = str.split(" ");
            
            for (String word : splitedWord)
                if (word.contains("av")) {
                    System.out.println(word);        
                }                
        }  

    }
}
