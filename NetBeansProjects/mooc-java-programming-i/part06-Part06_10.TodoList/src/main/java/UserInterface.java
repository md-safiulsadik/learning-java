
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
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equalsIgnoreCase("stop")) {
                break;
            }
            
            if (command.equalsIgnoreCase("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                this.list.add(task);
            }
            
            if (command.equalsIgnoreCase("list")) {
                list.print();
            }
            
            if (command.equalsIgnoreCase("remove")) {
                System.out.print("Which one is removed? ");
                int index = Integer.valueOf(this.scanner.nextLine());
                list.remove(index);
            }
        }
    }
}
