package com.example.layout2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class splashactivity extends AppCompatActivity implements Animation.AnimationListener {
    protected ImageView img1;
    protected Animation anima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_splashactivity);
        img1 = findViewById(R.id.splashimg);
        anima = AnimationUtils.loadAnimation(splashactivity.this, R.anim.anim);
        img1 = findViewById(R.id.splashimg);
        anima = AnimationUtils.loadAnimation(splashactivity.this, R.anim.anim);
        anima.setAnimationListener(this);
        img1.startAnimation(anima);
        Handler handler=new Handler();

        handler.postDelayed(() -> {
            Intent intent = new Intent(splashactivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        },2000);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}