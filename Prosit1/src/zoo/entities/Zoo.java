package zoo.entities;

public class Zoo {
    private static final int MAX_ANIMALS = 25;
    private static final int MAX_AQUATICS = 10;

    private Animal[] animals = new Animal[MAX_ANIMALS];
    private Aquatic[] aquaticAnimals = new Aquatic[MAX_AQUATICS];

    private String name;
    private String city;
    private int animalCount = 0;
    private int aquaticCount = 0;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // Ajout d’un animal terrestre ou autre
    public boolean addAnimal(Animal animal) {
        if (animalCount >= MAX_ANIMALS) return false;
        animals[animalCount++] = animal;
        return true;
    }

    // ✅ Instruction 25 : ajouter un animal aquatique
    public boolean addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount >= MAX_AQUATICS) {
            System.out.println("❌ Tableau d’animaux aquatiques plein !");
            return false;
        }
        aquaticAnimals[aquaticCount++] = aquatic;
        return true;
    }

    // ✅ Instruction 26 : appeler swim() sur tous les aquatiques
    public void showAquaticSwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // ✅ Instruction 27 : profondeur max des pingouins
    public float getMaxPenguinDepth() {
        float max = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > max) max = p.getSwimmingDepth();
            }
        }
        return max;
    }

    // ✅ Instruction 28 : nombre de dauphins et pingouins
    public void showAquaticCountByType() {
        int dolphins = 0, penguins = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphins++;
            else if (aquaticAnimals[i] instanceof Penguin) penguins++;
        }
        System.out.println("Nombre de dauphins : " + dolphins);
        System.out.println("Nombre de pingouins : " + penguins);
    }
}
