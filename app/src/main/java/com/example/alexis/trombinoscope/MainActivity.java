package com.example.alexis.trombinoscope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnTrombino;
    Button btnAjouterPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Log.i(TAG, msg:"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTrombino = (Button) findViewById(R.id.btnTrombinoscope);
        btnAjouterPerson = (Button) findViewById(R.id.Add_Personne);
        btnAjouterPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i(Tag, msg:"redirection vers person List")
                Toast.makeText(getApplicationContext(), "BIENVENUE AU TROMBINOSCOPE", Toast.LENGTH_LONG).show();
                Intent activityChangeIntent = new Intent(MainActivity.this, AjoutPersonne.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });

        btnTrombino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "BIENVENUE AU kay", Toast.LENGTH_LONG).show();
                Intent activityChangeIntent = new Intent(MainActivity.this, PersonList.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
    }
}
