package com.finite.chemeasy.PlayMenu;

import androidx.appcompat.app.AppCompatActivity;
import com.finite.chemeasy.R;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Play_6 extends AppCompatActivity {

    EditText p6_et_1, p6_et_2, p6_et_3, p6_et_4;
    Button p6_btn_hint, p6_btn_check;
    int e1, e2, e3, e4;
    int a1 = 2, a2 = 2, a3 = 1, a4 = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_6);

        p6_et_1 = findViewById(R.id.p6_et_1);
        p6_et_2 = findViewById(R.id.p6_et_2);
        p6_et_3 = findViewById(R.id.p6_et_3);
        p6_et_4 = findViewById(R.id.p6_et_4);
        p6_btn_hint = findViewById(R.id.p6_btn_hint);
        p6_btn_check = findViewById(R.id.p6_btn_check);
    }

    public void p6clickCheck(View view) {
        String c1="",c2="",c3="",c4="";
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        c1 = (p6_et_1.getText().toString());
        c2 = (p6_et_2.getText().toString());
        c3 = (p6_et_3.getText().toString());
        c4 = (p6_et_4.getText().toString());
        if(c1.equals("")||c2.equals("")||c3.equals("")||c4.equals("")) {
            Toast.makeText(this, "Please Enter All Values", Toast.LENGTH_SHORT).show();
        }
        else {
            try {
                e1 = Integer.parseInt(p6_et_1.getText().toString());
                e2 = Integer.parseInt(p6_et_2.getText().toString());
                e3 = Integer.parseInt(p6_et_3.getText().toString());
                e4 = Integer.parseInt(p6_et_4.getText().toString());
                if (e1 == a1 && e2 == a2 && e3 == a3 && e4 == a4) {
                    SharedPreferences sh = getSharedPreferences("shCurrent", MODE_PRIVATE);
                    String curr_user = sh.getString("username","");
                    SQLiteDatabase db = openOrCreateDatabase("USERS",MODE_PRIVATE,null);
                    Cursor c = db.rawQuery("SELECT * FROM users WHERE username = '"+curr_user+"'",null);
                    int p6 ;
                    c.moveToFirst();
                    p6 = c.getInt(c.getColumnIndex("p6"));

                    if(p6 == 1) {
                        Toast.makeText(this, "Already Completed, Move to Next Level!", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                    else if(p6 == 0) {
                        int score = c.getInt(c.getColumnIndex("score"));
                        score+=50;
                        db.execSQL("UPDATE users SET p6 = 1,score="+score+" WHERE username = '"+curr_user+"'");
                        Toast.makeText(this, "Great! +50 Points!!", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                    c.close();
                }
                else
                    Toast.makeText(this, "Wrong Answer, Try Again", Toast.LENGTH_SHORT).show();
            }
            catch (Exception e) {
                Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void p6clickHint(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Toast.makeText(this, "Hint Clicked! ", Toast.LENGTH_SHORT).show();
    }
}