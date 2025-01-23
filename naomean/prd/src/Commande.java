public abstract class Commande {
    protected int idCommande;
    protected String nomClient;
    protected double montantTotal;

    // Constructeur
    public Commande(int idCommande, String nomClient) {
        this.idCommande = idCommande;
        this.nomClient = nomClient;
        this.montantTotal = 0.0;
    }

    // Méthode abstraite
    public abstract void calculerMontant();

    // Méthode toString
    @Override
    public String toString() {
        return "Commande [ID=" + idCommande + ", Client=" + nomClient + ", Montant Total=" + montantTotal + "€]";
    }
}
