package me.zongren.dagger2demo;

import javax.inject.Inject;

import dagger.Provides;

/**
 * Created by zongren on 2017/4/19.
 * All right reserved by 正奇晟业（北京）科技有限公司
 */

public class Generator {
    @Inject
    public Generator() {
    }

    public String generate(){
        return String.valueOf(Math.ceil(Math.random() * 99999));
    }
}
