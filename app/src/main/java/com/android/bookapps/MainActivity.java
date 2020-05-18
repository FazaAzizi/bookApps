package com.android.bookapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

import com.android.bookapps.st1.St1PendahuluanActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Subtema1(View view){
        Intent intent = new Intent(MainActivity.this, SubTema1Activity.class);
        startActivity(intent);
    }

    public void Subtema2(View view){
        Intent intent = new Intent(MainActivity.this, SubTema2Activity.class);
        startActivity(intent);
    }

    public void Subtema3(View view){
        Intent intent = new Intent(MainActivity.this, SubTema3Activity.class);
        startActivity(intent);
    }

    public void pengantar(View view){
        Intent intent = new Intent(MainActivity.this, PengantarActivity.class);
        startActivity(intent);
    }
}
