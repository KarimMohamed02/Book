package com.example.bookv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hackers extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hackers);
        Button Hacker1Button =(Button)findViewById(R.id.Hacker1);
        Button Hacker2Button =(Button)findViewById(R.id.Hacker2);
        Button Hacker3Button =(Button)findViewById(R.id.Hacker3);
        Button Hacker4Button =(Button)findViewById(R.id.Hacker4);
        Button Hacker5Button =(Button)findViewById(R.id.Hacker5);
        Button Hacker6Button =(Button)findViewById(R.id.Hacker6);
        Button Hacker7Button =(Button)findViewById(R.id.Hacker7);
        Button Hacker8Button =(Button)findViewById(R.id.Hacker8);




        findViewById(R.id.Backbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });


        findViewById(R.id.Hacker1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hacker1Button.setText("Samer Adel");


            }
        });
        findViewById(R.id.Hacker2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hacker2Button.setText("Shrouq Muhammed");


            }
        });
        findViewById(R.id.Hacker3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hacker3Button.setText("Karim Mohammed");


            }
        });

        findViewById(R.id.Hacker4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hacker4Button.setText("Salma Morsi");


            }
        });

        findViewById(R.id.Hacker5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hacker5Button.setText("Mohammed Mokbel");


            }
        });

        findViewById(R.id.Hacker6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hacker6Button.setText("Rewan Abdou");


            }
        });
        findViewById(R.id.Hacker7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hacker7Button.setText("Ahmed Alaa");


            }
        });
        findViewById(R.id.Hacker8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hacker8Button.setText("Ahmed Hammad");


            }
        });

    }
}