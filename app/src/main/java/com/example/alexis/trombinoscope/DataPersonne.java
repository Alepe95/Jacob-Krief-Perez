package com.example.alexis.trombinoscope;


import java.util.*;

/**
 * Created by alexis on 11/02/2019.
 */

public class DataPersonne {
    static ArrayList<Person> personnes = new ArrayList<>();

    public static ArrayList getPersonne(){
        return personnes;
    }

    public static void addPersonne(Person p){
        personnes.add(p);
    }


}
