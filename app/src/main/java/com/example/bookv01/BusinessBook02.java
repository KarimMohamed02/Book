package com.example.bookv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BusinessBook02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_book02);
        ImageView img=(ImageView) findViewById(R.id.link);
        ImageView i2=findViewById(R.id.imageView1);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("http://www.talentsquare.info/blog/book-summary-the-five-dysfunctions-of-a-team/");
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://firebasestorage.googleapis.com/v0/b/books-app-b972a.appspot.com/o/The%20Five%20dysfunctions%20of%20a%20team.pdf?alt=media&token=d0f50c56-a6da-4514-9f16-c3e5c22a70bb");
            }
        });
    }

    private void gotourl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}