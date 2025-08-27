
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object compare) {
        if (this == compare) return true;
        if (!(compare instanceof Item)) return false;
        
        Item compareItem = (Item) compare;
        
        return this.name.equals(compareItem.name);
    }
    
    @Override
    public int hashCode() {
        return this.name.hashCode() * 371;
    }

}
