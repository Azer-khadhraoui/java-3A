public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal() {}

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return name + " (" + family + "), âge: " + age + ", mammifère: " + isMammal;
    }

    // Pour comparer deux animaux par leur nom (simplification pour Prosit 3)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        return this.name.equalsIgnoreCase(other.name);
    }
}
