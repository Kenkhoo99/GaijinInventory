package com.example.gaijininventory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class viewStaff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_staff);
        this.setTitle("Staff List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}