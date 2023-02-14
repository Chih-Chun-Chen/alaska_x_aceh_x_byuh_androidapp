package com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.alaska_x_aceh_x_byuh_androidapp.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Shelter1Activity extends AppCompatActivity implements OnMapReadyCallback {

    private MapView mapView1;
    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter1);

        mapView1 = findViewById(R.id.mapView1);
        mapView1.onCreate(savedInstanceState);
        mapView1.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        this.googleMap = map;

        LatLng location = new LatLng(21.633169,-157.912135);
        googleMap.addMarker(new MarkerOptions().position(location).title("Googleplex"));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location, 15.0f));
    }

    // ... other lifecycle methods ...
}

