package com.example.jarro.vega2017summer;

import android.app.Application;

import com.example.jarro.vega2017summer.util.UtilLog;

/**
 * Created by jarro on 6/25/2017.
 */

public class JarrodApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        UtilLog.setIsLog(false);
    }
}
