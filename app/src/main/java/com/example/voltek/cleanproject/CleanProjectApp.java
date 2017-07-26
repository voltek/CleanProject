package com.example.voltek.cleanproject;

import android.app.Application;

import com.example.voltek.cleanproject.utils.AppLogger;

/**
 * Created by Voltek on 26/07/2017.
 */

//TODO Change the name of this class to your project name
public class CleanProjectApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Init AppLogger Timber, as soo as your application starts
        AppLogger.init();


    }
}
