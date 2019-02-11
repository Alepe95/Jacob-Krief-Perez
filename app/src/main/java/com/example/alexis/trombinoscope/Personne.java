package com.example.alexis.trombinoscope;

/**
 * Created by alexis on 11/02/2019.
 */

public class Personne {

    private String nom;
    private String prenom;
    private int Couleur;

    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    @Override
    public String toString(){
        return "Nom : "+ this.getNom()+"Prénom: "+this.getPrenom();
    }
}
