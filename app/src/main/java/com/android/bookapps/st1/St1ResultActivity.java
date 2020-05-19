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
        int total = getIntent().getExtras().getInt("nilai");
        float nilai = 0;
        nilai = ((total*2)/3)*10;
        st1nilaii.setText(String.valueOf(nilai));
    }
}
