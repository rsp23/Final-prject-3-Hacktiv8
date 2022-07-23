package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Stock extends AppCompatActivity implements View.OnClickListener{

    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stock_add);
        getSupportActionBar().hide();

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent( Stock.this, AdminPage.class);
        startActivity(i);
        Toast.makeText(getApplicationContext(), "Berhasil Manambahkan Item",Toast.LENGTH_SHORT).show();
    }
}