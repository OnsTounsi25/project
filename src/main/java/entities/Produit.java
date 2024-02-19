package entities;

public class Produit {
    private int id;
    private String nom;
    private String description;
    private double prix;
    private int quantiteEnStock;
    private String categorie;

    public Produit(int id, String nom, String description, double prix, int quantiteEnStock, String categorie) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantiteEnStock = quantiteEnStock;
        this.categorie = categorie;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", quantiteEnStock=" + quantiteEnStock +
                ", categorie='" + categorie + '\'' +
                '}';
    }
}
