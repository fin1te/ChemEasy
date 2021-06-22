package com.finite.chemeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Leaderboard extends AppCompatActivity {

    TextView lb_username,lb_name,lb_age,lb_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        lb_username = findViewById(R.id.lb_username);
        lb_name = findViewById(R.id.lb_name);
        lb_age = findViewById(R.id.lb_age);
        lb_score = findViewById(R.id.lb_score);

        String user,name,strage,strscore;
        int age,score;

        try {
            SharedPreferences sh = getSharedPreferences("shCurrent", MODE_PRIVATE);
            String curr_user = sh.getString("username","");

            SQLiteDatabase db = openOrCreateDatabase("USERS",MODE_PRIVATE,null);
            Cursor c = db.rawQuery("SELECT * FROM users WHERE username = '"+curr_user+"'",null);
            c.moveToFirst();
            user = c.getString(c.getColumnIndex("username"));
            name = c.getString(c.getColumnIndex("name"));
            age = c.getInt(c.getColumnIndex("age"));
            score = c.getInt(c.getColumnIndex("score"));

            strage = String.valueOf(age);
            strscore = String.valueOf(score);

            lb_username.setText(user);
            lb_name.setText(name);
            lb_age.setText(strage);
            lb_score.setText(strscore);

            c.close();
        }
        catch(Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}