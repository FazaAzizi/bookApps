package com.android.bookapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.android.bookapps.st1.St1PendahuluanActivity;
import com.android.bookapps.st2.St2AplikasiActivity;
import com.android.bookapps.st2.St2PemantapanActivity;
import com.android.bookapps.st2.St2PendahuluanActivity;
import com.android.bookapps.st2.St2PengembanganActivity;
import com.android.bookapps.st2.St2PenilaianActivity;
import com.android.bookapps.st2.St2RangkumanActivity;

public class SubTema2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_tema2);
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

    public void st2pendahuluanmtd(View view){
        Intent intent = new Intent(SubTema2Activity.this, St2PendahuluanActivity.class);
        startActivity(intent);
    }

    public void st2pengembanganmtd(View view){
        Intent intent = new Intent(SubTema2Activity.this, St2PengembanganActivity.class);
        startActivity(intent);
    }

    public void st2aplikasimtd(View view){
        Intent intent = new Intent(SubTema2Activity.this, St2AplikasiActivity.class);
        startActivity(intent);
    }

    public void st2pemantapanmtd(View view){
        Intent intent = new Intent(SubTema2Activity.this, St2PemantapanActivity.class);
        startActivity(intent);
    }

    public void st2rangkumanmtd(View view){
        Intent intent = new Intent(SubTema2Activity.this, St2RangkumanActivity.class);
        startActivity(intent);
    }

    public void st2penilaianmtd(View view){
        Intent intent = new Intent(SubTema2Activity.this, St2PenilaianActivity.class);
        startActivity(intent);
    }





}
