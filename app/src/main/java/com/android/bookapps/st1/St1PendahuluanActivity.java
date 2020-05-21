package com.android.bookapps.st1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.bookapps.MainActivity;
import com.android.bookapps.R;
import com.android.bookapps.SubTema1Activity;

public class St1PendahuluanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st1_pendahuluan);

    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

    public void nextah1(View view){
        Intent intent = new Intent(St1PendahuluanActivity.this, St1PendahuluanAkutahuActivity.class);
        startActivity(intent);
    }
}
