package com.example.alaska_x_aceh_x_byuh_androidapp.Profile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alaska_x_aceh_x_byuh_androidapp.R;
import com.example.alaska_x_aceh_x_byuh_androidapp.Profile.ProfileFragment;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ProfileFragment fragment = new ProfileFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.Profile, fragment)
                .commit();






        /**********************************************************************************************************************************************************/
       /* final EditText nameText = (EditText) findViewById(R.id.editTextTextPersonName);
        final EditText phoneText = (EditText) findViewById(R.id.editTextPhone);
        final EditText birthText = (EditText) findViewById(R.id.editTextDate);
        final EditText locationText = (EditText) findViewById(R.id.editLocation);
        Button btn = findViewById(R.id.button);
        DAOPerson dao = new DAOPerson();
        btn.setOnClickListener(v -> {
            System.out.println("True");
            Person p = new Person(nameText.getText().toString(), phoneText.getText().toString(), birthText.getText().toString(), locationText.getText().toString());
            dao.add(p).addOnSuccessListener(suc -> {
                Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er -> {
                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
            });
        });*/
        /**********************************************************************************************************************************************************/
    }
}
