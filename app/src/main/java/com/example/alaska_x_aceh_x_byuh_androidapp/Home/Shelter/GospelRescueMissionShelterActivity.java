package com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alaska_x_aceh_x_byuh_androidapp.R;

public class GospelRescueMissionShelterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gospel_rescue_mission_shelter);

        Button Gospel_Rescue_Mission_Button = findViewById(R.id.Gospel_Rescue_Mission_Button);
        Gospel_Rescue_Mission_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent with the ACTION_VIEW action
                Intent intent = new Intent(Intent.ACTION_VIEW);
                // Set the data of the intent to the URL of the website you want to open
                intent.setData(Uri.parse("https://grmtucson.com/"));
                // Launch the web browser
                startActivity(intent);
            }
        });
    }
}