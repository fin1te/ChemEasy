package com.finite.chemeasy.PlayMenu;

import androidx.appcompat.app.AppCompatActivity;
import com.finite.chemeasy.R;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Play_14 extends AppCompatActivity {

    EditText p14_et_1, p14_et_2, p14_et_3, p14_et_4;
    Button p14_btn_hint, p14_btn_check;
    int e1, e2, e3, e4;
    int a1 = 1, a2 = 1, a3 = 1, a4 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_14);

        p14_et_1 = findViewById(R.id.p14_et_1);
        p14_et_2 = findViewById(R.id.p14_et_2);
        p14_et_3 = findViewById(R.id.p14_et_3);
        p14_et_4 = findViewById(R.id.p14_et_4);
        p14_btn_hint = findViewById(R.id.p14_btn_hint);
        p14_btn_check = findViewById(R.id.p14_btn_check);
    }
    public void p14clickCheck(View view) {
        String c1="",c2="",c3="",c4="";
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        c1 = (p14_et_1.getText().toString());
        c2 = (p14_et_2.getText().toString());
        c3 = (p14_et_3.getText().toString());
        c4 = (p14_et_4.getText().toString());
        if(c1.equals("")||c2.equals("")||c3.equals("")||c4.equals("")) {
            Toast.makeText(this, "Please Enter All Values", Toast.LENGTH_SHORT).show();
        }
        else {
            try {
                e1 = Integer.parseInt(p14_et_1.getText().toString());
                e2 = Integer.parseInt(p14_et_2.getText().toString());
                e3 = Integer.parseInt(p14_et_3.getText().toString());
                e4 = Integer.parseInt(p14_et_4.getText().toString());
                if (e1 == a1 && e2 == a2 && e3 == a3 && e4 == a4) {
                    Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show();
                    finish();
                }
                else
                    Toast.makeText(this, "Wrong Answer, Try Again", Toast.LENGTH_SHORT).show();
            }
            catch (Exception e) {
                Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void p14clickHint(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Toast.makeText(this, "Hint Clicked! ", Toast.LENGTH_SHORT).show();
    }
}