package com.example.applic;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.location.Location;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.applic.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;


import java.util.HashMap;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, OnMarkerClickListener, GoogleMap.OnMapClickListener {

    HashMap<String, LatLng> resto;
    HashMap<String, LatLng> bar;
    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    private Button bouton1,buton,oui;
    private MapsActivity activity;
    private LocationManager locationManager;
    public Marker marker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.activity = this;


        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        resto=new HashMap<>();
        bar=new HashMap<>();


        // Add a marker in Sydney and move the camera

        LatLng sydney = new LatLng(44.8584622, -0.5730805);
        marker=mMap.addMarker(new MarkerOptions()
                .position(sydney)
                .draggable(true)
                .title("6 Pl. Ravezies, 33000 Bordeaux"))
        ;

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,12));

        buton=findViewById(R.id.but);
        bouton1 =findViewById(R.id.accesfiltre);
        oui=findViewById(R.id.accescompte);
        bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FILTRES_POPUP custom=new FILTRES_POPUP(activity);
                custom.build();
            }
        });

        buton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MapsActivity.this,ajout.class);
                startActivity(intent3);
            }

        }
        );
        oui.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MapsActivity.this,compte.class);
                startActivity(intent3);
            }

        }
        );


        mMap.setOnMarkerClickListener(this);

        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(@NonNull LatLng latLng) {
                MarkerOptions opt=new MarkerOptions();
                opt.position(latLng);
                opt.title("  ");

                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,10));
                mMap.addMarker(opt);

            }


        });

    }

    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        description_ville desc=new description_ville(activity);
        desc.build();
        return false;
    }


    @Override
    public void onMapClick(@NonNull LatLng latLng) {

    }

   }




