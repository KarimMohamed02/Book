package com.example.bookv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArtBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_books);

        //buttons
        Button ArtBook01 =(Button)findViewById(R.id.ArtBook01);
        Button ArtBook02 =(Button)findViewById(R.id.ArtBook02);
        Button ArtBook03 =(Button)findViewById(R.id.ArtBook03);
        Button ArtBook04 =(Button)findViewById(R.id.ArtBook04);



//        Button ArtBooksList =(Button)findViewById(R.id.ArtBooksList);

        findViewById(R.id.Backbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

//Button of ArtBook01
        ArtBook01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ArtBooks.this,ArtBook01.class);
                startActivity(i1);

            }
        });


        //Button of ArtBook02

        findViewById(R.id.ArtBook02).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(ArtBooks.this,ArtBook02.class);
                startActivity(i2);

            }
        });
        findViewById(R.id.ArtBook03).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(ArtBooks.this,ArtBook03.class);
                startActivity(i3);

            }
        });

        findViewById(R.id.ArtBook04).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(ArtBooks.this,ArtBook04.class);
                startActivity(i4);

            }
        });


//        findViewById(R.id.ArtBooksList).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i5 = new Intent(ArtBooks.this,listImages.class);
//                startActivity(i5);
//
//            }
//        });


    }
}