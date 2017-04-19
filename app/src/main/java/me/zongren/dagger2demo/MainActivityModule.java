package me.zongren.dagger2demo;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by zongren on 2017/4/19.
 * All right reserved by 正奇晟业（北京）科技有限公司
 */
@Module(subcomponents = MainActivitySubcomponent.class)
 abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);


}