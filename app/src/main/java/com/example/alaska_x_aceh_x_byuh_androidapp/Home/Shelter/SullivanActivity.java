package com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alaska_x_aceh_x_byuh_androidapp.R;

public class SullivanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sullivan);

        Button Sullivan_Button = findViewById(R.id.Link_Button_Sullivan);
        Sullivan_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent with the ACTION_VIEW action
                Intent intent = new Intent(Intent.ACTION_VIEW);
                // Set the data of the intent to the URL of the website you want to open
                intent.setData(Uri.parse("https://www.adn.com/alaska-news/anchorage/2022/12/18/anchorages-sullivan-arena-shelter-is-full-amid-plunging-temperatures-homeless-seek-refuge-in-a-crowded-warming-area/"));
                // Launch the web browser
                startActivity(intent);
            }
        });
    }
}