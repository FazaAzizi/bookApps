package com.android.bookapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    AdapterStigma1 adapter;
    List<modelstigma1> models;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        models = new ArrayList<>();
        models.add(new modelstigma1("Gempa Mengepung Yogyakarta"));
        models.add(new modelstigma1("Apa Itu Gempa Bumi"));
        models.add(new modelstigma1("Penyebab Lempeng Bumi Bergerak"));
        models.add(new modelstigma1("Tokoh Sains"));
        models.add(new modelstigma1("Rangkuman"));

        adapter = new AdapterStigma1(models, this);

        viewPager = findViewById(R.id.viewPager1);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
