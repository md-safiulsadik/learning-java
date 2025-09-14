
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here
        
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();
        
//        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        
        ((Cat) cat).purr();

    }

}
