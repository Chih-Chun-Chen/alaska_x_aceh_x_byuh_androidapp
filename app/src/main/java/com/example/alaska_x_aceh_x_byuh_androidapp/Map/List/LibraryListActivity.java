package com.example.alaska_x_aceh_x_byuh_androidapp.Map.List;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alaska_x_aceh_x_byuh_androidapp.Map.List.Hospital.ProvidenceActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Map.List.Library.Mounatin_ViewActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Map.List.Library.ZJ_LoussacActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.R;

public class LibraryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_list);

        Button Loussac_Library = findViewById(R.id.Loussac_Library_FramLayout);
        Loussac_Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PLoussac_Library_intent = new Intent(LibraryListActivity.this, ZJ_LoussacActivity.class);
                startActivity(PLoussac_Library_intent);
            }
        });

        Button MT_View_Library = findViewById(R.id.MT_View_Library_FramLayout);
        MT_View_Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MT_View_Library_intent = new Intent(LibraryListActivity.this, Mounatin_ViewActivity.class);
                startActivity(MT_View_Library_intent);
            }
        });
    }
}