public class PaymentTerminal {

    private double initBalance;
    private int fullSale;
    private int halfSale;

    public PaymentTerminal() {
        this.initBalance = 100;
        this.halfSale = 0;
        this.fullSale = 0;
    }

    public PaymentTerminal(double amount) {
        this.initBalance = amount;
        this.halfSale = 0;
        this.fullSale = 0;
    }

    public void addMoneyToCard(PaymentCard card, double amount) {
        if (amount > 0) {
            card.addMoney(amount);
            addBalance(amount);
        }
    }

    public double getFull(double payment) {
        // Let's full price be 4.3
        if (payment >= 4.3) {
            this.fullSale++;
            addBalance(4.3);
            return (payment - 4.3);
        }
        return payment;
    }

    public double getHalf(double payment) {
        // Let's half price be 2.5
        if (payment >= 2.5) {
            this.halfSale++;
            addBalance(2.5);
            return (payment - 2.5);
        }
        return payment;
    }

    public double getFull(PaymentCard card) {
        // Let's full price be 4.3
        if (card.isBuyable(4.3)) {
            this.fullSale++;
            addBalance(4.3);
            return card.getBalance();
        }
        return card.getBalance();
    }

    public double getHalf(PaymentCard card) {
        // Let's half price be 2.5
        if (card.isBuyable(2.5)) {
            this.halfSale++;
            addBalance(2.5);
            return card.getBalance();
        }
        return card.getBalance();
    }

    private double getInitBalance() {
        return initBalance;
    }

    private void addBalance(double amount) {
        this.initBalance += amount;
    }

    @Override
    public String toString() {
        return "Counter details:\n" +
                "Current balance: $" + this.initBalance + "\n" +
                "Full Sale: " + this.fullSale + "\n" +
                "Half Sale: " + this.halfSale;
    }
}
