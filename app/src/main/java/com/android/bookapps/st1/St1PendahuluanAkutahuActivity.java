package com.android.bookapps.st1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.bookapps.R;

public class St1PendahuluanAkutahuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st1_pendahuluan_akutahu);
    }

    public void backah2(View view){
        Intent intent = new Intent(St1PendahuluanAkutahuActivity.this, St1PendahuluanActivity.class);
        startActivity(intent);
    }
}
