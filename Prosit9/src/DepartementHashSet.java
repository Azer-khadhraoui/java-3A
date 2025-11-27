import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement d) {
        boolean added = departements.add(d);
        if (!added) {
            System.out.println("Departement déjà existant (même id et nom) : " + d);
        }
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement() != null &&
                    d.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Departement d) {
        boolean removed = departements.remove(d);
        if (!removed) {
            System.out.println("Departement introuvable : " + d);
        }
    }

    @Override
    public void afficherDepartements() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département.");
            return;
        }
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        List<Departement> liste = new ArrayList<>(departements);
        Collections.sort(liste, Comparator.comparingInt(Departement::getId));

        System.out.println("Départements triés par id :");
        for (Departement d : liste) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> liste = new ArrayList<>(departements);
        Collections.sort(liste,
                Comparator.comparing(Departement::getNomDepartement)
                        .thenComparingInt(Departement::getNombreEmployes));

        System.out.println("Départements triés par nom puis nombre d'employés :");
        for (Departement d : liste) {
            System.out.println(d);
        }
    }
}
