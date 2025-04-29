public class Main {
    static public void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //                       Used to return a string representation of an object.
        //                       By default, it returns a hash code as a unique identifier.
        //                       It can be overridden to provide meaningful details.

        Car car1 = new Car("Ford", "Mustang", 2022, "Blue");
        Car car2 = new Car("Honda", "CG-21", 2012, "Red");

        System.out.println(car1);
        System.out.println(car2);

    }
}
