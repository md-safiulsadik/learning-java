package GPT;

public class DebitCard extends Card {
	public DebitCard(Account account, String cardNumber) {
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
		return "Debit";
	}
}
