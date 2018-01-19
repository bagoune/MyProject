package com.example.asus.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Camera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_camera );
        final ImageView photofilm = (ImageView) findViewById(R.id.photofilm);
        final ImageView imgfilm = (ImageView) findViewById(R.id.imgfilm);
        final ImageView img_getphoto = (ImageView) findViewById(R.id.img_getphoto);

        img_getphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                photofilm.setBackgroundResource(R.drawable.ic_mirrorcamera);
            }
        });

        imgfilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                photofilm.setBackgroundResource(R.drawable.ic_videocam);
            }
        });
    }
}
