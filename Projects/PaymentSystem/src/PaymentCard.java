
public class PaymentCard {

    private double balance;

    public PaymentCard() {
        this.balance = 0;
    }

    public PaymentCard(double amount) {
        this.balance = amount;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean isBuyable(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Your card has: " + "$" + this.balance;
    }
}
