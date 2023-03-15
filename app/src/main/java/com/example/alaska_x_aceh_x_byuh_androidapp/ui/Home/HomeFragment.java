package com.example.alaska_x_aceh_x_byuh_androidapp.ui.Home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.alaska_x_aceh_x_byuh_androidapp.Home.CoordinatedEntryActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Home.ShelterActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Home.Two_One_OneActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.R;
import com.example.alaska_x_aceh_x_byuh_androidapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button button_free_food = (Button) root.findViewById(R.id.Button_Free_Food);
        if (button_free_food != null) {
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
        }

        Button button_211 = (Button) root.findViewById(R.id.Button_211);
        if (button_211 != null) {
            button_211.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getActivity(), Two_One_OneActivity.class);
                    startActivity(intent);
                }
            });
        }

        Button button_entry = (Button) root.findViewById(R.id.Button_Entry);
        if (button_entry != null) {
            button_entry.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getActivity(), CoordinatedEntryActivity.class);
                    startActivity(intent);
                }
            });
        }

        Button button_shelter = (Button) root.findViewById(R.id.button_shelter);
        if (button_shelter != null) {
            button_shelter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getActivity(), ShelterActivity.class);
                    startActivity(intent);
                }
            });
        }
        return root;
    }
}