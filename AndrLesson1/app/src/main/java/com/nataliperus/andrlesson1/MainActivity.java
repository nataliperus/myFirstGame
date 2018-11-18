package com.nataliperus.andrlesson1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private View button1;
    private View button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(this,MyService.class);
        Button button1 = findViewById(R.id.button1);

        button1.setOnClickListener((v) ->{
            Log.d(TAG,"startService");
            startService(intent);
        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener( (v) -> {
            Log.d(TAG,"startActivity2");
            Intent intentActivity = new Intent(this, SecondActivity.class);
            startActivity(intentActivity);
        });
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

}
