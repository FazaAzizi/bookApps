package com.android.bookapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.android.bookapps.st1.St1AplikasiActivity;
import com.android.bookapps.st1.St1PemantapanActivity;
import com.android.bookapps.st1.St1PendahuluanActivity;
import com.android.bookapps.st1.St1PengembanganActivity;
import com.android.bookapps.st1.St1PenilaianActivity;
import com.android.bookapps.st1.St1RangkumanActivity;

public class SubTema1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_tema1);
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



    public void st1pendahuluanmtd(View view){
        Intent intent = new Intent(SubTema1Activity.this, St1PendahuluanActivity.class);
        startActivity(intent);
    }
    public void st1rangkumanmtd(View view){
        Intent intent = new Intent(SubTema1Activity.this, St1RangkumanActivity.class);
        startActivity(intent);
    }
    public void st1pengembanganmtd(View view){
        Intent intent = new Intent(SubTema1Activity.this, St1PengembanganActivity.class);
        startActivity(intent);
    }
    public void st1aplikasimtd(View view){
        Intent intent = new Intent(SubTema1Activity.this, St1AplikasiActivity.class);
        startActivity(intent);
    }
    public void st1pemantapanmtd(View view){
        Intent intent = new Intent(SubTema1Activity.this, St1PemantapanActivity.class);
        startActivity(intent);
    }
    public void st1penilaianmtd(View view){
        Intent intent = new Intent(SubTema1Activity.this, St1PenilaianActivity.class);
        startActivity(intent);
    }





}
