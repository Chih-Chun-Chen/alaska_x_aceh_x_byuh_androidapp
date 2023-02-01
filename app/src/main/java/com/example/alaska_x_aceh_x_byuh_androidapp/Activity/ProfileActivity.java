package com.example.alaska_x_aceh_x_byuh_androidapp.Activity;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alaska_x_aceh_x_byuh_androidapp.R;
import com.example.alaska_x_aceh_x_byuh_androidapp.ui.profile.ProfileFragment;

public class ProfileActivity extends AppCompatActivity {
    EditText nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameText = (EditText) findViewById(R.id.editTextTextPersonName) ;

        ProfileFragment fragment = new ProfileFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.Profile, fragment)
                .commit();
    }
}
