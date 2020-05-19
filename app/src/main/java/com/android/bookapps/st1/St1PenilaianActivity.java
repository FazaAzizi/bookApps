package com.android.bookapps.st1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.android.bookapps.R;

public class St1PenilaianActivity extends AppCompatActivity {

    RadioGroup st1rgp1,st1rgp2,st1rgp3,st1rgp4,st1rgp5,st1rgp6,st1rgp7,st1rgp8,st1rgp9,st1rgp10,st1rgp11,st1rgp12,st1rgp13,st1rgp14,st1rgp15;
    private Button st1sbmt;
    private RadioButton st1vl1,st1vl2,st1vl3,st1vl4,st1vl5,st1vl6,st1vl7,st1vl8,st1vl9,st1vl10,st1vl11,st1vl12,st1vl13,st1vl14,st1vl15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st1_penilaian);

        st1rgp1 = findViewById(R.id.st1rg1);
        st1rgp2 = findViewById(R.id.st1rg2);
        st1rgp3 = findViewById(R.id.st1rg3);
        st1rgp4 = findViewById(R.id.st1rg4);
        st1rgp5 = findViewById(R.id.st1rg5);
        st1rgp6 = findViewById(R.id.st1rg6);
        st1rgp7 = findViewById(R.id.st1rg7);
        st1rgp8 = findViewById(R.id.st1rg8);
        st1rgp9 = findViewById(R.id.st1rg9);
        st1rgp10 = findViewById(R.id.st1rg10);
        st1rgp11 = findViewById(R.id.st1rg11);
        st1rgp12 = findViewById(R.id.st1rg12);
        st1rgp13 = findViewById(R.id.st1rg13);
        st1rgp14 = findViewById(R.id.st1rg14);
        st1rgp15 = findViewById(R.id.st1rg15);

        st1sbmt = findViewById(R.id.st1btnsbmit);
        st1sbmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int st1point1 = st1rgp1.getCheckedRadioButtonId();
                st1vl1 = (RadioButton) findViewById(st1point1);

                int st1point2 = st1rgp2.getCheckedRadioButtonId();
                st1vl2 = (RadioButton) findViewById(st1point2);

                int st1point3 = st1rgp3.getCheckedRadioButtonId();
                st1vl3 = (RadioButton) findViewById(st1point3);

                int st1point4 = st1rgp4.getCheckedRadioButtonId();
                st1vl4 = (RadioButton) findViewById(st1point4);

                int st1point5 = st1rgp5.getCheckedRadioButtonId();
                st1vl5 = (RadioButton) findViewById(st1point5);

                int st1point6 = st1rgp6.getCheckedRadioButtonId();
                st1vl6 = (RadioButton) findViewById(st1point6);

                int st1point7 = st1rgp7.getCheckedRadioButtonId();
                st1vl7 = (RadioButton) findViewById(st1point7);

                int st1point8 = st1rgp8.getCheckedRadioButtonId();
                st1vl8 = (RadioButton) findViewById(st1point8);

                int st1point9 = st1rgp9.getCheckedRadioButtonId();
                st1vl9 = (RadioButton) findViewById(st1point9);

                int st1point10 = st1rgp10.getCheckedRadioButtonId();
                st1vl10 = (RadioButton) findViewById(st1point10);

                int st1point11 = st1rgp11.getCheckedRadioButtonId();
                st1vl11 = (RadioButton) findViewById(st1point11);

                int st1point12 = st1rgp12.getCheckedRadioButtonId();
                st1vl12 = (RadioButton) findViewById(st1point12);

                int st1point13 = st1rgp13.getCheckedRadioButtonId();
                st1vl13 = (RadioButton) findViewById(st1point13);

                int st1point14 = st1rgp14.getCheckedRadioButtonId();
                st1vl14 = (RadioButton) findViewById(st1point14);

                int st1point15 = st1rgp15.getCheckedRadioButtonId();
                st1vl15 = (RadioButton) findViewById(st1point15);


                int total = 0;


                if((st1point1 <= 0)||(st1point2 <= 0)||(st1point3 <= 0)||(st1point4 <= 0)||(st1point5 <= 0)||(st1point6 <= 0)||(st1point7 <= 0)||(st1point8 <= 0)||(st1point9 <= 0)||(st1point10  <=0)||(st1point11 <= 0)||(st1point12 <= 0)||(st1point13 <= 0)||(st1point14 <= 0)||(st1point15 <= 0)){
                    Toast.makeText(St1PenilaianActivity.this,"Harus diisi semua",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (st1vl1.getText().toString().toLowerCase().equals("litosfer, astenosfer, mesosfer")) {
                        total = total + 1;
                    }
                    if (st1vl2.getText().toString().toLowerCase().equals("kerak bumi dan inti luar bumi")){
                        total = total + 1;
                    }
                    if (st1vl3.getText().toString().toLowerCase().equals("(1) dan (3)")){
                        total = total + 1;
                    }
                    if (st1vl4.getText().toString().toLowerCase().equals("getaran pada bumi yang disebabkan oleh pergerakan lempeng bumi secara tiba-tiba ")){
                        total = total + 1;
                    }
                    if (st1vl5.getText().toString().toLowerCase().equals("astenosfer")){
                        total = total + 1;
                    }
                    if (st1vl6.getText().toString().toLowerCase().equals("pergerakan benua")){
                        total = total + 1;
                    }
                    if (st1vl7.getText().toString().toLowerCase().equals("harry hess")){
                        total = total + 1;
                    }
                    if (st1vl8.getText().toString().toLowerCase().equals("lapisan litosfer yang berada di atas lapisan astenosfer seolah-olah bergerak karena adanya aliran konveksi")){
                        total = total + 1;
                    }
                    if (st1vl9.getText().toString().toLowerCase().equals("(2) dan (4)")){
                        total = total + 1;
                    }
                    if (st1vl10.getText().toString().toLowerCase().equals("aliran konveksi dalam astenosfer")){
                        total = total + 1;
                    }
                    if (st1vl11.getText().toString().toLowerCase().equals("divergen")){
                        total = total + 1;
                    }
                    if (st1vl12.getText().toString().toLowerCase().equals("konvergen")){
                        total = total + 1;
                    }
                    if (st1vl13.getText().toString().toLowerCase().equals("konvergen")){
                        total = total + 1;
                    }
                    if (st1vl14.getText().toString().toLowerCase().equals("geser")){
                        total = total + 1;
                    }
                    if (st1vl15.getText().toString().toLowerCase().equals("rawan terhadap bencana gempa bumi")){
                        total = total + 1;
                    }
                    Intent i = new Intent(St1PenilaianActivity.this, St1ResultActivity.class);
                    i.putExtra("nilai",total);
                    startActivity(i);

                    finish();
                }






            }
        });
    }
}
