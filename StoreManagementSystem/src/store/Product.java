package store;

public class Product {
    private String id;
    private String name;
    private float price;

    public Product(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String  display() {
        return "ID: " + getId() + ", Name: " + getName() + ", Price: " + getPrice();
    }

}
