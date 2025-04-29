public class Student extends Person{

    double gpa;

    Student(String firstName, String lastName, double gpa) {
        super(firstName, lastName);
        this.gpa = gpa;
    }

    void showInfo(){
        System.out.println("Name: " + this.firstName + " " + this.lastName + "\n" + "GPA: " + this.gpa);
    }
}
