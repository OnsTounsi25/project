package org.example;

import entities.Produit;
import service.ProduitService;
import utils.DataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) {

       Produit p1 = new Produit(123456,"maillot équipe national","saison 2024",89.900,300,"foot");
        ProduitService ps =new ProduitService();
       // ps.add(p1);
        ps.addPdt(p1);



    }
}