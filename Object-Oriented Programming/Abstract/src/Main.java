public class Main {
    public static void main(String[] args){

        // abstract = Used to define abstract classes and methods.
        //                   Abstraction is the process of hiding implementation details
        //                   and showing only the essential features.
        //                   Abstract classes CAN'T be instantiated directly.
        //                   Can contain 'abstract' methods (which must be implemented)
        //                   Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(3);
        Tringle tringle = new Tringle(4, 5);
        Rectangle rectangle = new Rectangle(3 , 8);

        circle.display();
        System.out.println("Area: " + circle.area());
        tringle.display();
        System.out.println("Area: " + tringle.area());
        rectangle.display();
        System.out.println("Area: " + rectangle.area());

    }
}
