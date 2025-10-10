package GPT;

/**
 * Represents a bank account.
 */
public class Account {
	private String owner;
	private double balance;

	public Account(String owner) {
		this.owner = owner;
		this.balance = 0.0;
	}

	public String getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
}
