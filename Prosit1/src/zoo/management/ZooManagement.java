package zoo.management;

import zoo.entities.Animal;
import zoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Belvédère", "Tunis");
        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal tiger = new Animal("Felidae", "Shera", 3, true);

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);

        zoo1.displayZoo();
        zoo1.displayAnimals();
    }
}
