package com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alaska_x_aceh_x_byuh_androidapp.Home.MainActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Home.Two_One_OneActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.R;

public class ShelterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter);

        Button button_shelter1 = findViewById(R.id.ShelterButton1);
        button_shelter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ShelterActivity.this, Shelter1Activity.class);
                startActivity(intent);
            }
        });
    }
}