package com.example.kuis1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void backToMain(View view) {
        Intent a = new Intent(Biodata.this, MainActivity.class);
        startActivity(a);
    }

    public void exit(View view) {
        logout(this);
    }

    public static void logout(Activity activity){
        AlertDialog.Builder builder= new AlertDialog.Builder(activity);
        builder.setTitle("Keluar");
        builder.setMessage("Yakin keluar?");

        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.finishAffinity();
                System.exit(0);
            }
        });

        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

}