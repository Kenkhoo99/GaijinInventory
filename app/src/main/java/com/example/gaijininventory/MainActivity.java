package com.example.gaijininventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        EditText et = (EditText) findViewById(R.id.username);
        EditText et1 = (EditText) findViewById(R.id.editTextTextPassword);
        et.setHintTextColor(Color.WHITE);
        et1.setHintTextColor(Color.WHITE);

        button = findViewById(R.id.Login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStaffManagementMainMenu();
            }
        });
    }

    public void openStaffManagementMainMenu(){
        Intent intent = new Intent(this,StaffManagementMainMenu.class);
        startActivity(intent);
    }
}