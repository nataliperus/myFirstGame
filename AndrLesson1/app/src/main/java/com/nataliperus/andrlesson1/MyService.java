package com.nataliperus.andrlesson1;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG ="MyService";
    private volatile boolean mShouldInterrupt;
    private IBinder mBinder = new MyBinder();
    private final static int MODE = Service.START_REDELIVER_INTENT;
    public MyService() {
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        new Thread( () -> {
            int i = 0;
            while (true){
                Log.d(TAG,"Doing step number: "+i++);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){}
                if (mShouldInterrupt){
                    Log.d(TAG,"Interrupted");
                    break;
                }
            }
        }).start();
        return MODE;
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
    public class MyBinder extends Binder{
        MyService getService(){
            return MyService.this;
        }
    }
}
