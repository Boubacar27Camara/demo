package demo_app.service;

import demo_app.modele.Produit;

import java.util.List;

public interface ProduitService {

    Produit creer(Produit produit);

        List<Produit> lire();

        Produit modifier(long id, Produit produit);

        String supprimer(Long id);

}
