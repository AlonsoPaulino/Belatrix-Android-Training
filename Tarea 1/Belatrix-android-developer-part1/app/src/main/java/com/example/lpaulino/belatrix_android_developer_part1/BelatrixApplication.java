package com.example.lpaulino.belatrix_android_developer_part1;

import android.app.Application;
import android.content.Context;

/**
 * Created by lpaulino on 3/01/17.
 */

public class BelatrixApplication extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
