package zoo.entities;

public class Zoo {
    private static final int MAX_ANIMALS = 3; // ✅ capacité réduite à 3
    private Animal[] animals = new Animal[MAX_ANIMALS];
    private int animalCount = 0;

    private String name;
    private String city;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // ✅ Nouvelle version : ne retourne plus rien
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        // Vérifie l'âge de l'animal
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Âge d’animal invalide : l’âge ne peut pas être négatif.");
        }

        // Vérifie la capacité du zoo
        if (animalCount >= MAX_ANIMALS) {
            throw new ZooFullException("Le zoo est plein, impossible d’ajouter un nouvel animal.");
        }

        // Ajout normal
        animals[animalCount++] = animal;
        System.out.println("✅ Animal ajouté : " + animal.getName());
    }

    public int getAnimalCount() {
        return animalCount;
    }
}
