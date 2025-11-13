import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private List<Employe> listEmployes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        listEmployes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : listEmployes) {
            if (e.getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe t) {
        return listEmployes.contains(t);
    }

    @Override
    public void supprimerEmploye(Employe t) {
        listEmployes.remove(t);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : listEmployes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listEmployes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int res = e1.getNomDepartement().compareToIgnoreCase(e2.getNomDepartement());
                if (res == 0) {
                    res = Integer.compare(e1.getGrade(), e2.getGrade());
                    if (res == 0) {
                        res = e1.getNom().compareToIgnoreCase(e2.getNom());
                    }
                }
                return res;
            }
        });
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();
        for (Employe e : listEmployes) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                result.add(e);
            }
        }
        return result;
    }
}
