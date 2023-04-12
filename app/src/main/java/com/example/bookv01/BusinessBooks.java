package com.example.bookv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusinessBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_books);
        Button BusinessBook01 =(Button)findViewById(R.id.BusinessBook01);
        Button BusinessBook02 =(Button)findViewById(R.id.BusinessBook02);
        Button BusinessBook03 =(Button)findViewById(R.id.BusinessBook03);
        Button BusinessBook04 =(Button)findViewById(R.id.BusinessBook04);
//        Button BusinessBooksList =(Button)findViewById(R.id.BusinessBooksList);






        findViewById(R.id.Backbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });


        findViewById(R.id.BusinessBook01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BusinessBooks.this,BusinessBook01.class);
                startActivity(i);

            }
        });
        findViewById(R.id.BusinessBook02).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BusinessBooks.this,BusinessBook02.class);
                startActivity(i);

            }
        });
        findViewById(R.id.BusinessBook03).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BusinessBooks.this,BusinessBook03.class);
                startActivity(i);

            }
        });

        findViewById(R.id.BusinessBook04).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BusinessBooks.this,BusinessBook04.class);
                startActivity(i);

            }
        });
//        findViewById(R.id.BusinessBooksList).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(BusinessBooks.this,listBusinessBooks.class);
//                startActivity(i);
//
//            }
//        });

}}