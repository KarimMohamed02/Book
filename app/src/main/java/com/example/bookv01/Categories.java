package com.example.bookv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Button ArtButton =(Button)findViewById(R.id.Art);
        Button BusinessButton =(Button)findViewById(R.id.Business);
        Button BiographyButton =(Button)findViewById(R.id.Biography);
        Button AllBooksList =(Button)findViewById(R.id.Biography);






        findViewById(R.id.Backbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });


        findViewById(R.id.Business).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Categories.this,BusinessBooks.class);
                startActivity(i);

            }
        });
        findViewById(R.id.Art).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Categories.this,ArtBooks.class);
                startActivity(i);

            }
        });
        findViewById(R.id.Biography).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Categories.this,BiographyBooks.class);
                startActivity(i);

            }
        });

        findViewById(R.id.AllBooksList).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Categories.this,listImages.class);
                startActivity(i);
            }
        });

    }
}