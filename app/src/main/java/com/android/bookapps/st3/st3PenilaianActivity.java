package com.android.bookapps.st3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.android.bookapps.R;
import com.android.bookapps.st1.St1PenilaianActivity;
import com.android.bookapps.st1.St1ResultActivity;

public class st3PenilaianActivity extends AppCompatActivity {

    RadioGroup st3rgp1,st3rgp2,st3rgp3,st3rgp4,st3rgp5,st3rgp6,st3rgp7,st3rgp8,st3rgp9,st3rgp10;
    private Button st3sbmt;
    private RadioButton st3vl1,st3vl2,st3vl3,st3vl4,st3vl5,st3vl6,st3vl7,st3vl8,st3vl9,st3vl10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st3_penilaian);
        st3rgp1 = findViewById(R.id.st3rg1);
        st3rgp2 = findViewById(R.id.st3rg2);
        st3rgp3 = findViewById(R.id.st3rg3);
        st3rgp4 = findViewById(R.id.st3rg4);
        st3rgp5 = findViewById(R.id.st3rg5);
        st3rgp6 = findViewById(R.id.st3rg6);
        st3rgp7 = findViewById(R.id.st3rg7);
        st3rgp8 = findViewById(R.id.st3rg8);
        st3rgp9 = findViewById(R.id.st3rg9);
        st3rgp10 = findViewById(R.id.st3rg10);

        st3sbmt = findViewById(R.id.st3btnsbmit);
        st3sbmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int st3point1 = st3rgp1.getCheckedRadioButtonId();
                st3vl1 = (RadioButton) findViewById(st3point1);

                int st3point2 = st3rgp2.getCheckedRadioButtonId();
                st3vl2 = (RadioButton) findViewById(st3point2);

                int st3point3 = st3rgp3.getCheckedRadioButtonId();
                st3vl3 = (RadioButton) findViewById(st3point3);

                int st3point4 = st3rgp4.getCheckedRadioButtonId();
                st3vl4 = (RadioButton) findViewById(st3point4);

                int st3point5 = st3rgp5.getCheckedRadioButtonId();
                st3vl5 = (RadioButton) findViewById(st3point5);

                int st3point6 = st3rgp6.getCheckedRadioButtonId();
                st3vl6 = (RadioButton) findViewById(st3point6);

                int st3point7 = st3rgp7.getCheckedRadioButtonId();
                st3vl7 = (RadioButton) findViewById(st3point7);

                int st3point8 = st3rgp8.getCheckedRadioButtonId();
                st3vl8 = (RadioButton) findViewById(st3point8);

                int st3point9 = st3rgp9.getCheckedRadioButtonId();
                st3vl9 = (RadioButton) findViewById(st3point9);

                int st3point10 = st3rgp10.getCheckedRadioButtonId();
                st3vl10 = (RadioButton) findViewById(st3point10);

                int total = 0;

                if((st3point1 <= 0)||(st3point2 <= 0)||(st3point3 <= 0)||(st3point4 <= 0)||(st3point5 <= 0)||(st3point6 <= 0)||(st3point7 <= 0)||(st3point8 <= 0)||(st3point9 <= 0)||(st3point10 <= 0)){
                    Toast.makeText(st3PenilaianActivity.this,"Harus diisi semua",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (st3vl1.getText().toString().toLowerCase().equals("upaya untuk menumbuhkan kesadaran masyarakat mengenai pentingnya upaya pengurangan resiko bencana")) {
                        total = total + 10;
                    }
                    if (st3vl2.getText().toString().toLowerCase().equals("kerugian investasi perbakan")){
                        total = total + 10;
                    }
                    if (st3vl3.getText().toString().toLowerCase().equals("masyarakat telah memiliki kemampuan evakuasi setelah terjadi gempa bumi")){
                        total = total + 10;
                    }
                    if (st3vl4.getText().toString().toLowerCase().equals("jika berada di dalam kendaraan, segera berhenti")){
                        total = total + 10;
                    }
                    if (st3vl5.getText().toString().toLowerCase().equals("(1) dan (3)")){
                        total = total + 10;
                    }
                    if (st3vl6.getText().toString().toLowerCase().equals("(2) dan (4)")){
                        total = total + 10;
                    }
                    if (st3vl7.getText().toString().toLowerCase().equals("dinas pertanian dan peringatan")){
                        total = total + 10;
                    }
                    if (st3vl8.getText().toString().toLowerCase().equals("tanda peringatan harus menuju titik evakuasi dan penyebaran informasi bahwa akan terjadi bencana")){
                        total = total + 10;
                    }
                    if (st3vl9.getText().toString().toLowerCase().equals("4")){
                        total = total + 10;
                    }
                    if (st3vl10.getText().toString().toLowerCase().equals("memudahkan pemindahan sumber daya jika terjadi bencana")){
                        total = total + 10;
                    }


                    Intent i = new Intent(st3PenilaianActivity.this, st3ResultActivity.class);
                    i.putExtra("nilai",total);
                    startActivity(i);

                    finish();
                }
            }
        });
    }
}
