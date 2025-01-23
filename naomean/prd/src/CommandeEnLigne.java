public class CommandeEnLigne extends Commande {
    private double fraisLivraison;

    // Constructeur
    public CommandeEnLigne(int idCommande, String nomClient, double fraisLivraison) {
        super(idCommande, nomClient);
        this.fraisLivraison = fraisLivraison;
    }

    // Implémentation de calculerMontant
    @Override
    public void calculerMontant() {
        montantTotal += fraisLivraison;
    }

    @Override
    public String toString() {
        return super.toString() + ", Frais Livraison=" + fraisLivraison + "€";
    }
}