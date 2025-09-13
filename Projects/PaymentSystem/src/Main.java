
public class Main {

    public static void main(String[] args) {

        PaymentCard card = new PaymentCard(2);
        PaymentTerminal terminal = new PaymentTerminal();

        terminal.addMoneyToCard(card, 5);
        terminal.getFull(card);

        System.out.println(card);
        System.out.println(terminal);
    }
}
