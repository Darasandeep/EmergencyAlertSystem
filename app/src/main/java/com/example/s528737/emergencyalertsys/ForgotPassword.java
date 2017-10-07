package com.example.s528737.emergencyalertsys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    public void textView(View v)
    {
        TextView tv = (TextView) findViewById(R.id.textView12);
        tv.setText("reset link sent successfully");
    }

}
