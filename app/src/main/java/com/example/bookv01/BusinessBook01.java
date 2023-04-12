package com.example.bookv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BusinessBook01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_book01);
        ImageView img=(ImageView) findViewById(R.id.link);
        ImageView i2=findViewById(R.id.imageView1);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://fourminutebooks.com/rework-summary/");
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://firebasestorage.googleapis.com/v0/b/books-app-b972a.appspot.com/o/Rework.pdf?alt=media&token=eb1a916d-85b7-494a-91a5-10be9cc97dbf");
            }
        });
    }
    private void gotourl(String url){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}