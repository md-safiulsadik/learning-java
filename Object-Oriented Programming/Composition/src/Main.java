public class Main {

    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects.
        //                            For example, an Engine is "part of" a Car.
        //                            Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Honda", 2020, "v2");

        car.engine.start();
        car.start();


    }

}
