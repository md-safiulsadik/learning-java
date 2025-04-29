public class Employee extends Person{

    int salary;

    Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("Name: " + this.firstName + " " + this.lastName + "\n" + "Salary: " + this.salary);
    }
}
