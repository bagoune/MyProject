package com.example.asus.myproject.Message;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.asus.myproject.Message.InboxMessageActivity;
import com.example.asus.myproject.Message.SendSMS;
import com.example.asus.myproject.R;

public class MsgActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_msg );
context=this;
        Button btnSendMsg=(Button)findViewById(R.id.btnSendMsg);
        btnSendMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, SendSMS.class));
            }
        });

        Button btnReceiveMsg=(Button)findViewById(R.id.btnReceiveMsg);
        btnReceiveMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, InboxMessageActivity.class));
            }
        });
    }
}
