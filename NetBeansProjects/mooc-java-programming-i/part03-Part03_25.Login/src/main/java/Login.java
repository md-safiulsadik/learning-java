
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String userName1 = "alex" ;        
        String userPass1 = "sunshine" ;
        
        String userName2 = "emma" ;
        String userPass2 = "haskell" ;
        
        System.out.println("Enter username:");
        String inputUserName = scanner.nextLine();
  
        System.out.println("Enter password:");
        String inputUserPass = scanner.nextLine();

        
        if ((userName1.equals(inputUserName) || userName2.equals(inputUserName)) && 
                (userPass1.equals(inputUserPass) || userPass2.equals(inputUserPass))) {
            
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        
    }
}
