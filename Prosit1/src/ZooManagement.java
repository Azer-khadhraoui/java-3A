import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        int nbrCages = 20;
        String zooName = "my zoo";


        System.out.println("Bienvenue dans " + zooName + " qui contient " + nbrCages + " cages.");


        Scanner sc = new Scanner(System.in);

        // Saisie du nom du zoo
        System.out.print("Entrez le nom du zoo : ");
        String inputName = sc.nextLine();
        while (inputName.trim().isEmpty()) {
            System.out.print("Nom invalide, veuillez entrer un nom non vide : ");
            inputName = sc.nextLine();
        }
        zooName = inputName;


        System.out.print("Entrez le nombre de cages : ");
        while (!sc.hasNextInt()) {
            System.out.print("Veuillez entrer un entier positif : ");
            sc.next(); // consommer l’entrée invalide
        }
        int inputCages = sc.nextInt();
        while (inputCages <= 0) {
            System.out.print("Le nombre de cages doit être positif : ");
            while (!sc.hasNextInt()) {
                System.out.print("Veuillez entrer un entier positif : ");
                sc.next();
            }
            inputCages = sc.nextInt();
        }
        nbrCages = inputCages;

        // Étape 3 : affichage des changements
        System.out.println("le zoo " + zooName + " contient " + nbrCages + " cages.");

        sc.close();
    }
}
