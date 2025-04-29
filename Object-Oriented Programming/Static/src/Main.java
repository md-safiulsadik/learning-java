public class Main {

    public static void main(String[] args) {

        // static = Modifies a variable or method belong to the class,
        //               rather than to any specific object.
        //               Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Kalu");
        Friend friend2 = new Friend("Lalu");
//        Friend friend3 = new Friend("Zalu");

        System.out.println(Friend.numOfFriend);
    }

}
