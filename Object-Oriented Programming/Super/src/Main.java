public class Main {

    public static void main(String[] args) {

        // super = Refers to the parent class
        //               Used in constructors and method overriding
        //               Calls the parent constructor to initialize attributes


        Person person1 = new Person("Md", "Safiul");
        Person person2 = new Person("Kafi", "Sadik");
        Student student = new Student("Kafi", "Sadik", 2.3);
        Employee employee = new Employee("Md", "Safiul", 2340);

        employee.showInfo();

    }

}
