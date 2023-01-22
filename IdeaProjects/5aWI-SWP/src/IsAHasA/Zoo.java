package IsAHasA;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String street;
    private List<Animal> animals;

    public Zoo(String name, String street) {
        this.name = name;
        this.street = street;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    public  void showAnimals(){
        for(Animal animal: this.animals){
            System.out.println("Animal:" + animal.getWeight());
        }
    }


}