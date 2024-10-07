import features.GestionnaireBudget;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenue dans le Gestionnaire de Budget");
        GestionnaireBudget gestionnaireBudget = new GestionnaireBudget();
        Scanner scanner = new Scanner(System.in);


        gestionnaireBudget.ajouterDepense("Courses", 50.0, "2024-10-01");
        gestionnaireBudget.ajouterDepense("Transport", 15.0, "2024-10-02");
        gestionnaireBudget.afficherResume();

        while (true) {
            System.out.println("Choisissez une option : 1. Ajouter une dépense  2. Afficher le résumé  3. Quitter");
            int choix = scanner.nextInt();
            scanner.nextLine();

            if (choix == 1) {
                System.out.print("Entrez le nom de la dépense : ");
                String nom = scanner.nextLine();
                System.out.print("Entrez le montant de la dépense : ");
                double montant = scanner.nextDouble();
                scanner.nextLine();
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