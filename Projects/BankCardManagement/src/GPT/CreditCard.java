package GPT;

public class CreditCard extends Card {
	private double creditLimit = 1000.0;

	public CreditCard(Account account, String cardNumber) {
		super(account, cardNumber);
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && (account.getBalance() + creditLimit) >= amount) {
			account.deposit(creditLimit); // Temporarily increase balance
			account.withdraw(amount);
			account.withdraw(creditLimit); // Remove the temporary credit
		} else {
			System.out.println("Credit limit exceeded.");
		}
	}

	@Override
	public void deposit(double amount) {
		account.deposit(amount);
	}

	@Override
	public String getCardType() {
		return "Credit";
	}
}
