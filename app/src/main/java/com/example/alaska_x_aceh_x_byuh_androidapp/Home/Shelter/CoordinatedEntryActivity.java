package com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alaska_x_aceh_x_byuh_androidapp.Home.Two_One_OneActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.R;

public class CoordinatedEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinated_entry);

        Button entryCallButton = (Button)findViewById(R.id.button_entry_call_now);
        entryCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(CoordinatedEntryActivity.this);
                alert.setTitle("Calling");
                alert.setMessage("Do you want to call Coordinated Entry?");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(907) 312-9530"));
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        try{
                            startActivity(i);
                        }catch(SecurityException e){
                            Context context = getApplicationContext();
                            Toast.makeText(context, "You don't have permission to call.", Toast.LENGTH_SHORT).show();
                        }
                    }});
                alert.setNegativeButton("No", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }});
                alert.show();
            }
        });
    }
}