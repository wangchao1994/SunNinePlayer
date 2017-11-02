package com.we.rightmusicplayer;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/**
 * Created by wangchao on 17-11-1.
 */

public class App extends Application implements Application.ActivityLifecycleCallbacks {
    public static App app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {

    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }
}
