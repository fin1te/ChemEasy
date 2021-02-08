package com.finite.chemeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MemberHome extends AppCompatActivity {

    private TextView mh_tv_learn,mh_tv_play,mh_tv_leaderboard,mh_tv_contact_us,mh_tv_about_us;

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
    }

    private void init() {
        mh_tv_learn = findViewById(R.id.mh_tv_learn);
        mh_tv_play = findViewById(R.id.mh_tv_play);
        mh_tv_leaderboard = findViewById(R.id.mh_tv_leaderboard);
        mh_tv_contact_us = findViewById(R.id.mh_tv_contact_us);
        mh_tv_about_us = findViewById(R.id.mh_tv_about_us);
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
                Toast.makeText(MemberHome.this,"Clicked on Contact Us", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void mh_tv_leaderboard() {
        mh_tv_leaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                Toast.makeText(MemberHome.this,"Clicked on Leaderboard", Toast.LENGTH_SHORT).show();
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


}