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
    public void contactsPage(View v){

        Intent contacts= new Intent(this,AppContacts.class);
        startActivity(contacts);

            }

    public void toFeedback1(View v){
        Intent emer1= new Intent(this,Feedback.class);
        startActivity(emer1);
    }
    public void toFeedback2(View v){
        Intent emer2= new Intent(this,Feedback.class);
        startActivity(emer2);
    }
    public void toFeedback3(View v){
        Intent emer3 = new Intent(this,Feedback.class);
        startActivity(emer3);
    }

    public void toMainFeedback(View v)
    {
        Intent mainFeed = new Intent(this,Feedback.class);
        startActivity(mainFeed);
    }


    public void menuBar(View v){
        Intent menubar = new Intent(this,Feedback.class);
        startActivity(menubar);
    }

}
