package com.nataliperus.mygame;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    private int numberOfFullBox = 0;
    private Random random = new Random();
    private int level = 0;
    private ImageView box1View, box2View, box3View;
    private View buttonReset;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonReset = findViewById(R.id.button1);
        box1View = findViewById(R.id.box1);
        box2View = findViewById(R.id.box2);
        box3View = findViewById(R.id.box3);
        initAll();
        box1View.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                level =10000;
                drowBoxes(numberOfFullBox,level);
            }
        });
        box2View.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                level =10000;
                drowBoxes(numberOfFullBox,level);
            }
        });
        box3View.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                level =10000;
                drowBoxes(numberOfFullBox,level);
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initAll();
            }
        });
    }
    private void drowBoxes(int currentBox, int currentLevel){
        if (currentBox==1){
            box1View.getDrawable().setLevel(currentLevel);
        }
        if (currentBox==2){
            box2View.getDrawable().setLevel(currentLevel);
        }
        if (currentBox==3){
            box3View.getDrawable().setLevel(currentLevel);
        }
        buttonReset.setVisibility(View.VISIBLE);
    }
    private void initAll(){
        level = 0;
        box1View.getDrawable().setLevel(level);
        box2View.getDrawable().setLevel(level);
        box3View.getDrawable().setLevel(level);
        numberOfFullBox = random.nextInt(3)+1;
        buttonReset.setVisibility(View.INVISIBLE);
    }
    @Override
    public void onStart(){
        super.onStart();
    }
    @Override
    public void onStop(){
        super.onStop();
    }
}
