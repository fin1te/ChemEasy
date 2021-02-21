package com.finite.chemeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer,t1,t2,t3;
    ImageView wlcpg_textimg_chemeasy,wlcpg_img_kid,wlcpg_textimg_balance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wlcpg_textimg_chemeasy = findViewById(R.id.wlcpg_textimg_chemeasy);
        wlcpg_img_kid = findViewById(R.id.wlcpg_img_kid);
        wlcpg_textimg_balance = findViewById(R.id.wlcpg_textimg_balance);

        //wlcpg_textimg_chemeasy.setImageAlpha(0);
        //wlcpg_img_kid.setImageAlpha(0);
        //wlcpg_textimg_balance.setImageAlpha(0);

        t1 = new Timer();
        t2 = new Timer();
        t3 = new Timer();
        timer = new Timer();

        t1.schedule(new TimerTask() {
            @Override
            public void run() {
                wlcpg_textimg_chemeasy.animate().alpha(1f).setDuration(500);
            }
        },500);

        t2.schedule(new TimerTask() {
            @Override
            public void run() {
                wlcpg_img_kid.animate().alpha(1f).setDuration(500);
            }
        },1000);

        t3.schedule(new TimerTask() {
            @Override
            public void run() {
                wlcpg_textimg_balance.animate().alpha(1f).setDuration(700);
            }
        },1500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MemberHome.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}