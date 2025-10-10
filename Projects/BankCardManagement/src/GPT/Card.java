package GPT;

public abstract class Card {
	protected Account account;
	protected String cardNumber;

	public Card(Account account, String cardNumber) {
		this.account = account;
		this.cardNumber = cardNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public Account getAccount() {
		return account;
	}

	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
	public abstract String getCardType();

	@Override
	public String toString() {
		return getCardType() + " Card [Number: " + cardNumber + ", Owner: " + account.getOwner() + ", Balance: " + account.getBalance() + "]";
	}
}
