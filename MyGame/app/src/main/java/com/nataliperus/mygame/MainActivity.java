package com.nataliperus.mygame;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
    private BroadcastReceiver clickReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

        }
    };
    private int numberOfBox = 0;
    private int level = 0;
    private ImageView box1View, box2View, box3View;
    private View buttonReset;
    private View.OnClickListener onClickListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   numberOfBox =
        box1View = findViewById(R.id.box1);
        box1View.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                level =10000;
                buttonReset.setVisibility(View.VISIBLE);
            }
        });
        box2View = findViewById(R.id.box2);
        box2View.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                level =10000;
                buttonReset.setVisibility(View.VISIBLE);
            }
        });
        box3View = findViewById(R.id.box3);
        box3View.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                level =10000;
                buttonReset.setVisibility(View.VISIBLE);
            }
        });
        buttonReset = findViewById(R.id.button1);
        buttonReset.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onStart(){
        super.onStart();
    //    IntentFilter intentFilter = new IntentFilter(Intent.ACTION_CALL_BUTTON);
      //  registerReceiver(clickReceiver,intentFilter);
    }

    @Override
    protected  void onStop(){
        super.onStop();
     //   unregisterReceiver(clickReceiver);
    }
    private void doShow(){
        if (View
    }
}
