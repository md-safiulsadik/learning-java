import javax.swing.plaf.PanelUI;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Exceptions exceptions = new Exceptions();
//        exceptions.autoException();
//        exceptions.manualException();

        boolean isRunning = true;

//        while (isRunning) {
//            try {
//                exceptions.divide();
//                isRunning = false;
//            } catch (ArithmeticException ae) {
//                System.out.println("Stupid! 🤨 Can't divide by 0");
//            } catch (InputMismatchException im) {
//                System.out.println("Stupid! 🤨 input a Integer");
//            } finally {
//                System.out.println("You are such a Stupid! 🤨");
//            }
//        }

        Battery battery = new Battery();
        try {
            battery.playable(20);
        } catch (LowBatteryLevelException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Rest of the program!");
    }

}

class Exceptions {

    public void autoException() {
        int[] nums = new int[5];
        nums[10] = 100;
        System.out.println(nums[50]);
    }

    public void manualException() {
//        throw new ArrayIndexOutOfBoundsException("Stupid!");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 0) {
            throw new IllegalArgumentException("Stupid!🤨 Number can't ne negative");
        } else {
            System.out.println("Your number is: " + num);
        }

        System.out.println("this is a manual exception");

    }

    public void divide() throws ArithmeticException, InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1 / num2);
    }
}


class Battery {

    public void playable(double batteryLevel) throws LowBatteryLevelException {

        if (batteryLevel < 30) {
            throw new LowBatteryLevelException("Please connect your charger", batteryLevel);
        } else {
            System.out.println("The Game is Opening!");
        }
    }
}

class LowBatteryLevelException extends Exception {
    private String message;
    private double percent;

    LowBatteryLevelException() {
        super("Battery is below (30%)");
    }

    LowBatteryLevelException(String message) {
        super(message);
        this.message = message;
    }

    LowBatteryLevelException(String message, double percent) {
        super(message + " (" + percent + "%)");
        this.message = message;
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }
}