package com.example.applic;

import static android.content.Intent.getIntent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Dialog;

public class description_ville extends Dialog {

    private TextView titre,desc;
    private ImageView image;
    private Button fermer;

    public description_ville(Activity activity){
        super(activity, androidx.appcompat.R.style.Theme_AppCompat_Dialog);
        setContentView(R.layout.lieu);
        this.titre=findViewById(R.id.titre);
        this.desc=findViewById(R.id.description);;
        this.fermer=findViewById(R.id.fermer_lieu);
    }





    public Button getFermer() {
        return fermer;}

    public void build(){
        show();

    }

}

