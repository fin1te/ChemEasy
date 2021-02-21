package com.finite.chemeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText et_reg_name,et_reg_age,et_reg_username,et_reg_password;
    Button btn_register;
    String user="",pass="",name="",strage="";
    int age=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }

    public void click_register(View view) {
        view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        user = et_reg_username.getText().toString();
        pass = et_reg_password.getText().toString();
        name = et_reg_name.getText().toString();
        //age = Integer.parseInt(et_reg_age.getText().toString());
        strage = et_reg_age.getText().toString();

        if(user.equals("")||pass.equals("")||name.equals("")||strage.equals("")) {
            Toast.makeText(Register.this, "Please Fill All Fields!", Toast.LENGTH_SHORT).show();
        }
        else {
            try{
                age = Integer.parseInt(et_reg_age.getText().toString());
                SQLiteDatabase db = openOrCreateDatabase("USERS",MODE_PRIVATE,null);
                db.execSQL("INSERT INTO users (username,password,name,age) VALUES ('"+user+"','"+pass+"','"+name+"',"+age+")");
                Toast.makeText(this, "Registered Successfully!", Toast.LENGTH_SHORT).show();
                finish();
            }
            catch (Exception e) {
                Toast.makeText(Register.this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void init() {
        et_reg_name = findViewById(R.id.et_reg_name);
        et_reg_age = findViewById(R.id.et_reg_age);
        et_reg_username = findViewById(R.id.et_reg_username);
        et_reg_password = findViewById(R.id.et_reg_password);
        btn_register = findViewById(R.id.btn_register);
    }
}