public class User {

    String firstName;
    String lastName;
    String username;
    int age;
    String email;

    User(String firstName, String lastName, int age){
        this.username = firstName.toLowerCase() + lastName.toLowerCase();
        this.age = age;
        this.email = this.username + this.age + "@yahoo.com";
    }

    User(String firstName, int age){
        this.username = firstName.toLowerCase();
        this.age = age;
        this.email = this.username + this.age + "@yahoo.com";
    }

    User(String firstName){
        this.username = firstName.toLowerCase();
        this.age = 0;
        this.email = this.username + this.age + "@yahoo.com";
    }

    User(){
        this.username = "guest";
        this.age = 0;
        this.email = this.username + this.age + "@yahoo.com";
    }
}
