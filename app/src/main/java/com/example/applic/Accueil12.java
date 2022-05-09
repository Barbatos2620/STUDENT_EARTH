package com.example.applic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil12 extends AppCompatActivity{
    private Button ConnexionPage1,InscripPage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fenetre_connexion);

        ConnexionPage1 = findViewById(R.id.buttonConn);
        InscripPage1 = findViewById(R.id.buttonInscription);

        ConnexionPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil12.this, connex.class);
                startActivity(intent);
            }

            }
        );


        InscripPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Accueil12.this, Pagun.class);
                startActivity(intent2);
            }
        });

    }

}