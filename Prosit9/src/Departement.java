public class Departement {

    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    // Constructeur par défaut
    public Departement() {
    }

    // Constructeur paramétré
    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    // equals : égalité selon id et nom
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement)) return false;

        Departement that = (Departement) o;

        if (id != that.id) return false;
        return nomDepartement != null ?
                nomDepartement.equals(that.nomDepartement) :
                that.nomDepartement == null;
    }

    // hashCode cohérent avec equals (important pour HashSet)
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nomDepartement != null ? nomDepartement.hashCode() : 0);
        return result;
    }

    // toString lisible
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }
}
