package com.finite.chemeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.finite.chemeasy.LearnMenu.Learn_Intro;
import com.finite.chemeasy.LearnMenu.Learn_T1;
import com.finite.chemeasy.LearnMenu.Learn_T2;
import com.finite.chemeasy.LearnMenu.Learn_T3;
import com.finite.chemeasy.LearnMenu.Learn_T3_a;
import com.finite.chemeasy.LearnMenu.Learn_T3_b;
import com.finite.chemeasy.LearnMenu.Learn_T3_c;
import com.finite.chemeasy.LearnMenu.Learn_T3_d;
import com.finite.chemeasy.LearnMenu.Learn_T3_e;
import com.finite.chemeasy.LearnMenu.Learn_T4;
import com.finite.chemeasy.LearnMenu.Learn_T4_a;
import com.finite.chemeasy.LearnMenu.Learn_T4_b;
import com.finite.chemeasy.LearnMenu.Learn_T4_c;
import com.finite.chemeasy.LearnMenu.Learn_T4_d;
import com.finite.chemeasy.LearnMenu.Learn_solved;
import com.finite.chemeasy.LearnMenu.Learn_solved_a;
import com.finite.chemeasy.LearnMenu.Learn_solved_b;

public class LearnHome extends AppCompatActivity {

    TextView lh_tv_intro,lh_tv_topic1,lh_tv_topic2,lh_tv_topic3,lh_tv_topic3a,lh_tv_topic3b,lh_tv_topic3c,lh_tv_topic3d,lh_tv_topic3e;
    TextView lh_tv_topic4,lh_tv_topic4a,lh_tv_topic4b,lh_tv_topic4c,lh_tv_topic4d,lh_tv_solved_ex,lh_tv_solved_ex_a,lh_tv_solved_ex_b;
    ImageView lh_tv_intro_st,lh_tv_topic1_st,lh_tv_topic2_st,lh_tv_topic3_st,lh_tv_topic3a_st,lh_tv_topic3b_st,lh_tv_topic3c_st,lh_tv_topic3d_st;
    ImageView lh_tv_topic3e_st,lh_tv_topic4_st,lh_tv_topic4a_st,lh_tv_topic4b_st,lh_tv_topic4c_st,lh_tv_topic4d_st,lh_tv_solved_ex_st;
    ImageView lh_tv_solved_ex_a_st,lh_tv_solved_ex_b_st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_home);
        init();
    }

    private void init() {
        lh_tv_intro = findViewById(R.id.lh_tv_intro);         lh_tv_intro_st = findViewById(R.id.lh_tv_intro_st);
        lh_tv_topic1 = findViewById(R.id.lh_tv_topic1);
        lh_tv_topic2 = findViewById(R.id.lh_tv_topic2);
        lh_tv_topic3 = findViewById(R.id.lh_tv_topic3);
        lh_tv_topic3a = findViewById(R.id.lh_tv_topic3a);
        lh_tv_topic3b = findViewById(R.id.lh_tv_topic3b);
        lh_tv_topic3c = findViewById(R.id.lh_tv_topic3c);
        lh_tv_topic3d = findViewById(R.id.lh_tv_topic3d);
        lh_tv_topic3e = findViewById(R.id.lh_tv_topic3e);
        lh_tv_topic4 = findViewById(R.id.lh_tv_topic4);
        lh_tv_topic4a = findViewById(R.id.lh_tv_topic4a);
        lh_tv_topic4b = findViewById(R.id.lh_tv_topic4b);
        lh_tv_topic4c = findViewById(R.id.lh_tv_topic4c);
        lh_tv_topic4d = findViewById(R.id.lh_tv_topic4d);
        lh_tv_solved_ex = findViewById(R.id.lh_tv_solved_ex);
        lh_tv_solved_ex_a = findViewById(R.id.lh_tv_solved_ex_a);
        lh_tv_solved_ex_b = findViewById(R.id.lh_tv_solved_ex_b);

        lh_tv_topic1_st = findViewById(R.id.lh_tv_topic1_st);
        lh_tv_topic2_st = findViewById(R.id.lh_tv_topic2_st);
        lh_tv_topic3_st = findViewById(R.id.lh_tv_topic3_st);
        lh_tv_topic3a_st = findViewById(R.id.lh_tv_topic3a_st);
        lh_tv_topic3b_st = findViewById(R.id.lh_tv_topic3b_st);
        lh_tv_topic3c_st = findViewById(R.id.lh_tv_topic3c_st);
        lh_tv_topic3d_st = findViewById(R.id.lh_tv_topic3d_st);
        lh_tv_topic3e_st = findViewById(R.id.lh_tv_topic3e_st);
        lh_tv_topic4_st = findViewById(R.id.lh_tv_topic4_st);
        lh_tv_topic4a_st = findViewById(R.id.lh_tv_topic4a_st);
        lh_tv_topic4b_st = findViewById(R.id.lh_tv_topic4b_st);
        lh_tv_topic4c_st = findViewById(R.id.lh_tv_topic4c_st);
        lh_tv_topic4d_st = findViewById(R.id.lh_tv_topic4d_st);
        lh_tv_solved_ex_st = findViewById(R.id.lh_tv_solved_ex_st);
        lh_tv_solved_ex_a_st = findViewById(R.id.lh_tv_solved_ex_a_st);
        lh_tv_solved_ex_b_st = findViewById(R.id.lh_tv_solved_ex_b_st);
    }

    public void clickIntro(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_Intro.class);
        startActivity(intent);
        lh_tv_intro_st.setImageResource(R.drawable.check_counter);
        //lh_tv_intro_st.setBackground(R.drawable.check_counter);
    }

    public void clickTopic1(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T1.class);
        startActivity(intent);
        lh_tv_topic1_st.setImageResource(R.drawable.check_counter);

    }

    public void clickTopic2(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T2.class);
        startActivity(intent);
        lh_tv_topic2_st.setImageResource(R.drawable.check_counter);

    }

    public void clickTopic3(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T3.class);
        startActivity(intent);
        lh_tv_topic3_st.setImageResource(R.drawable.check_counter);

    }

    public void clickTopic3a(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T3_a.class);
        startActivity(intent);
        lh_tv_topic3a_st.setImageResource(R.drawable.check_counter);

    }

    public void clickTopic3b(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T3_b.class);
        startActivity(intent);
        lh_tv_topic3b_st.setImageResource(R.drawable.check_counter);
    }

    public void clickTopic3c(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T3_c.class);
        startActivity(intent);
        lh_tv_topic3c_st.setImageResource(R.drawable.check_counter);
    }

    public void clickTopic3d(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T3_d.class);
        startActivity(intent);
        lh_tv_topic3d_st.setImageResource(R.drawable.check_counter);
    }

    public void clickTopic3e(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T3_e.class);
        startActivity(intent);
        lh_tv_topic3e_st.setImageResource(R.drawable.check_counter);
    }

    public void clickTopic4(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T4.class);
        startActivity(intent);
        lh_tv_topic4_st.setImageResource(R.drawable.check_counter);
    }

    public void clickTopic4a(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T4_a.class);
        startActivity(intent);
        lh_tv_topic4a_st.setImageResource(R.drawable.check_counter);
    }

    public void clickTopic4b(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T4_b.class);
        startActivity(intent);
        lh_tv_topic4b_st.setImageResource(R.drawable.check_counter);
    }

    public void clickTopic4c(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T4_c.class);
        startActivity(intent);
        lh_tv_topic4c_st.setImageResource(R.drawable.check_counter);
    }

    public void clickTopic4d(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_T4_d.class);
        startActivity(intent);
        lh_tv_topic4d_st.setImageResource(R.drawable.check_counter);
    }

    public void clickSolved(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_solved.class);
        startActivity(intent);
        lh_tv_solved_ex_st.setImageResource(R.drawable.check_counter);
    }

    public void clickSolvedA(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_solved_a.class);
        startActivity(intent);
        lh_tv_solved_ex_a_st.setImageResource(R.drawable.check_counter);
    }

    public void clickSolvedB(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(LearnHome.this, Learn_solved_b.class);
        startActivity(intent);
        lh_tv_solved_ex_b_st.setImageResource(R.drawable.check_counter);
    }

//    public void setStatus(ImageView st) {
//        st.setImageResource(R.drawable.check_counter);
//    }
}