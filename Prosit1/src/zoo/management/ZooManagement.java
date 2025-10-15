package zoo.management;

import zoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        // Instanciation simple (Instruction 21)
        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        System.out.println("Création d'objets réussie sans erreur ✅");

        // Instanciation paramétrée (Instruction 22)
        Aquatic aq1 = new Aquatic("Poisson", "Requin", 10, false, "Océan");
        Terrestrial t1 = new Terrestrial("Félin", "Tigre", 5, true, 4);
        Dolphin d1 = new Dolphin("Mammifère", "Flipper", 8, true, "Mer", 25.5f);
        Penguin p1 = new Penguin("Oiseau", "Pingouin Empereur", 3, false, "Bassin", 10.2f);

        System.out.println("\n=== toString() Test ===");
        System.out.println(aq1);
        System.out.println(t1);
        System.out.println(d1);
        System.out.println(p1);

        // Test méthode swim() (Instruction 24)
        System.out.println("\n=== Méthode swim() ===");
        aq1.swim();
        d1.swim();
        p1.swim();
    }
}
