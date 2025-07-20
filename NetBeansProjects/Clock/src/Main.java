
public class Main {

    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(1000); // 10 milliseconds = 1 hundredth of a second
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
