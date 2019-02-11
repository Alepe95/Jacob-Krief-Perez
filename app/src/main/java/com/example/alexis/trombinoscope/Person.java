package com.example.alexis.trombinoscope;

/**
 * Created by alexis on 11/02/2019.
 */

public class Person {

    private String nom;
    private String prenom;
    private int avatarColor;

    public Person(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public int getAvatarColor(){
        return this.avatarColor;
    }
    @Override
    public String toString(){
        return "Nom : "+ this.getNom()+"Prénom: "+this.getPrenom();
    }
}
