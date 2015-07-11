package com.sixtech.paulchidi.cuweb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class SplashScreen extends Activity {
    protected TextView splashText;
    protected View splashLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Animation animateText = AnimationUtils.loadAnimation(SplashScreen.this, R.anim.splashtext);
        splashText = (TextView) findViewById(R.id.textView);
        splashText.startAnimation(animateText);
        splashLayout = findViewById(R.id.splashlayout);
        splashLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent iMainActivity = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(iMainActivity);
            }


        });


    }


}

