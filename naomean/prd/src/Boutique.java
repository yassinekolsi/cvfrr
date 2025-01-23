import java.util.ArrayList;

public class Boutique {
    private ArrayList<Produit> listeProduits;
    private ArrayList<Commande> historiqueCommandes;

    // Constructeur
    public Boutique() {
        listeProduits = new ArrayList<>();
        historiqueCommandes = new ArrayList<>();
    }

    // Ajouter un produit à la boutique
    public void ajouterProduit(Produit produit) {
        listeProduits.add(produit);
    }

    // Afficher tous les produits
    public void afficherProduits() {
        System.out.println("Liste des produits :");
        for (Produit produit : listeProduits) {
            System.out.println(produit);
        }
    }

    // Créer une commande
    public void creerCommande(Commande commande, int produitId, int quantite) {
        try {
            // Vérifier le stock et mettre à jour
            Produit produit = trouverProduitParId(produitId);
            if (produit == null) {
                System.out.println("Produit non trouvé !");
                return;
            }
            produit.modifierStock(-quantite);
            commande.montantTotal += produit.getPrix() * quantite;
            commande.calculerMontant();
            historiqueCommandes.add(commande);
            System.out.println("Commande créée avec succès !");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Afficher les commandes
    public void afficherCommandes() {
        System.out.println("Historique des commandes :");
        for (Commande commande : historiqueCommandes) {
            System.out.println(commande);
        }
    }

    // Trouver un produit par ID
    private Produit trouverProduitParId(int id) {
        for (Produit produit : listeProduits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }
}
