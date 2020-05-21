package com.android.bookapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.Toast;

import com.android.bookapps.st1.St1PendahuluanActivity;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(" ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        dl = (DrawerLayout)findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();


        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                Activity selectedActivity = null;
                switch(id)
                {
                    case R.id.kikd:
                        kikdd();
                        break;
                    case R.id.sets:
                        setss();
                        break;
                    case R.id.video:
                        videoo();
                        break;
                    case R.id.pekon:
                        pekonn();
                        break;
                    case R.id.dapus:
                        dapuss();
                        break;
                    case R.id.glosarium:
                        glosariumm();
                        break;
                    default:
                        return true;
                }
                return true;
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
        finish();
        super.onDestroy();
    }

    private Boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Tekan tombol lagi untuk keluar.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }

    public void berandaa(){
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void setss(){
        Intent intent = new Intent(MainActivity.this, SetsActivity.class);
        startActivity(intent);
    }

    public void kikdd(){
        Intent intent = new Intent(MainActivity.this, KiKdActivity.class);
        startActivity(intent);
    }

    public void pekonn(){
        Intent intent = new Intent(MainActivity.this, PekonActivity.class);
        startActivity(intent);
    }

    public void videoo(){
        Intent intent = new Intent(MainActivity.this, VideoActivity.class);
        startActivity(intent);
    }
    public void dapuss(){
        Intent intent = new Intent(MainActivity.this, DapusActivity.class);
        startActivity(intent);
    }

    public void glosariumm(){
        Intent intent = new Intent(MainActivity.this, GlosariumActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }

    public void Subtema1(View view){
        Intent intent = new Intent(MainActivity.this, SubTema1Activity.class);
        startActivity(intent);
    }

    public void Subtema2(View view){
        Intent intent = new Intent(MainActivity.this, SubTema2Activity.class);
        startActivity(intent);
    }

    public void Subtema3(View view){
        Intent intent = new Intent(MainActivity.this, SubTema3Activity.class);
        startActivity(intent);
    }

    public void pengantar(View view){
        Intent intent = new Intent(MainActivity.this, PengantarActivity.class);
        startActivity(intent);
    }
}
