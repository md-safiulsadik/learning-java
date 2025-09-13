package myStorePackage;

import store.Product;

public class Book extends Product {
    private String author;

    public Book(String id, String name, float price, String author) {
        super(id, name, price);
        this.author =  author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String display() {
        return "[Book] " + super.display() + ", Author: " + getAuthor();
    }
}
