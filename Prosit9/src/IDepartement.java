public interface IDepartement<T> {

    void ajouterDepartement(T t);

    boolean rechercherDepartement(String nomDepartement);

    void supprimerDepartement(T t);

    void afficherDepartements();

    void trierDepartementsParId();

    void trierDepartementsParNomEtNombreEmployes();
}
