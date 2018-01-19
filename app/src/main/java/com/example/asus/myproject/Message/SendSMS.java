package com.example.asus.myproject.Message;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.asus.myproject.R;

public class SendSMS extends AppCompatActivity {
private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_send_sms );
        context=this;
         ImageView imgsendmessg = (ImageView) findViewById(R.id.imgSendMessage);
         ImageView imgContacts = (ImageView) findViewById(R.id.imgContacts);

        imgsendmessg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SendSMS.this, "send message", Toast.LENGTH_SHORT).show();

            }
        });

        imgContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SendSMS.this, "show contacts", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
