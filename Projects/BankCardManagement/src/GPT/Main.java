package GPT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardManager cardManager = new CardManager();
        UserInterface ui = new UserInterface(scanner, cardManager);
        ui.run();
    }
}
