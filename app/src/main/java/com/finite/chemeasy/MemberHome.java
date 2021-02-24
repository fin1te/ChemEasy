package com.finite.chemeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MemberHome extends AppCompatActivity {

    private TextView mh_tv_learn,mh_tv_play,mh_tv_leaderboard,mh_tv_contact_us,mh_tv_about_us,mh_tv_welcome;
    ImageView mh_iv_chem_item2;
    Timer t1,t2,t3,t4,t5,t6,t7;
    FrameLayout l1,l2,l3,l4,l5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_home);
        
        init();
        mh_tv_learn();
        mh_tv_play();
        mh_tv_leaderboard();
        mh_tv_contact_us();
        mh_tv_about_us();
        timer();
    }

    

    private void init() {
        mh_tv_learn = findViewById(R.id.mh_tv_learn);
        mh_tv_play = findViewById(R.id.mh_tv_play);
        mh_tv_leaderboard = findViewById(R.id.mh_tv_leaderboard);
        mh_tv_contact_us = findViewById(R.id.mh_tv_contact_us);
        mh_tv_about_us = findViewById(R.id.mh_tv_about_us);
        mh_iv_chem_item2 = findViewById(R.id.mh_iv_chem_item2);
        mh_tv_welcome = findViewById(R.id.mh_tv_welcome);
        l1 = findViewById(R.id.mh_l1);
        l2 = findViewById(R.id.mh_l2);
        l3 = findViewById(R.id.mh_l3);
        l4 = findViewById(R.id.mh_l4);
        l5 = findViewById(R.id.mh_l5);
    }

    private void mh_tv_about_us() {
        mh_tv_about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
//                Toast.makeText(MemberHome.this,"Clicked on About Us", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MemberHome.this, AboutHome.class);
                startActivity(intent);
            }
        });
    }

    private void mh_tv_contact_us() {
        mh_tv_contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                //SharedPreferences sh = getSharedPreferences("shCurrent", MODE_PRIVATE);
                //String username = sh.getString("username","");
                //Toast.makeText(MemberHome.this, username, Toast.LENGTH_SHORT).show();
                Toast.makeText(MemberHome.this,"Clicked on Contact Us", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void mh_tv_leaderboard() {
        mh_tv_leaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                Intent intent = new Intent(MemberHome.this, Leaderboard.class);
                startActivity(intent);
                //Toast.makeText(MemberHome.this,"Clicked on Leaderboard", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void mh_tv_play() {
        mh_tv_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
//                Toast.makeText(MemberHome.this,"Clicked on Play", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MemberHome.this, PlayHome.class);
                startActivity(intent);
            }
        });
    }

    private void mh_tv_learn() {
        mh_tv_learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
//                Toast.makeText(MemberHome.this,"Clicked on Learn", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MemberHome.this, LearnHome.class);
                startActivity(intent);
            }
        });
    }

    private void timer() {
    t1 = new Timer();   mh_tv_welcome.animate().alpha(0f).setDuration(1);
    t2 = new Timer();   mh_iv_chem_item2.animate().alpha(0f).setDuration(1);
    t3 = new Timer();   l1.animate().alpha(0f).setDuration(1);
    t4 = new Timer();   l2.animate().alpha(0f).setDuration(1);
    t5 = new Timer();   l3.animate().alpha(0f).setDuration(1);
    t6 = new Timer();   l4.animate().alpha(0f).setDuration(1);
    t7 = new Timer();   l5.animate().alpha(0f).setDuration(1);

    t1.schedule(new TimerTask() {
        @Override
        public void run() {
            mh_tv_welcome.animate().alpha(1f).setDuration(500);
        }
    },500);

    t2.schedule(new TimerTask() {
        @Override
        public void run() {
            mh_iv_chem_item2.animate().alpha(1f).setDuration(500);
        }
    },1000);

    t3.schedule(new TimerTask() {
        @Override
        public void run() {
            l1.animate().alpha(1f).setDuration(500);
        }
    },1500);

    t4.schedule(new TimerTask() {
        @Override
        public void run() {
            l2.animate().alpha(1f).setDuration(500);
        }
    },2000);

    t5.schedule(new TimerTask() {
        @Override
        public void run() {
            l3.animate().alpha(1f).setDuration(500);
        }
    },2500);

    t6.schedule(new TimerTask() {
        @Override
        public void run() {
            l4.animate().alpha(1f).setDuration(500);
        }
    },3000);

    t7.schedule(new TimerTask() {
        @Override
        public void run() {
            l5.animate().alpha(1f).setDuration(500);
        }
    },3500);

    }

    public void click_logout(View view) {
        try {
            SharedPreferences sh = getSharedPreferences("shCurrent", MODE_PRIVATE);
            SharedPreferences.Editor editor = sh.edit();
            editor.putString("username","");
            editor.apply();
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
            finish();
        }
        catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}