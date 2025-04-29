public class Main {

    static public void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //                         from another class.
        //                         Child <-- Parents <-- Grandparent

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        if (!plant.isAlive)
            plant.needWater();
        else plant.buyNewPlant();

    }
}