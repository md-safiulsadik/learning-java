package GPT;

public class SalaryCard extends Card {
    public SalaryCard(Account account, String cardNumber) {
        super(account, cardNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (!account.withdraw(amount)) {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public void deposit(double amount) {
        account.deposit(amount);
    }

    @Override
    public String getCardType() {
        return "Salary";
    }
}
