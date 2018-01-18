package com.example.asus.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RtlLtrText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_rtl_ltr_text );

        TextView tvrtl=(TextView)findViewById(R.id.rtl);
        final EditText editText = (EditText) findViewById(R.id.edtGetText);
        editText.setText( "سلامممممم" );

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams( ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.RIGHT;
        tvrtl.setLayoutParams( params );

        TextView tvltr=(TextView)findViewById(R.id.ltr);
        LinearLayout.LayoutParams paramsL = new LinearLayout.LayoutParams( ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        paramsL.gravity =Gravity.LEFT;
        tvltr.setLayoutParams( paramsL );

        EditText edtrtl=(EditText)findViewById(R.id.edtrtl);
        LinearLayout.LayoutParams paramsedt = new LinearLayout.LayoutParams( ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        paramsedt.gravity =Gravity.RIGHT;
        edtrtl.setLayoutParams( paramsedt );
    }
}
