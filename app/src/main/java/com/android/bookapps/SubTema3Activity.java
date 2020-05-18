package com.android.bookapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.android.bookapps.st3.st3AplikasiActivity;
import com.android.bookapps.st3.st3PemantapanActivity;
import com.android.bookapps.st3.st3PendahuluanActivity;
import com.android.bookapps.st3.st3PengembanganActivity;
import com.android.bookapps.st3.st3PenilaianActivity;
import com.android.bookapps.st3.st3RangkumanActivity;

public class SubTema3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_tema3);
    }
    public void st3pendahuluanmtd(View view){
        Intent intent = new Intent(SubTema3Activity.this, st3PendahuluanActivity.class);
        startActivity(intent);
    }

    public void st3pengembanganmtd(View view){
        Intent intent = new Intent(SubTema3Activity.this, st3PengembanganActivity.class);
        startActivity(intent);
    }

    public void st3aplikasimtd(View view){
        Intent intent = new Intent(SubTema3Activity.this, st3AplikasiActivity.class);
        startActivity(intent);
    }

    public void st3pemantapanmtd(View view){
        Intent intent = new Intent(SubTema3Activity.this, st3PemantapanActivity.class);
        startActivity(intent);
    }

    public void st3rangkumanmtd(View view){
        Intent intent = new Intent(SubTema3Activity.this, st3RangkumanActivity.class);
        startActivity(intent);
    }

    public void st3penilaianmtd(View view){
        Intent intent = new Intent(SubTema3Activity.this, st3PenilaianActivity.class);
        startActivity(intent);
    }
}
