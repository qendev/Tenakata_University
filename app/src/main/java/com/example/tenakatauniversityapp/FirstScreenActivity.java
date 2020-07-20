package com.example.tenakatauniversityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstScreenActivity extends AppCompatActivity {
    private Button loginbutton;

    private TextView signUptextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);


        //initialise the necesarry Views by their specific ids.
        loginbutton = findViewById(R.id.button_login);
        signUptextView = findViewById(R.id.textView_signup);



        //opening SignUp Activity
        signUptextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupintent = new Intent(FirstScreenActivity.this,SignUpActivity.class);
                startActivity(signupintent);
            }
        });





        //opening the Login Activity using an intent via a click event on login button
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginintent = new Intent(FirstScreenActivity.this,LoginActivity.class);
                startActivity(loginintent);
            }
        });




    }
}