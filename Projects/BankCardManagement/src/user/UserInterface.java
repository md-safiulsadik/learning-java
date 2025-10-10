
package user;


import account.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private CardManager manager;

    public UserInterface(Scanner scanner, CardManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void run() {

        while (true) {
           printUI();
           int choice = getInteger( "Enter your choice: ");

           switch (choice) {
               case 1:
                   manager.createDebit(name(), accountNumber(), balance());
                   break;

               case 2:
                   manager.createCredit(name(), accountNumber(), balance());
                   break;

               case 3:
                   manager.createSalary(name(), accountNumber(), balance());
                   break;

               case 4:
                   manager.printAccounts();
                   int index = getInteger("Enter index: ");
                   printUserUI();
                   int select = getInteger("Enter choice: ");

                   if (select == 1) {
                       manager.deposit(index, getDouble("Enter Deposit Amount: "));
                   } else if (select == 2) {
                       manager.withdraw(index, getDouble("Enter Withdraw Amount: "));
                   } else if (select == 3) {
                       manager.checkBalance(index);
                   }
                   break;

               case 5:
                   System.out.println("Total Accounts Created: " + Account.NUM_OF_AC);
                   break;

               case 6:
                   System.out.println("Exiting... Thank you!");
                   return;

               default:
                   System.out.println("Invalid⚠\uFE0F");
           }
        }
    }

    private String name() {
        System.out.print("Enter Name: ");
        String name;
        name = scanner.nextLine();
        return name;
    }


    private String accountNumber() {
        System.out.print("Enter Account Number: ");
        String acNum;
        acNum = scanner.nextLine();
        return acNum;
    }


    private double balance() {
        return getDouble("Enter Initial Balance: ");
    }

    private void printUI() {
        System.out.print("\n========== BANK CARD MANAGEMENT SYSTEM ===========\n" +
                "1. Create Debit Card\n" +
                "2. Create Credit Card\n" +
                "3. Create Salary Card\n" +
                "4. Perform Transaction\n" +
                "5. Show Total Accounts\n" +
                "6. Exit\n");
    }

    private void printUserUI() {
        System.out.print("\n1. Deposit\n" +
                "2. Withdraw\n" +
                "3. Check Balance\n" +
                "Enter your choice: ");
    }

    private double getDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double number;
                number = Double.parseDouble(scanner.nextLine());
                return number;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println(e.getMessage() + ": Please enter an double/integer value");
            }
        }
    }


    private int getInteger(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int number;
                number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println(e.getMessage() + ": Please enter an Integer value");
            }
        }
    }
}
