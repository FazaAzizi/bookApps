package com.android.bookapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.bookapps.st1.St1PendahuluanActivity;

public class SubTema1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_tema1);
    }

    public void st1pendahuluanmtd(View view){
        Intent intent = new Intent(SubTema1Activity.this, St1PendahuluanActivity.class);
        startActivity(intent);
    }
}
