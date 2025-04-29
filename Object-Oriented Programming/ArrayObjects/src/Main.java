public class Main {
    public static void main(String[] args) {

        // Array of Objects

//        Car car1 = new Car("Mustang", "Red");
//        Car car2 = new Car("Toyota", "Blue");
//        Car car3 = new Car("Honda", "Yellow");

        Car[] cars = {new Car("Mustang", "Red"),
                new Car("Corvette", "Blue"),
                new Car("Charger", "Yellow")};

        for(Car car : cars){
            car.color = "black";
        }

        for(Car car : cars){
            car.drive();
        }
    }

}
