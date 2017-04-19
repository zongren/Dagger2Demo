package me.zongren.dagger2demo;

import android.app.Application;

import dagger.Component;
import dagger.Provides;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjectionModule;

/**
 * Created by zongren on 2017/4/19.
 * All right reserved by 正奇晟业（北京）科技有限公司
 */
@Component(modules = {MainActivityModule.class, AndroidInjectionModule.class})
public interface MainApplicationComponent {
    void inject(MainApplication mainApplication);
}
