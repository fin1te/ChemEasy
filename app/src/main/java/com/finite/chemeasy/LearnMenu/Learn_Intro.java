package com.finite.chemeasy.LearnMenu;

import androidx.appcompat.app.AppCompatActivity;

import com.finite.chemeasy.LearnHome;
import com.finite.chemeasy.R;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
        try{
            SharedPreferences sh = getSharedPreferences("shCurrent", MODE_PRIVATE);
            String curr_user = sh.getString("username","");
            SQLiteDatabase db = openOrCreateDatabase("USERS",MODE_PRIVATE,null);
//            Cursor c = db.rawQuery("SELECT * FROM users WHERE username = '"+curr_user+"'",null);
//            c.moveToFirst();
            db.execSQL("UPDATE users SET l_i = 1 WHERE username = '"+curr_user+"'");
        }
        catch(Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Nice! Move to Next Topic.", Toast.LENGTH_SHORT).show();
        finish();

//        lh_tv_intro_st.setImageResource(R.drawable.check_counter);
    }

}