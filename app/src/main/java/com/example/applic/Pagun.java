package com.example.applic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pagun extends AppCompatActivity {

    private Button bouton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fenetre_incs);
        bouton3=findViewById(R.id.button3);
        bouton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Pagun.this, MapsActivity.class);
                startActivity(intent);
            }

        });

        }
    }
