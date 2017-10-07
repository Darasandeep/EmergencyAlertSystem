package com.example.s528737.emergencyalertsys;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AlertPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_page);
    }
    public void Implicit(View v){


                Intent intent= new Intent(Intent.ACTION_DEFAULT,  ContactsContract.Contacts.CONTENT_URI);

                startActivityForResult(intent, 1);
            }
}
