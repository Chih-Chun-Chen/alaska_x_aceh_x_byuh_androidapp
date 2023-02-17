package com.example.alaska_x_aceh_x_byuh_androidapp.Home;

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

import com.example.alaska_x_aceh_x_byuh_androidapp.R;

public class Two_One_OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_one_one);


        Button callbutton = (Button)findViewById(R.id.button_call_now);
        callbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(Two_One_OneActivity.this);
                alert.setTitle("Calling");
                alert.setMessage("Do you want to call 211?");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        //Yesボタンが押された時の処理
                        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:211"));
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
                        //Noボタンが押された時の処理
                        return;
                    }});
                alert.show();
            }
        });
    }
}