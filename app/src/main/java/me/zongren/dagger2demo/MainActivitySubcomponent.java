package me.zongren.dagger2demo;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by zongren on 2017/4/19.
 * All right reserved by 正奇晟业（北京）科技有限公司
 */

@Subcomponent()
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity>{};
}
