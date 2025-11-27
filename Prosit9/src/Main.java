public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "RH", 5);
        Departement d3 = new Departement(3, "Finance", 8);
        Departement d4 = new Departement(1, "Informatique", 10); // même que d1

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);
        gestion.ajouterDepartement(d4); // ne sera pas ajouté (HashSet + equals/hashCode)

        gestion.afficherDepartements();

        System.out.println("Recherche 'RH' : " + gestion.rechercherDepartement("RH"));

        gestion.trierDepartementsParId();
        gestion.trierDepartementsParNomEtNombreEmployes();
    }
}
