package features;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionnaireBudget {
    private final List<Depense> listeDepenses;

    public GestionnaireBudget() {
        this.listeDepenses = new ArrayList<>();
    }

    public void ajouterDepense(String nom, double montant, String date) {
        Depense depense = new Depense(nom, montant, date);
        listeDepenses.add(depense);
        System.out.println("Dépense ajoutée avec succès.");
    }

    public double calculerTotalDepenses() {
        double total = 0;
        for (Depense depense : listeDepenses) {
            total += depense.getMontant();
        }
        return total;
    }

    public void afficherResume() {
        System.out.println("Résumé des dépenses :");
        for (Depense depense : listeDepenses) {
            System.out.println(depense);
        }
        System.out.println("Total des dépenses : " + calculerTotalDepenses());
    }

    public static void main(String[] args) {
        System.out.println("Bienvenue dans le Gestionnaire de Budget");
        GestionnaireBudget gestionnaireBudget = new GestionnaireBudget();
        Scanner scanner = new Scanner(System.in);

        // Ajout des dépenses de test
        gestionnaireBudget.ajouterDepense("Courses", 50.0, "2024-10-01");
        gestionnaireBudget.ajouterDepense("Transport", 15.0, "2024-10-02");
        gestionnaireBudget.afficherResume();

        while (true) {
            System.out.println("Choisissez une option : 1. Ajouter une dépense  2. Afficher le résumé  3. Quitter");
            int choix = scanner.nextInt();
            scanner.nextLine();  // Consommer la nouvelle ligne

            if (choix == 1) {
                System.out.print("Entrez le nom de la dépense : ");
                String nom = scanner.nextLine();
                System.out.print("Entrez le montant de la dépense : ");
                double montant = scanner.nextDouble();
                scanner.nextLine();  // Consommer la nouvelle ligne
                System.out.print("Entrez la date de la dépense (format JJ/MM/AAAA) : ");
                String date = scanner.nextLine();
                gestionnaireBudget.ajouterDepense(nom, montant, date);
            } else if (choix == 2) {
                gestionnaireBudget.afficherResume();
            } else if (choix == 3) {
                System.out.println("Merci d'avoir utilisé le Gestionnaire de Budget. Au revoir !");
                break;
            } else {
                System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }

        scanner.close();
    }
}