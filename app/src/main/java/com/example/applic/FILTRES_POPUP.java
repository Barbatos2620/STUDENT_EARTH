package com.example.applic;

import android.app.Activity;
import android.app.Dialog;
import android.widget.Button;
import android.widget.TextView;



public class FILTRES_POPUP extends Dialog{

    private TextView titre;
    private Button confirmbutton,filtre1,filtre2,filtre3;

    public FILTRES_POPUP(Activity activity){
        super(activity, androidx.appcompat.R.style.Theme_AppCompat_Dialog);
        setContentView(R.layout.filtres);
        this.titre=findViewById(R.id.titre);
        this.confirmbutton=findViewById(R.id.confb);
        this.filtre1=findViewById(R.id.filtre1);
        this.filtre2=findViewById(R.id.filtre2);
        this.filtre3=findViewById(R.id.filtre3);
    }



    public Button getConfirmbutton() {return confirmbutton;}

    public Button getFiltre1() {  return filtre1;}

    public Button getFiltre2() {return filtre2;}

    public Button getFiltre3() { return filtre3;}

    public void build(){
        show();

    }
}
