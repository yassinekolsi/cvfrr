public class Produit {
    private int id;
    private String nom;
    private double prix;
    private int quantiteStock;

    public Produit(int id, String nom, double prix, int quantiteStock) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantiteStock = quantiteStock;
    }

    @Override
    public String toString() {
        return "Produit [ID=" + id + ", Nom=" + nom + ", Prix=" + prix + "€, Stock=" + quantiteStock + "]";
    }

    public void modifierStock(int quantite) throws IllegalArgumentException {
        if (quantiteStock + quantite < 0) {
            throw new IllegalArgumentException("Stock insuffisant pour le produit " + nom);
        }
        quantiteStock += quantite;
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }
}