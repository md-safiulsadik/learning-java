
package cards;

import account.Account;

public class DebitCard extends Account {

    public DebitCard(String name, String accountNumber, double balance) {
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
}
