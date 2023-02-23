package com.example.alaska_x_aceh_x_byuh_androidapp.Home;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter.CoordinatedEntryActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter.ShelterActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.alaska_x_aceh_x_byuh_androidapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Set the color of the status bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.bottom_nav_icon_color));
        }

        setSupportActionBar(binding.toolbar);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.Home, R.id.Map, R.id.Profile)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        Button button_free_food = findViewById(R.id.Button_Free_Food);
        button_free_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent with the ACTION_VIEW action
                Intent intent = new Intent(Intent.ACTION_VIEW);
                // Set the data of the intent to the URL of the website you want to open
                intent.setData(Uri.parse("https://anchoragefood.org/"));
                // Launch the web browser
                startActivity(intent);
            }
        });

        Button button_211 = findViewById(R.id.Button_211);
        button_211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Two_One_OneActivity.class);
                startActivity(intent);
            }
        });

        Button button_entry = findViewById(R.id.Button_Entry);
        button_entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, CoordinatedEntryActivity.class);
                startActivity(intent);
            }
        });

        Button button_shelter = findViewById(R.id.button_shelter);
        button_shelter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ShelterActivity.class);
                startActivity(intent);
            }
        });
    }
}
