/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_sociale;

/**
 *
 * @author nans.champiotbayard
 */
public class Friends {

    // Attributs
    private String nom;
    private String prenom;

    // Constructeurs
    public Friends() {
        this.nom = "Inconnu";
        this.prenom = "Inconnu";
    }

    public Friends(String nm, String prnm) {
        this.nom = nm;
        this.prenom = prnm;
    }

    // Methodes
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}
