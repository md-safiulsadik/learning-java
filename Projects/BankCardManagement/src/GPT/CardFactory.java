package GPT;

public class CardFactory {
    public static Card createCard(String type, Account account, String cardNumber) {
        switch (type.toLowerCase()) {
            case "debit":
                return new DebitCard(account, cardNumber);
            case "credit":
                return new CreditCard(account, cardNumber);
            case "salary":
                return new SalaryCard(account, cardNumber);
            default:
                throw new IllegalArgumentException("Unknown card type: " + type);
        }
    }
}
