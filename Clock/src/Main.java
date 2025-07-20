
public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer(10, 10, 10);

        while (true) {

            System.out.println(timer);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            timer.advance();
        }
    }
}
