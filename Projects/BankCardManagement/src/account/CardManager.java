
package account;

import cards.*;
import java.util.ArrayList;
import java.util.List;

public class CardManager {

    private List<Card> accounts;

    public CardManager() {
        this.accounts = new ArrayList<>();
    }

    public void createDebit(String name, String acNo, double balance) {
        accounts.add(new DebitCard(name, acNo, balance));
        System.out.println("Account Created Successfully!");
    }

    public void createCredit(String name, String acNo, double balance) {
        accounts.add(new CreditCard(name, acNo, balance));
        System.out.println("Account Created Successfully!");
    }

    public void createSalary(String name, String acNo, double balance) {
        accounts.add(new SalaryCard(name, acNo, balance));
        System.out.println("Account Created Successfully!");
    }

    public void deposit(int index, double amount) {
        accounts.get(index).deposit(amount);
    }

    public void withdraw(int index, double amount) {
        try {
            accounts.get(index).withdraw(amount);
        } catch (Exception e) {
            System.out.println("Account was not created! " + e.getMessage());
        }
    }

    public void checkBalance(int index) {
        double balance = accounts.get(index).checkBalance();
        System.out.println("Current Balance: " + balance);
    }

    public void printAccounts() {
        for (int i = 0; i < Account.NUM_OF_AC; i++) {
            System.out.println(i + accounts.get(i).toString());
        }
    }
}
