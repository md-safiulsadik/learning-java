
package account;

import cards.Card;

public class Account implements Card {

    public static int NUM_OF_AC = 0;
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        setName(name);
        setBalance(balance);
        setAccountNumber(accountNumber);
        Account.NUM_OF_AC++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if  (balance >= 0) { this.balance = balance; }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;
            System.out.println("Withdrawn (Credit Used): " + amount);
        } else {
            System.out.println("Withdraw failed!⚠\uFE0F");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Something went wrong!");
        }
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return " -> " + getName() + " (" + this.getClass().getSimpleName() + ")";
    }
}
