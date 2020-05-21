package com.android.bookapps.st2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.bookapps.R;

public class St2ResultActivity extends AppCompatActivity {


    TextView st2nilaii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st2_result);

        st2nilaii = findViewById(R.id.st2nilai);
        int total = getIntent().getExtras().getInt("nilai");
        st2nilaii.setText(String.valueOf(total));
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
}
