package zoo.management;

import zoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Aquatic Paradise", "Tunis");

        // Ajout d’animaux aquatiques
        Dolphin d1 = new Dolphin("Mammifère", "Flipper", 8, true, "Mer", 25.5f);
        Dolphin d2 = new Dolphin("Mammifère", "Blue", 6, true, "Océan", 30.0f);
        Penguin p1 = new Penguin("Oiseau", "Pingu", 4, false, "Bassin", 12.2f);
        Penguin p2 = new Penguin("Oiseau", "Empereur", 3, false, "Bassin", 15.5f);

        zoo.addAquaticAnimal(d1);
        zoo.addAquaticAnimal(d2);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);

        System.out.println("\n=== Appel de swim() ===");
        zoo.showAquaticSwim();

        System.out.println("\n=== Profondeur maximale des pingouins ===");
        System.out.println("Max depth: " + zoo.getMaxPenguinDepth() + " m");

        System.out.println("\n=== Nombre par type ===");
        zoo.showAquaticCountByType();

        // Test de equals()
        System.out.println("\n=== Test equals() ===");
        Dolphin d3 = new Dolphin("Mammifère", "Flipper", 8, true, "Mer", 27f);
        System.out.println("d1.equals(d3) → " + d1.equals(d3)); // true
    }
}
