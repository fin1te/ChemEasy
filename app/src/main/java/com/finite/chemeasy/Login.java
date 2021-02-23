package com.finite.chemeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText et_login_username,et_login_password;
    Button btn_login;

    //SharedPreferences sharedPreferences = getSharedPreferences("com.finite.chemeasy", MODE_PRIVATE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //init();
        et_login_username = findViewById(R.id.et_login_username);
        et_login_password = findViewById(R.id.et_login_password);
        btn_login = findViewById(R.id.btn_login);
    }

    public void click_login (View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        String user="",pass="";
        user = et_login_username.getText().toString();
        pass = et_login_password.getText().toString();
        if(user.equals("")||pass.equals("")) {
            Toast.makeText(this, "Fill both User & Pass!", Toast.LENGTH_SHORT).show();
        }
        else {
            try {
                SQLiteDatabase db = openOrCreateDatabase("USERS",MODE_PRIVATE,null);
                Cursor c = db.rawQuery("SELECT * FROM users WHERE username = '"+user+"' and password = '"+pass+"'",null);
                if(c.getCount()>0) {
                    //sharedPreferences.edit().putString("curr_user",user).apply();
                    SharedPreferences sharedPreferences = getSharedPreferences("shCurrent", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("username",user);
                    editor.apply();
                    Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, MemberHome.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(this, "Error: Wrong Username / Password", Toast.LENGTH_SHORT).show();
                }
                c.close();
            }
            catch (Exception e) {
                Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void click_goto_reg(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

//    private void init() {
//
//    }
}