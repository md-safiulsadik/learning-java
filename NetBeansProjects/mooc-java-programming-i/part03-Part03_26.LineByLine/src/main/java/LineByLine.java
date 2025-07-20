
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            String str = scanner.nextLine();
        
            if (str.isEmpty()) {
                break;
            }
            String[] splitedWord = str.split(" ");
            
            for (String word : splitedWord)
            System.out.println(word);        
        }    
    }  
}
