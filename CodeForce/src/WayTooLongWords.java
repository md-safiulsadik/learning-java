import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfInput =  Integer.parseInt(scanner.nextLine());
        String[] words = new String[numOfInput];

        for (int i = 0; i < numOfInput; i++) {
            words[i] = scanner.nextLine();

            if (words[i].length() > 10) {
                words[i] = words[i].charAt(0) + String.valueOf(words[i].length() - 2) + words[i].charAt(words[i].length() - 1);
            }
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
