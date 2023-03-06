package com.example.alaska_x_aceh_x_byuh_androidapp.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter.AvitorActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter.AwaicActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter.MACKhouseActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter.SullivanArenaWarmingAreaActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.R;

public class ShelterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter);

        Button button_sullivan_area_warming_area = findViewById(R.id.Sullivan_Arena_Button);
        button_sullivan_area_warming_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sullivan_area_warming_area = new Intent(ShelterActivity.this, SullivanArenaWarmingAreaActivity.class);
                startActivity(sullivan_area_warming_area);
            }
        });

        Button button_ch_mack_house = findViewById(R.id.CH_MACK_House_Button);
        button_ch_mack_house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ch_mack_house = new Intent(ShelterActivity.this, MACKhouseActivity.class);
                startActivity(ch_mack_house);
            }
        });

        Button button_avitor = findViewById(R.id.AVITOR_Button);
        button_avitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent avitor = new Intent(ShelterActivity.this, AvitorActivity.class);
                startActivity(avitor);

            }
        });

        Button button_awaic = findViewById(R.id.AWAIC_Button);
        button_awaic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent awaic = new Intent(ShelterActivity.this, AwaicActivity.class);
                startActivity(awaic);
            }
        });
    }
}