package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminPage extends AppCompatActivity implements View.OnClickListener{

    private Button btnAddStock;
    private Button btnAddStaff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_page);
        getSupportActionBar().hide();

        btnAddStaff = (Button) findViewById(R.id.bAddStaff);
        btnAddStock = (Button) findViewById(R.id.bAddStock);

        btnAddStock.setOnClickListener(this);
        btnAddStaff.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btnAddStaff){
            Intent i = new Intent( AdminPage.this, AddStaff.class);
            startActivity(i);

        } else if(view == btnAddStock){
            Intent i = new Intent( AdminPage.this, Stock.class);
            startActivity(i);
        }
    }
}