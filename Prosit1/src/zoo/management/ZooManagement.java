package zoo.management;

import zoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Belvédère", "Tunis");

        Animal a1 = new Animal("Félin", "Lion", 5, true);
        Animal a2 = new Animal("Canin", "Loup", -2, true); // âge invalide ❌
        Animal a3 = new Animal("Oiseau", "Perroquet", 3, false);
        Animal a4 = new Animal("Mammifère", "Éléphant", 10, true); // dépassement ❌

        // On teste les différents cas
        try {
            zoo.addAnimal(a1); // ✅ valide
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre d’animaux : " + zoo.getAnimalCount());

        try {
            zoo.addAnimal(a2); // ❌ âge invalide
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre d’animaux : " + zoo.getAnimalCount());

        try {
            zoo.addAnimal(a3); // ✅ valide
            zoo.addAnimal(a4); // ❌ zoo plein
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre d’animaux : " + zoo.getAnimalCount());
    }
}
