package com.example.gaijininventory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class addStaff extends AppCompatActivity {

    private Spinner spnDpt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_staff);
        this.setTitle("Add Staff");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spnDpt = (Spinner) findViewById(R.id.spin_department);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.staff_dpt, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnDpt.setAdapter(adapter);

    }

//    public void addListenerOnSpinnerItemSelection() {
//        spnDpt = (Spinner) findViewById(R.id.spin_department);
//        spnDpt.setOnItemSelectedListener(new CustomOnItemSelectedListener());
//    }
//
//    public void addListenerOnButton() {
//
//        spnDpt = (Spinner) findViewById(R.id.spin_department);
//
//
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(addStaff.this,
//                        "OnClickListener : " +
//                                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()) +
//                        Toast.LENGTH_SHORT).show();
//            }
//
//        });
//    }
}