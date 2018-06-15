package com.hoonyeee.android.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button btnTrans, btnRotate;
    Animation animation, animTranslate, animRotate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.view animation
        //뷰가 이동해도 사실은 원래 있던 위치에 있다.
        button = findViewById(R.id.button);
        animation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.scale);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.startAnimation(animation);
            }
        });

        btnTrans = findViewById(R.id.btnTrans);
        animTranslate = AnimationUtils.loadAnimation(getBaseContext(), R.anim.translate);
        btnTrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTrans.startAnimation(animTranslate);
            }
        });

        btnRotate = findViewById(R.id.btnRotate);
        animRotate = AnimationUtils.loadAnimation(getBaseContext(), R.anim.complex);
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRotate.startAnimation(animRotate);
            }
        });
        //2.property animation
        //실제로 해당위치로 이동
    }
}
