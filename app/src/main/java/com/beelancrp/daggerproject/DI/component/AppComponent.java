package com.beelancrp.daggerproject.DI.component;

import android.content.Context;
import android.content.SharedPreferences;

import com.beelancrp.daggerproject.DI.modules.ApiModule;
import com.beelancrp.daggerproject.DI.modules.AppModule;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by beeLAN on 15.03.2016.
 */
@Component (modules = {AppModule.class, ApiModule.class})
@Singleton
public interface AppComponent extends ApiComponent {

    Context context();
    SharedPreferences sharedPreferences();
    Executor executor();
}
