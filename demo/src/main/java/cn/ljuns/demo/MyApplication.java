package cn.ljuns.demo;

import android.app.Application;
import android.graphics.Color;

import cn.ljuns.logcollector.LogCollector;

/**
 * Created by ljuns on 2018/8/18
 * I am just a developer.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LogCollector.getInstance()
//                .setLogType(TagUtils.DEBUG)
                .setCleanCache(true)
                .setLogcatColors(R.color.colorAccent, R.color.colorPrimaryDark, Color.RED, Color.GREEN)
                .start(this);
    }
}