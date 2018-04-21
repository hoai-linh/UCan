package com.example.twinkle_star.ucan;

import android.app.Application;

import com.example.twinkle_star.ucan.di.ApplicationComponent;

public class UCanApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
