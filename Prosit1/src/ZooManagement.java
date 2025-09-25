public class ZooManagement {
    public static void main(String[] args) {
        // Création de deux zoos
        Zoo zoo1 = new Zoo("Belvédère", "Tunis");
        Zoo zoo2 = new Zoo("Friguia", "Hammamet");

        // Création d’animaux
        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal tiger = new Animal("Felidae", "Shera", 3, true);
        Animal parrot = new Animal("Psittacidae", "Polly", 2, false);
        Animal lion2 = new Animal("Felidae", "Simba", 6, true); // même nom que lion


        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);
        zoo1.addAnimal(parrot);


        zoo1.addAnimal(lion2);


        zoo1.displayZoo();
        zoo1.displayAnimals();


        int index = zoo1.searchAnimal(lion);
        System.out.println("Recherche de Simba : index = " + index);


        zoo1.removeAnimal(parrot);
        zoo1.displayAnimals();


        zoo2.addAnimal(new Animal("Canidae", "Wolfy", 4, true));
        Zoo biggerZoo = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d’animaux est : " + biggerZoo);
    }
}
