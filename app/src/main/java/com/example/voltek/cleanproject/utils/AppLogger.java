package com.example.voltek.cleanproject.utils;

import com.example.voltek.cleanproject.BuildConfig;

import timber.log.Timber;

/**
 * Created by Voltek on 25/07/2017.
 */

public class AppLogger {

    public static void init(){
        if(BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree());
        }
    }

    public static void d(String s, Object... objects) { Timber.d(s, objects);}

    public static void d(Throwable throwable, String s, Object... objects){
        Timber.d(throwable,s, objects);
    }

    public static void i(String s, Object... objects) { Timber.i(s, objects);}

    public static void i(Throwable throwable, String s, Object... objects){
        Timber.i(throwable,s, objects);
    }

    public static void w(String s, Object... objects) { Timber.w(s, objects);}

    public static void w(Throwable throwable, String s, Object... objects){
        Timber.w(throwable,s, objects);
    }

    public static void e(String s, Object... objects) { Timber.e(s, objects);}

    public static void e(Throwable throwable, String s, Object... objects){
        Timber.e(throwable,s, objects);
    }





}
