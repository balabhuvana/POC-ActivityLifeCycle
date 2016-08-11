package com.example.balamurugan_se.poc_activitylifecycle;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by balamurugan_se on 8/11/2016.
 */
public class MyApplication extends Application {
    private String TAG = MyApplication.class.getSimpleName();

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.d(TAG, "onConfigurationChanged()");
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate()");
        super.onCreate();
        LeakCanary.install(this);
    }

    @Override
    public void onLowMemory() {
        Log.d(TAG, "onLowMemory()");
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        Log.d(TAG, "onTerminate()");
        super.onTerminate();
    }
}
