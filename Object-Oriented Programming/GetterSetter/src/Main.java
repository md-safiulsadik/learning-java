public class Main {
    public static void main(String[] args) {
        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Honda", "Red", 10000);

        car.setColor("Blue");
        car.setPrice(12300);

        System.out.println(car);

    }
}
