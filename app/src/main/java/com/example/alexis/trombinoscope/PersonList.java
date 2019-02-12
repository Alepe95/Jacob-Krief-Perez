package com.example.alexis.trombinoscope;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by natkr on 11/02/2019.
 */
public class PersonList extends AppCompatActivity {
    ArrayList<Person> liste = DataPersonne.getPersonne();
    ListView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_personne);
        Log.i(this.getClass().getName(), "List des personnes :" + DataPersonne.getPersonne());

        view = (ListView) findViewById(R.id.listeP);

        PersonAdapter adapt = new PersonAdapter( PersonList.this,liste);
        view.setAdapter(adapt);
    }
}
