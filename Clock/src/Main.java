
public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {

            System.out.println(timer);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            timer.advance();
        }
    }
}
