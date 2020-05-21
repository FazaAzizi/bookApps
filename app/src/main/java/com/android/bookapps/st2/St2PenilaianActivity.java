package com.android.bookapps.st2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.bookapps.R;
import com.android.bookapps.st1.St1PenilaianActivity;
import com.android.bookapps.st1.St1ResultActivity;

public class St2PenilaianActivity extends AppCompatActivity {

    RadioGroup st2rgp1,st2rgp2,st2rgp3,st2rgp4,st2rgp5;
    private Button st2sbmt;
    private RadioButton st2vl1,st2vl2,st2vl3,st2vl4,st2vl5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st2_penilaian);

        st2rgp1 = findViewById(R.id.st2rg1);
        st2rgp2 = findViewById(R.id.st2rg2);
        st2rgp3 = findViewById(R.id.st2rg3);
        st2rgp4 = findViewById(R.id.st2rg4);
        st2rgp5 = findViewById(R.id.st2rg5);

        st2sbmt = findViewById(R.id.st2btnsbmit);
        st2sbmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int st2point1 = st2rgp1.getCheckedRadioButtonId();
                st2vl1 = (RadioButton) findViewById(st2point1);

                int st2point2 = st2rgp2.getCheckedRadioButtonId();
                st2vl2 = (RadioButton) findViewById(st2point2);

                int st2point3 = st2rgp3.getCheckedRadioButtonId();
                st2vl3 = (RadioButton) findViewById(st2point3);

                int st2point4 = st2rgp4.getCheckedRadioButtonId();
                st2vl4 = (RadioButton) findViewById(st2point4);

                int st2point5 = st2rgp5.getCheckedRadioButtonId();
                st2vl5 = (RadioButton) findViewById(st2point5);


                int total = 0;


                if((st2point1 <= 0)||(st2point2 <= 0)||(st2point3 <= 0)||(st2point4 <= 0)||(st2point5 <= 0)){
                Toast.makeText(St2PenilaianActivity.this,"Harus diisi semua",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (st2vl1.getText().toString().toLowerCase().equals("(2) dan (b)")) {
                        total = total + 20;
                    }
                    if (st2vl2.getText().toString().toLowerCase().equals("seismograf")){
                        total = total + 20;
                    }
                    if (st2vl3.getText().toString().toLowerCase().equals("memiliki cepat rambat gelombang yang tinggi")){
                        total = total + 20;
                    }
                    if (st2vl4.getText().toString().toLowerCase().equals("(1) dan (3)")){
                        total = total + 20;
                    }
                    if (st2vl5.getText().toString().toLowerCase().equals("(2) dan (3)")){
                        total = total + 20;
                    }
                    Intent i = new Intent(St2PenilaianActivity.this, St2ResultActivity.class);
                    i.putExtra("nilai",total);
                    startActivity(i);

                    finish();
                }






            }
        });
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
