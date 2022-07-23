package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity implements View.OnClickListener{

    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_admin);
        getSupportActionBar().hide();

        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent( AdminLogin.this, AdminPage.class);
        startActivity(i);
        Toast.makeText(getApplicationContext(), "Berhasil Login",Toast.LENGTH_SHORT).show();
    }
}