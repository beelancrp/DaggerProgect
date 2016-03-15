package com.beelancrp.daggerproject.App;

import android.app.Application;

import com.beelancrp.daggerproject.DI.component.AppComponent;
import com.beelancrp.daggerproject.DI.component.DaggerAppComponent;
import com.beelancrp.daggerproject.DI.modules.ApiModule;
import com.beelancrp.daggerproject.DI.modules.AppModule;

/**
 * Created by beeLAN on 15.03.2016.
 */
public class ApplicationDagger extends Application {
    private static AppComponent appComponent;

    public static AppComponent getAppComponent(){
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule("https://budabi.com"))
                .build();
    }
}
