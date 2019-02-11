package com.example.alexis.trombinoscope;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class AjoutPersonne extends AppCompatActivity {
    Button btnAjout;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_personne);
        btnAjout = (Button) findViewById(R.id.Ajouter);
        btnAjout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = ((EditText)findViewById(R.id.nom)).getText().toString();
                String prenom = ((EditText)findViewById(R.id.name)).getText().toString();
                if (!nom.equals("") && !prenom.equals("")) {
                    Personne p = new Personne(nom, prenom);
                    DataPersonne.addPersonne(p);
                    Toast.makeText(getApplicationContext(), p.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}
