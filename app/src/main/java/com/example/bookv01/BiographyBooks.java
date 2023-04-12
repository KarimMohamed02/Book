package com.example.bookv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BiographyBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biography_books);
        Button BiographyBook01 =(Button)findViewById(R.id.BiographyBook01);
        Button BiographyBook02 =(Button)findViewById(R.id.BiographyBook02);
        Button BiographyBook03 =(Button)findViewById(R.id.BiographyBook03);
        Button BiographyBook04 =(Button)findViewById(R.id.BiographyBook04);
//        Button BiographyBooksList =(Button)findViewById(R.id.BiographyBooksList);






        findViewById(R.id.Backbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });


        findViewById(R.id.BiographyBook01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BiographyBooks.this,BiographyBook01.class);
                startActivity(i);

            }
        });
        findViewById(R.id.BiographyBook02).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BiographyBooks.this,BiographyBook02.class);
                startActivity(i);

            }
        });
        findViewById(R.id.BiographyBook03).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BiographyBooks.this,BiographyBook03.class);
                startActivity(i);

            }
        });

        findViewById(R.id.BiographyBook04).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BiographyBooks.this,BiographyBook04.class);
                startActivity(i);

            }
        });

//        findViewById(R.id.BiographyBooksList).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(BiographyBooks.this,BiographyBooks.class);
//                startActivity(i);
//
//            }
//        });

    }
}