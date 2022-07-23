package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddStaff extends AppCompatActivity implements View.OnClickListener{

    private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_staff);
        getSupportActionBar().hide();

        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent i = new Intent( AddStaff.this, AdminPage.class);
        startActivity(i);
        Toast.makeText(getApplicationContext(), "Berhasil Registrasi",Toast.LENGTH_SHORT).show();
    }
}