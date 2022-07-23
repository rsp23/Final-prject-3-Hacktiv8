package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnRegister;
    private Button btnLogin;
    private Button btnAbout;
    private Button btnAdmin;
    private Button btnStaff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        btnAbout = (Button)findViewById(R.id.bAbout);
        btnAdmin = (Button)findViewById(R.id.bAdminLogin);
        btnLogin = (Button)findViewById(R.id.bLoginUser);
        btnRegister = (Button)findViewById(R.id.bRegister);
        btnStaff = (Button)findViewById(R.id.bStaffLogin);

        btnAbout.setOnClickListener(this);
        btnStaff.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        btnAdmin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btnLogin){
            Intent i = new Intent( HomeActivity.this, LoginUser.class);
            startActivity(i);

        } else if (v == btnRegister){
            Intent i = new Intent( HomeActivity.this, UserRegister.class);
            startActivity(i);

        }else if (v == btnAbout){
            Intent i = new Intent( HomeActivity.this, About.class);
            startActivity(i);

        }else if (v == btnStaff){
            Intent i = new Intent( HomeActivity.this, StaffLogin.class);
            startActivity(i);

        }else if (v == btnAdmin){
            Intent i = new Intent( HomeActivity.this, AdminLogin.class);
            startActivity(i);

        }

    }
}