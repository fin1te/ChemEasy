package com.finite.chemeasy.LearnMenu;

import androidx.appcompat.app.AppCompatActivity;

import com.finite.chemeasy.LearnHome;
import com.finite.chemeasy.R;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Learn_Intro extends AppCompatActivity {

    ImageView lh_tv_intro_st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn__intro);

    }

    public void li_clickDone(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Toast.makeText(this, "Nice! Move to Next Topic.", Toast.LENGTH_SHORT).show();
        finish();

//        lh_tv_intro_st.setImageResource(R.drawable.check_counter);
    }

}