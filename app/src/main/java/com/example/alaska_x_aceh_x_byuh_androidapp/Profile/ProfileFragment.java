package com.example.alaska_x_aceh_x_byuh_androidapp.Profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alaska_x_aceh_x_byuh_androidapp.R;
import com.example.alaska_x_aceh_x_byuh_androidapp.databinding.ActivityMainBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    ActivityMainBinding binding;
    String name, phoneNumber, birth, location;
    FirebaseDatabase db;
    DatabaseReference reference;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SettingsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        binding = ActivityMainBinding.inflate(getLayoutInflater());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        EditText nameEditText = view.findViewById(R.id.editTextTextPersonName);
        EditText phoneEditText = view.findViewById(R.id.editTextPhone);
        EditText birthEditText = view.findViewById(R.id.editTextDate);
        EditText locationEditText = view.findViewById(R.id.editLocation);

        view.findViewById(R.id.save_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the user information from the EditText fields
                name = nameEditText.getText().toString();
                phoneNumber = phoneEditText.getText().toString();
                birth = birthEditText.getText().toString();
                location = locationEditText.getText().toString();

                // Upload the user information to Firebase
                db = FirebaseDatabase.getInstance();
                reference = db.getReference("users");
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String userId = user.getUid();
                    reference.child(userId).child("name").setValue(name);
                    reference.child(userId).child("phone").setValue(phoneNumber);
                    reference.child(userId).child("birth").setValue(birth);
                    reference.child(userId).child("location").setValue(location);

                    // Show a toast message to indicate that the upload is complete
                    Toast.makeText(getActivity(), "User information uploaded successfully!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}