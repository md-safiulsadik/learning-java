package GPT;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private CardManager cardManager;
    private Scanner scanner;

    public UserInterface(Scanner scanner, CardManager cardManager) {
        this.cardManager = cardManager;
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            System.out.println("\n--- Bank Card Management ---");
            System.out.println("1. Create Account");
            System.out.println("2. Issue Card");
            System.out.println("3. List Accounts");
            System.out.println("4. List Cards");
            System.out.println("5. Deposit");
            System.out.println("6. Withdraw");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    issueCard();
                    break;
                case "3":
                    listAccounts();
                    break;
                case "4":
                    listCards();
                    break;
                case "5":
                    deposit();
                    break;
                case "6":
                    withdraw();
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void createAccount() {
        System.out.print("Enter owner name: ");
        String owner = scanner.nextLine();
        Account acc = cardManager.createAccount(owner);
        System.out.println("Account created for " + acc.getOwner());
    }

    private void issueCard() {
        List<Account> accounts = cardManager.getAccounts();
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }
        listAccounts();
        System.out.print("Select account index: ");
        int idx = Integer.parseInt(scanner.nextLine());
        if (idx < 0 || idx >= accounts.size()) {
            System.out.println("Invalid index.");
            return;
        }
        System.out.print("Enter card type (debit/credit/salary): ");
        String type = scanner.nextLine();
        System.out.print("Enter card number: ");
        String cardNumber = scanner.nextLine();
        Card card = cardManager.issueCard(type, accounts.get(idx), cardNumber);
        System.out.println(card.getCardType() + " card issued: " + card.getCardNumber());
    }

    private void listAccounts() {
        List<Account> accounts = cardManager.getAccounts();
        if (accounts.isEmpty()) {
            System.out.println("No accounts.");
            return;
        }
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            System.out.println(i + ": " + acc.getOwner() + " (Balance: " + acc.getBalance() + ")");
        }
    }

    private void listCards() {
        List<Card> cards = cardManager.getCards();
        if (cards.isEmpty()) {
            System.out.println("No cards.");
            return;
        }
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    private void deposit() {
        listCards();
        List<Card> cards = cardManager.getCards();
        if (cards.isEmpty()) return;
        System.out.print("Select card index: ");
        int idx = Integer.parseInt(scanner.nextLine());
        if (idx < 0 || idx >= cards.size()) {
            System.out.println("Invalid index.");
            return;
        }
        System.out.print("Enter amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        cards.get(idx).deposit(amount);
        System.out.println("Deposited.");
    }

    private void withdraw() {
        listCards();
        List<Card> cards = cardManager.getCards();
        if (cards.isEmpty()) return;
        System.out.print("Select card index: ");
        int idx = Integer.parseInt(scanner.nextLine());
        if (idx < 0 || idx >= cards.size()) {
            System.out.println("Invalid index.");
            return;
        }
        System.out.print("Enter amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        cards.get(idx).withdraw(amount);
        System.out.println("Withdrawal attempted.");
    }
}
