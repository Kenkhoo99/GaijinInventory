package com.example.gaijininventory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class deleteStaff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_staff);
        this.setTitle("Delete Staff");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}