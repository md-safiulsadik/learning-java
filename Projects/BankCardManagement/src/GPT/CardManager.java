package GPT;

import java.util.ArrayList;
import java.util.List;

public class CardManager {
    private List<Account> accounts = new ArrayList<>();
    private List<Card> cards = new ArrayList<>();

    public Account createAccount(String owner) {
        Account acc = new Account(owner);
        accounts.add(acc);
        return acc;
    }

    public Card issueCard(String type, Account account, String cardNumber) {
        Card card = CardFactory.createCard(type, account, cardNumber);
        cards.add(card);
        return card;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Card> getCards() {
        return cards;
    }
}
