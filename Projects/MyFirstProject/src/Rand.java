import  java.util.Random;
public class Rand {

    public static void main(String[] args) {
        Random random = new Random();

        int number;
        double d_number;
        boolean is_good;

//        number = random.nextInt(); // This gives a random number -1B to 1B
        number = random.nextInt(1, 101); // 10 exclusive

//        d_number = random.nextDouble();  // This only give the decimal potion
        d_number = random.nextDouble(1.0, 101.9);

        is_good = random.nextBoolean();

        System.out.println(number);
        System.out.println(d_number);

        if (is_good) System.out.println("Good");
        else System.out.println("NOT good");

    }
}
