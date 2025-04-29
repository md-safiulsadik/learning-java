public class Students {

        String name;
        int age;
        double gpa;
        boolean isEnrolled;

        Students(String name, int age , double gpa){
            this.name = name;
            this.age = age;
            this.gpa = gpa;
            this.isEnrolled = true;
        }

        void Study(){
            System.out.printf("%s is Studying!\n", this.name);
        }

}


