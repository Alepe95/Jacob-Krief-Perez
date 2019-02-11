package com.example.alexis.trombinoscope;


import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by alexis on 11/02/2019.
 */

public class DataPersonne {
    ArrayList<Personne> ListePersonne = new ArrayList<>();

    public ArrayList getPersonne(){
        return this.ListePersonne;
    }

    public void addPersonne(Personne p){
        ListePersonne.add(p);
    }


}
