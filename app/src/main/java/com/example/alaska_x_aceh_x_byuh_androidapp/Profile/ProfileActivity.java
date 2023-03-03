package com.example.alaska_x_aceh_x_byuh_androidapp.Profile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alaska_x_aceh_x_byuh_androidapp.R;
import com.example.alaska_x_aceh_x_byuh_androidapp.Profile.ProfileFragment;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_profile);
        ProfileFragment fragment = new ProfileFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.Profile, fragment)
                .commit();
    }
}
