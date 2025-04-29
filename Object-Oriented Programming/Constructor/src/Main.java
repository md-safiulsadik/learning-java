public class Main {

    static public void main(String[] args) {

        // constructor = A special method to initialize objects
        //                         You can pass arguments to a constructor
        //                         and set up initial values

        Students student1 = new Students("Sadik", 23, 3.04);
        Students student2 = new Students("Kafi", 22, 3.4);
        Students student3 = new Students("Safiul", 24, 3.34);

        student3.Study();
        student2.Study();
        student1.Study();


    }
}
