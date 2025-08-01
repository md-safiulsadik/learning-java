
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
public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            
            String command = scanner.nextLine();
       
            if (command.equals("X")) {
              break;
            }
            
            switch (command) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    this.manager.addJoke(joke);
                    break;
                
                case "2":
                    System.out.println(this.manager.drawJoke());
                    break;
                
                case "3":
                    this.manager.printJokes();
                    break;
                
                default: 
                    System.out.println("Invalid input...");
                    break;
            }
        }
    }
}
