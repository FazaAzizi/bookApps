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
}
