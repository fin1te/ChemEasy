package com.finite.chemeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer,t1,t2,t3;
    ImageView wlcpg_textimg_chemeasy,wlcpg_img_kid,wlcpg_textimg_balance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            SQLiteDatabase db = openOrCreateDatabase("USERS",MODE_PRIVATE,null);
            //db.execSQL("CREATE TABLE IF NOT EXISTS users (id INTEGER UNIQUE,username TEXT,password TEXT,PRIMARY KEY(id AUTOINCREMENT))");
            db.execSQL("CREATE TABLE IF NOT EXISTS users (id INTEGER UNIQUE,username TEXT UNIQUE,password TEXT,name TEXT,age INTEGER,score INTEGER," +
                    "l_i INTEGER,t1 INTEGER,t2 INTEGER,t3 INTEGER,t3a INTEGER,t3b INTEGER,t3c INTEGER,t3d INTEGER,t3e INTEGER,t4 INTEGER,t4a INTEGER," +
                    "t4b INTEGER,t4c INTEGER,t4d INTEGER,ts INTEGER,tsa INTEGER,tsb INTEGER,p_i INTEGER,p1 INTEGER,p2 INTEGER,p3 INTEGER,p4 INTEGER," +
                    "p5 INTEGER,p6 INTEGER,p7 INTEGER,p8 INTEGER,p9 INTEGER,p10\tINTEGER,p11 INTEGER,p12 INTEGER,p13\tINTEGER,p14\tINTEGER,learn INTEGER," +
                    "play INTEGER,lb INTEGER,contact INTEGER,about INTEGER,PRIMARY KEY(id AUTOINCREMENT))");
        }
        catch (Exception e) {
            Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
        }



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
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}