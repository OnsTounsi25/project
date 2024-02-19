package service;

import entities.Produit;
import utils.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ProduitService implements IService<Produit>{

    private Connection conn;
    private Statement ste;
    private PreparedStatement pdt;
    public ProduitService() {
        conn = DataSource.getInstance().getCnx();
    }
    public void add(Produit p){
        String requete="insert into produit (id,nom,categorie,description,prix,quantiteEnStock) values('"+p.getId()+"','"+p.getNom()+"','"+p.getCategorie()+"','"+p.getDescription()+
                "','"+p.getPrix()+"','"+p.getQuantiteEnStock()+"')";
        try {
            ste=conn.createStatement();
            ste.executeUpdate(requete);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void addPdt(Produit p){
        String requete="insert into produit(id,nom,categorie,description,prix,quantiteEnStock) values(?,?,?,?,?,)";
        try {
            pdt=conn.prepareStatement(requete);
            pdt.setString(1,p.getNom());
            pdt.setString(2,p.getCategorie());
            pdt.setString(3,p.getDescription());
            pdt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Produit produit) {

    }

    @Override
    public void update(Produit produit) {

    }

    @Override
    public List<Produit> readAll() {
        return null;
    }

    @Override
    public Produit readById(int id) {
        return null;
    }
}
