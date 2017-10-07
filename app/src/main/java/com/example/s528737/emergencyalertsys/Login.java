package com.example.s528737.emergencyalertsys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void toAlert(View v){
        Intent intentalert = new Intent(this,AlertPage.class);
        startActivity(intentalert);
    }
    public void toRegister(View v){
        Intent intentregister =new Intent(this, Register.class);
        startActivity(intentregister);
    }
    public void toForgot(View v){
        Intent intentforgot = new Intent(this, ForgotPassword.class);
        startActivity(intentforgot);
    }

}
