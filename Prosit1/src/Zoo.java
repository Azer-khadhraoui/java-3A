public class Zoo {
    private static final int MAX_ANIMALS = 25;
    private Animal[] animals = new Animal[MAX_ANIMALS];
    private String name;
    private String city;
    private int animalCount = 0;

    public Zoo() {}

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein !");
            return false;
        }

        if (searchAnimal(animal) != -1) {
            System.out.println(" L’animal " + animal.name + " existe déjà !");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

        public void displayAnimals() {
        System.out.println("Animaux du zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("- " + animals[i]);
        }
    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }


    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }


    public boolean isZooFull() {
        return animalCount >= MAX_ANIMALS;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount >= z2.animalCount) ? z1 : z2;
    }


    public void displayZoo() {
        System.out.println("Zoo " + name + " à " + city + " contient " + animalCount + "/" + MAX_ANIMALS + " animaux.");
    }

    @Override
    public String toString() {
        return "Zoo " + name + " (" + city + "), animaux: " + animalCount + "/" + MAX_ANIMALS;
    }
}
