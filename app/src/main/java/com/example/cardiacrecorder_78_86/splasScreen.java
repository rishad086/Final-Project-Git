package com.example.cardiacrecorder_78_86;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splasScreen extends AppCompatActivity {

    private ImageView logo;
    private TextView title,slogan;

    Animation topAnimation,bottomAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splas_screen);

        logo=findViewById(R.id.logo);
        title=findViewById(R.id.title);
        slogan=findViewById(R.id.slogan);

        topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation=AnimationUtils.loadAnimation(this,R.anim.bottom_amimation);

        logo.setAnimation(topAnimation);
        title.setAnimation(bottomAnimation);
        slogan.setAnimation(bottomAnimation);

        int spals_screen=4300;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(splasScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },spals_screen);





    }
}