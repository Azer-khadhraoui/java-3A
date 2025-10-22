package zoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {}

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }

    // Méthode abstraite → toutes les sous-classes doivent la redéfinir
    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }

    // Redéfinition de equals() (Instruction 31)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;
        Aquatic other = (Aquatic) obj;
        return this.name.equalsIgnoreCase(other.name)
                && this.age == other.age
                && this.habitat.equalsIgnoreCase(other.habitat);
    }
}
