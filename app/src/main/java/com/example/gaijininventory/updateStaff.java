package com.example.gaijininventory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class updateStaff extends AppCompatActivity {
    private Spinner spnDpt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_staff);
        this.setTitle("Update Staff");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spnDpt1 = (Spinner) findViewById(R.id.update_spin_department);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.staff_dpt, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnDpt1.setAdapter(adapter);
    }
}