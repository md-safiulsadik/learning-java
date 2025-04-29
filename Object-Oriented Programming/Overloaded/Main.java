public class Main {

        public static void main(String[] args) {

                // overloaded constructors = Allow a class to have multiple constructors
                //                           with different parameter lists.
                //

                User user1 = new User("Tommy", "Tato", 43);
                User user2 = new User("Jimmy", 43);
                User user3 = new User("Lemon");
                User user4 = new User();

                System.out.println(user1.username);
                System.out.println(user1.email);
                System.out.println();

        }
}