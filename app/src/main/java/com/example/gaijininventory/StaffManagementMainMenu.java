package com.example.gaijininventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StaffManagementMainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_management_main_menu);
        this.setTitle("Staff Management");

       Button button = findViewById(R.id.add_staff);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openAddStaff();

           }
       });

        Button button1 = findViewById(R.id.update_staff);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUpdateStaff();

            }
        });
    }

    public void openAddStaff(){
        Intent intent = new Intent(this,addStaff.class);
        startActivity(intent);
    }

    public void openUpdateStaff(){
        Intent intent = new Intent(this,updateStaff.class);
        startActivity(intent);
    }
}