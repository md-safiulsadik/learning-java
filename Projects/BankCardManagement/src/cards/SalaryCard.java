
package cards;

import account.Account;

public class SalaryCard extends Account {

    public SalaryCard(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn (Credit Used): " + amount);
        } else {
            System.out.println("Withdraw failed!⚠\uFE0F");
        }
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposit not available for Salary Card!");
    }

}
