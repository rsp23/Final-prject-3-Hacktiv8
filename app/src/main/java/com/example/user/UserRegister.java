package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UserRegister extends AppCompatActivity implements View.OnClickListener{
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_user);
        getSupportActionBar().hide();

        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent( UserRegister.this, HomeActivity.class);
        startActivity(i);
        Toast.makeText(getApplicationContext(), "Berhasil Registrasi",Toast.LENGTH_SHORT).show();
    }
}