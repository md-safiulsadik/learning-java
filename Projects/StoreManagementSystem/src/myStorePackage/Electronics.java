package myStorePackage;

import store.Product;

public class Electronics extends Product {
    private int warranty;

    public Electronics(String id, String name, float price, int warranty) {
        super(id, name, price);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public String display() {
        return "[Electronics] " + super.display() + ", Warranty: " + getWarranty() + " years";
    }
}
