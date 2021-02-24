package com.finite.chemeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.finite.chemeasy.PlayMenu.Play_1;
import com.finite.chemeasy.PlayMenu.Play_10;
import com.finite.chemeasy.PlayMenu.Play_11;
import com.finite.chemeasy.PlayMenu.Play_12;
import com.finite.chemeasy.PlayMenu.Play_13;
import com.finite.chemeasy.PlayMenu.Play_14;
import com.finite.chemeasy.PlayMenu.Play_2;
import com.finite.chemeasy.PlayMenu.Play_3;
import com.finite.chemeasy.PlayMenu.Play_4;
import com.finite.chemeasy.PlayMenu.Play_5;
import com.finite.chemeasy.PlayMenu.Play_6;
import com.finite.chemeasy.PlayMenu.Play_7;
import com.finite.chemeasy.PlayMenu.Play_8;
import com.finite.chemeasy.PlayMenu.Play_9;

public class PlayHome extends AppCompatActivity {

    TextView ph_tv_intro,ph_tv_1,ph_tv_2;
    ImageView ph_iv_p1,ph_iv_p2,ph_iv_p3,ph_iv_p4,ph_iv_p5,ph_iv_p6,ph_iv_p7,ph_iv_p8,ph_iv_p9,
            ph_iv_p10,ph_iv_p11,ph_iv_p12,ph_iv_p13,ph_iv_p14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_home);

        init();

        SharedPreferences sh = getSharedPreferences("shCurrent", MODE_PRIVATE);
        String curr_user = sh.getString("username","");
        SQLiteDatabase db = openOrCreateDatabase("USERS",MODE_PRIVATE,null);
        Cursor c = db.rawQuery("SELECT * FROM users WHERE username = '"+curr_user+"'",null);
        c.moveToFirst();
        int p1 = c.getInt(c.getColumnIndex("p1"));
        int p2 = c.getInt(c.getColumnIndex("p2"));
        int p3 = c.getInt(c.getColumnIndex("p3"));
        int p4 = c.getInt(c.getColumnIndex("p4"));
        int p5 = c.getInt(c.getColumnIndex("p5"));
        int p6 = c.getInt(c.getColumnIndex("p6"));
        int p7 = c.getInt(c.getColumnIndex("p7"));
        int p8 = c.getInt(c.getColumnIndex("p8"));
        int p9 = c.getInt(c.getColumnIndex("p9"));
        int p10 = c.getInt(c.getColumnIndex("p10"));
        int p11 = c.getInt(c.getColumnIndex("p11"));
        int p12 = c.getInt(c.getColumnIndex("p12"));
        int p13 = c.getInt(c.getColumnIndex("p13"));
        int p14 = c.getInt(c.getColumnIndex("p14"));

        if(p1 == 1) {
            ph_iv_p1.setImageResource(R.drawable.check_counter);
        }
        if(p2 == 1) {
            ph_iv_p2.setImageResource(R.drawable.check_counter);
        }
        if(p3 == 1) {
            ph_iv_p3.setImageResource(R.drawable.check_counter);
        }
        if(p4 == 1) {
            ph_iv_p4.setImageResource(R.drawable.check_counter);
        }
        if(p5 == 1) {
            ph_iv_p5.setImageResource(R.drawable.check_counter);
        }
        if(p6 == 1) {
            ph_iv_p6.setImageResource(R.drawable.check_counter);
        }
        if(p7 == 1) {
            ph_iv_p7.setImageResource(R.drawable.check_counter);
        }
        if(p8 == 1) {
            ph_iv_p8.setImageResource(R.drawable.check_counter);
        }
        if(p9 == 1) {
            ph_iv_p9.setImageResource(R.drawable.check_counter);
        }
        if(p10 == 1) {
            ph_iv_p10.setImageResource(R.drawable.check_counter);
        }
        if(p11 == 1) {
            ph_iv_p11.setImageResource(R.drawable.check_counter);
        }
        if(p12 == 1) {
            ph_iv_p12.setImageResource(R.drawable.check_counter);
        }
        if(p13 == 1) {
            ph_iv_p13.setImageResource(R.drawable.check_counter);
        }
        if(p14 == 1) {
            ph_iv_p14.setImageResource(R.drawable.check_counter);
        }
        c.close();
    }



    public void clickGame1(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_1.class);
//        ph_iv_p1.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame2(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_2.class);
//        ph_iv_p2.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame3(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_3.class);
//        ph_iv_p3.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame4(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_4.class);
//        ph_iv_p4.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame5(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_5.class);
//        ph_iv_p5.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame6(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_6.class);
//        ph_iv_p6.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame7(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_7.class);
//        ph_iv_p7.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame8(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_8.class);
//        ph_iv_p8.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame9(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_9.class);
//        ph_iv_p9.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame10(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_10.class);
//        ph_iv_p10.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame11(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_11.class);
//        ph_iv_p11.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame12(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_12.class);
//        ph_iv_p12.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame13(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_13.class);
//        ph_iv_p13.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    public void clickGame14(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_14.class);
//        ph_iv_p14.setImageResource(R.drawable.check_counter);
        startActivity(intent);
    }

    private void init() {
        ph_tv_intro = findViewById(R.id.ph_tv_intro);
        ph_tv_1 = findViewById(R.id.ph_tv_1);
        ph_tv_2 = findViewById(R.id.ph_tv_2);

        ph_iv_p1 = findViewById(R.id.ph_iv_p1);
        ph_iv_p2 = findViewById(R.id.ph_iv_p2);
        ph_iv_p3 = findViewById(R.id.ph_iv_p3);
        ph_iv_p4 = findViewById(R.id.ph_iv_p4);
        ph_iv_p5 = findViewById(R.id.ph_iv_p5);
        ph_iv_p6 = findViewById(R.id.ph_iv_p6);
        ph_iv_p7 = findViewById(R.id.ph_iv_p7);
        ph_iv_p8 = findViewById(R.id.ph_iv_p8);
        ph_iv_p9 = findViewById(R.id.ph_iv_p9);
        ph_iv_p10 = findViewById(R.id.ph_iv_p10);
        ph_iv_p11 = findViewById(R.id.ph_iv_p11);
        ph_iv_p12 = findViewById(R.id.ph_iv_p12);
        ph_iv_p13 = findViewById(R.id.ph_iv_p13);
        ph_iv_p14 = findViewById(R.id.ph_iv_p14);
    }
}