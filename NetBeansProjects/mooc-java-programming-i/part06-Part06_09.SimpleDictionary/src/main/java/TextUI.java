
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equalsIgnoreCase("end")) {
                System.out.println("Bye bye!");
                break;
                
            } else if (command.equalsIgnoreCase("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                
                this.dict.add(word, translation);
                
            } else if (command.equalsIgnoreCase("search")) {
                System.out.print("To be translated: ");
                String transWord = scanner.nextLine();
                
                if (this.dict.translate(transWord) == null) {
                    System.out.println("Word " + transWord + " was not found");
                
                } else {
                    System.out.println("Translation: " + this.dict.translate(transWord));
                }
                
            } else {
                System.out.println("Unknown command ");
            }
        }
    }
    
}
