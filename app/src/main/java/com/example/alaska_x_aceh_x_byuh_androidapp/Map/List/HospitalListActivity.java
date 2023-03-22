package com.example.alaska_x_aceh_x_byuh_androidapp.Map.List;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter.SullivanArenaWarmingAreaActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Home.ShelterActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Map.List.Hospital.Native_Medical_Center;
import com.example.alaska_x_aceh_x_byuh_androidapp.Map.List.Hospital.ProvidenceActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Map.List.Hospital.RegionActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.R;

public class HospitalListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_list);

        Button Aleska_Regional_Hospital = findViewById(R.id.Aleska_Regional_Hospital_FramLayout);
        Aleska_Regional_Hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Regional_Hospital_intent = new Intent(HospitalListActivity.this, RegionActivity.class);
                startActivity(Regional_Hospital_intent);
            }
        });

        Button Providence_Alaska = findViewById(R.id.Providence_Alaska_FramLayout);
        Providence_Alaska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Providence_Alaska_intent = new Intent(HospitalListActivity.this, ProvidenceActivity.class);
                startActivity(Providence_Alaska_intent);
            }
        });

        Button Alaska_Native_Medical_Center = findViewById(R.id.Alaska_Native_Medical_Center_FramLayout);
        Alaska_Native_Medical_Center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Native_Medical_Center_intent = new Intent(HospitalListActivity.this, Native_Medical_Center.class);
                startActivity(Native_Medical_Center_intent);
            }
        });
    }
}