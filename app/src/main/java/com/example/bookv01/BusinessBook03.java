package com.example.bookv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BusinessBook03 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_book03);
        ImageView img=(ImageView) findViewById(R.id.link);
        ImageView i2=findViewById(R.id.imageView1);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://fourminutebooks.com/thinking-fast-and-slow-summary/");
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://firebasestorage.googleapis.com/v0/b/books-app-b972a.appspot.com/o/Thinking%2C%20Fast%20and%20Slow.pdf?alt=media&token=7bcac902-52a3-4ff4-9a18-c99577ac4d42");
            }
        });

    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}