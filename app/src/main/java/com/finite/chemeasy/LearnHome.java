package com.finite.chemeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.TextView;

import com.finite.chemeasy.LearnMenu.Learn_Intro;
import com.finite.chemeasy.LearnMenu.Learn_T1;
import com.finite.chemeasy.LearnMenu.Learn_T2;
import com.finite.chemeasy.LearnMenu.Learn_T3;
import com.finite.chemeasy.LearnMenu.Learn_T3_a;
import com.finite.chemeasy.LearnMenu.Learn_T3_b;
import com.finite.chemeasy.LearnMenu.Learn_T3_c;

public class LearnHome extends AppCompatActivity {

    TextView lh_tv_intro,lh_tv_topic1,lh_tv_topic2,lh_tv_topic3,lh_tv_topic3a,lh_tv_topic3b,lh_tv_topic3c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_home);
        init();
    }

    private void init() {
        lh_tv_intro = findViewById(R.id.lh_tv_intro);
        lh_tv_topic1 = findViewById(R.id.lh_tv_topic1);
        lh_tv_topic2 = findViewById(R.id.lh_tv_topic2);
        lh_tv_topic3 = findViewById(R.id.lh_tv_topic3);
        lh_tv_topic3a = findViewById(R.id.lh_tv_topic3a);
        lh_tv_topic3b = findViewById(R.id.lh_tv_topic3b);
        lh_tv_topic3c = findViewById(R.id.lh_tv_topic3c);
    }

    public void clickIntro(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_Intro.class);
        startActivity(intent);
    }

    public void clickTopic1(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T1.class);
        startActivity(intent);
    }

    public void clickTopic2(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T2.class);
        startActivity(intent);
    }

    public void clickTopic3(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T3.class);
        startActivity(intent);
    }

    public void clickTopic3a(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T3_a.class);
        startActivity(intent);
    }

    public void clickTopic3b(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T3_b.class);
        startActivity(intent);
    }

    public void clickTopic3c(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T3_c.class);
        startActivity(intent);
    }
}