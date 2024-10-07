package features;
class Depense {
    private final String nom;
    private final double montant;
    private final String date;

    public Depense(String nom, double montant, String date) {
        this.nom = nom;
        this.montant = montant;
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public double getMontant() {
        return montant;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Montant: " + montant + ", Date: " + date;
    }
}