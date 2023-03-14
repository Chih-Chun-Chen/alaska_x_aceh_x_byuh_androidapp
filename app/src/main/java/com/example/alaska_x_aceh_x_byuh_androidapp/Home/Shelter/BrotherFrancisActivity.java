package com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alaska_x_aceh_x_byuh_androidapp.R;

public class BrotherFrancisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brother_francis);

        Button Brother_Francis_Button = findViewById(R.id.Link_Brother_Francis);
        Brother_Francis_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent with the ACTION_VIEW action
                Intent intent = new Intent(Intent.ACTION_VIEW);
                // Set the data of the intent to the URL of the website you want to open
                intent.setData(Uri.parse("https://www.cssalaska.org/our-programs/brother-francis-shelter/"));
                // Launch the web browser
                startActivity(intent);
            }
        });
    }
}