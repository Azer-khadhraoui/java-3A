import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Ali", "Ben Salah", "IT", 3);
        Employe e2 = new Employe(2, "Sami", "Trabelsi", "RH", 2);
        Employe e3 = new Employe(3, "Noura", "Mansour", "IT", 1);
        Employe e4 = new Employe(4, "Amina", "Jlassi", "Finance", 4);

        // Ajouter les employés
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("📋 Liste des employés :");
        societe.displayEmploye();

        System.out.println("\n🔍 Recherche par nom 'Sami' : " + societe.rechercherEmploye("Sami"));

        System.out.println("\n📊 Tri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n📊 Tri par département + grade + nom :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n🏢 Recherche par département 'IT' :");
        List<Employe> itList = societe.rechercherParDepartement("IT");
        for (Employe e : itList) {
            System.out.println(e);
        }
    }
}
