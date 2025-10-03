package zoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {}

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age); // vérification
        this.isMammal = isMammal;
    }

    // Getters & Setters avec vérifications
    public String getFamily() { return family; }
    public void setFamily(String family) { this.family = family; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("❌ L’âge d’un animal ne peut pas être négatif !");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isMammal() { return isMammal; }
    public void setMammal(boolean mammal) { isMammal = mammal; }

    @Override
    public String toString() {
        return name + " (" + family + "), âge: " + age + ", mammifère: " + isMammal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        return this.name.equalsIgnoreCase(other.name);
    }
}
