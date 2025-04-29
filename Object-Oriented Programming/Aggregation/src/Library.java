public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo() {
        int count = 1;
        System.out.printf("The %d %s\n", this.year, this.name);
        System.out.println("Book available: ");
        for (Book book : books) {
            System.out.printf("%d. ", count++);
            book.displayInfo();
        }
    }

}
