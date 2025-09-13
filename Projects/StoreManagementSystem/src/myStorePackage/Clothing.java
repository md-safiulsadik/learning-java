package myStorePackage;

import store.Product;

public class Clothing extends Product {
    private String  size;

    public Clothing(String id, String name, float price, String size) {
        super(id, name, price);
        this.size = size;
    }

    public String  getSize() {
        return size;
    }

    @Override
    public String display() {
        return "[Clothing] " + super.display() + ", Size: " + getSize();
    }

}

