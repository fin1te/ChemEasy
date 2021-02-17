package com.finite.chemeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.TextView;

import com.finite.chemeasy.PlayMenu.Play_1;
import com.finite.chemeasy.PlayMenu.Play_2;
import com.finite.chemeasy.PlayMenu.Play_3;
import com.finite.chemeasy.PlayMenu.Play_4;
import com.finite.chemeasy.PlayMenu.Play_5;
import com.finite.chemeasy.PlayMenu.Play_6;

public class PlayHome extends AppCompatActivity {

    TextView ph_tv_intro,ph_tv_1,ph_tv_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_home);

        ph_tv_intro = findViewById(R.id.ph_tv_intro);
        ph_tv_1 = findViewById(R.id.ph_tv_1);
        ph_tv_2 = findViewById(R.id.ph_tv_2);
    }

    public void clickGame1(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_1.class);
        startActivity(intent);
    }

    public void clickGame2(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_2.class);
        startActivity(intent);
    }

    public void clickGame3(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_3.class);
        startActivity(intent);
    }

    public void clickGame4(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_4.class);
        startActivity(intent);
    }

    public void clickGame6(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_6.class);
        startActivity(intent);
    }

    public void clickGame5(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(PlayHome.this, Play_5.class);
        startActivity(intent);
    }
}