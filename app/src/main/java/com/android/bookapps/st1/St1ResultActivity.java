package com.android.bookapps.st1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.bookapps.R;

public class St1ResultActivity extends AppCompatActivity {

    TextView st1nilaii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st1_result);

        st1nilaii = findViewById(R.id.st1nilai);
        float total = getIntent().getExtras().getFloat("nilai");

        String n = String.format("%.01f", total);
        st1nilaii.setText(n);
    }
}
