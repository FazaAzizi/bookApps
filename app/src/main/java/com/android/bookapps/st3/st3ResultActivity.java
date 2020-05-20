package com.android.bookapps.st3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.bookapps.R;

public class st3ResultActivity extends AppCompatActivity {


    TextView st3nilaii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st3_result);

        st3nilaii = findViewById(R.id.st3nilai);
        int total = getIntent().getExtras().getInt("nilai");
        st3nilaii.setText(String.valueOf(total));
    }
}
