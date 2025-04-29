public class Book {

    String title;
    String author;
    int pages;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void displayInfo() {
        System.out.println(this.title + " " + "Author: "+ this.author + " " + "Pages: " + this.pages);
    }

}
