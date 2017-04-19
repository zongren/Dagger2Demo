package me.zongren.dagger2demo;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by zongren on 2017/4/19.
 * All right reserved by 正奇晟业（北京）科技有限公司
 */

public class MainApplication extends Application implements HasDispatchingActivityInjector{
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerMainApplicationComponent.create().inject(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
