public class App {
    public static void main(String[] args) {
        // Créer une boutique
        Boutique boutique = new Boutique();

        // Ajouter des produits
        boutique.ajouterProduit(new Produit(1, "Ordinateur Portable", 1000.0, 10));
        boutique.ajouterProduit(new Produit(2, "Souris", 20.0, 50));
        boutique.ajouterProduit(new Produit(3, "Clavier", 50.0, 30));

        // Afficher les produits
        boutique.afficherProduits();

        // Créer une commande
        Commande commande1 = new CommandeEnLigne(1, "Alice", 5.0);
        boutique.creerCommande(commande1, 1, 2); // Acheter 2 ordinateurs portables
        boutique.creerCommande(commande1, 2, 1); // Acheter 1 souris

        // Afficher les commandes
        boutique.afficherCommandes();

        // Afficher le stock mis à jour
        boutique.afficherProduits();
    }
}
