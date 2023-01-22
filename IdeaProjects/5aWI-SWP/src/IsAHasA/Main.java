package IsAHasA;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(40,20);
        Animal a2 = new Animal(50,30);

        Zoo z1 = new Zoo("Munich Zoo", "Muenchnerstraße");
        z1.addAnimal(a1);
        z1.addAnimal(a2);
        z1.showAnimals();

        Dog d1 = new Dog(20,10);
        z1.addAnimal(d1);
        z1.showAnimals();
        d1.bark();
    }
}
