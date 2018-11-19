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
            buttonReset.setVisibility(View.VISIBLE);
        }
    };

    private ImageView box1View, box2View, box3View;
    private View buttonReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        box1View = findViewById(R.id.box1);
        box2View = findViewById(R.id.box2);
        box3View = findViewById(R.id.box3);
        buttonReset = findViewById(R.id.button1);
        box1View.setVisibility(View.VISIBLE);
        box2View.setVisibility(View.VISIBLE);
        box3View.setVisibility(View.VISIBLE);
        buttonReset.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onStart(){
        super.onStart();
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_CALL_BUTTON);
        registerReceiver(clickReceiver,intentFilter);
    }

    @Override
    protected  void onStop(){
        super.onStop();
        unregisterReceiver(clickReceiver);
    }
}
