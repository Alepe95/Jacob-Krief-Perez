package com.example.alexis.trombinoscope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class AjoutPersonne extends AppCompatActivity {
    Button btnAjout;

    Personne p1 = new Personne("alexis","perez");
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_personne);
        btnAjout = (Button) findViewById(R.id.btnTrombinoscope);
        btnAjout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i(Tag, msg:"redirection vers person List")
                Toast.makeText(getApplicationContext(), "Ajout de l'étudiant", Toast.LENGTH_LONG).show();
                //TextView nom = (TextView) findViewById(R.id.nom);
                DataPersonne.addPersonne(p1);
            }
        });
    }
}
