public class Main {

    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects.
        //                           One object contains another object as part of its structure,
        //                           but the contained object/s can exist independently.

        Book book1 = new Book("Shahi Bukhari", "Imam Bukhari", 1000);
        Book book2 = new Book("Shahi Muslim", "Imam Muslim", 1299);
        Book book3 = new Book("Shahi Thirmidi", "Imam Thirmidi", 900);

        Book[] books = {book1, book2, book3};
        Library library = new Library("Madina Library", 670, books);

        library.displayInfo();

    }
}
