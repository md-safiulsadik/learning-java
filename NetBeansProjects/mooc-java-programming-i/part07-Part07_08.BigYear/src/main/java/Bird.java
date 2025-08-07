
public class Bird {
    private final String name;
    private final String latinName;
    private int observe;

//    public Bird(String name, String latinName) {
//        this.name = name;
//        this.latinName = latinName;
//    }

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observe = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setObserve(int observe) {
        this.observe +=  observe;
    }

    public int getObserve() {
        return this.observe;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Bird)) return false;

        Bird bird = (Bird) obj;

        return this.name.equals(bird.name) && this.latinName.equals(bird.latinName);
    }

    @Override
    public String  toString() {
       return this.getName() + " (" + this.getLatinName() + "): "  + this.getObserve() + " observations";
    }
}
