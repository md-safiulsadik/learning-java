package storeManager;

import myStorePackage.*;
import store.Product;
import java.util.ArrayList;

public class StoreManager {
    private ArrayList<Product> products;

    public StoreManager() {
        this.products = new ArrayList<>();
    }

    public void addElectric(Electronics electronics) {
        products.add(electronics);
    }

    public void addClothing(Clothing clothing) {
        products.add(clothing);
    }

    public void addBook(Book book) {
        products.add(book);
    }

    public void search(String name) {
        if (products.isEmpty()) {
            System.out.println("Store in empty! \uD83D\uDEAB");
            return;
        }

        for (Product product : products) {
            if (name.equalsIgnoreCase(product.getName())) {
                System.out.println("Product Found: " + product.display());
                return;
            }
        }
        System.out.println("Product Not Found \uD83D\uDEAB");
    }

    public void totalPrice() {
        if (products.isEmpty()) {
            System.out.println("Store in empty! \uD83D\uDEAB");
            return;
        }

        float sum = 0;

        for (Product product : products) {
            sum += product.getPrice();
        }
        System.out.println("Total Price of All Products = " + sum);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Store in empty! \uD83D\uDEAB");
            return;
        }

        for (Product product : products) {
            System.out.println(product.display());

        }
    }
}
