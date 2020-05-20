package com.android.bookapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class VideoActivity extends AppCompatActivity {


    ImageView imgg1,imgg2,imgg3,imgg4,imgg5 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        imgg1 = (ImageView)findViewById(R.id.img1);
        imgg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://youtu.be/lvdwRqB-HHo"));
                startActivity(intent);
            }
        });

        imgg2 = (ImageView)findViewById(R.id.img2);
        imgg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://youtu.be/9_bXQfDBrf4"));
                startActivity(intent);
            }
        });

        imgg3 = (ImageView)findViewById(R.id.img3);
        imgg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://youtu.be/OdZtbOmKTT4"));
                startActivity(intent);
            }
        });

        imgg4 = (ImageView)findViewById(R.id.img4);
        imgg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://youtu.be/aT14csMNGkY"));
                startActivity(intent);
            }
        });

        imgg5 = (ImageView)findViewById(R.id.img5);
        imgg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://youtu.be/eFpaEMpJZ-U"));
                startActivity(intent);
            }
        });
    }
}
