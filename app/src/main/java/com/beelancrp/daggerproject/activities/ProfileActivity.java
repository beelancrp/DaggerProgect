package com.beelancrp.daggerproject.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.beelancrp.daggerproject.App.ApplicationDagger;
import com.beelancrp.daggerproject.DI.component.AppComponent;
import com.beelancrp.daggerproject.DI.component.DaggerProfileComponent;
import com.beelancrp.daggerproject.DI.component.ProfileComponent;
import com.beelancrp.daggerproject.DI.modules.ProfileModule;
import com.beelancrp.daggerproject.pojo.ProfileData;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by bilan on 23.03.2016.
 */
public class ProfileActivity extends AppCompatActivity {

    @Inject
    ArrayList<ProfileData> profilesList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppComponent appComponent = ApplicationDagger.getAppComponent();
        ProfileComponent component = DaggerProfileComponent.builder()
                .appComponent(appComponent)
                .profileModule(new ProfileModule())
                .build();
        component.inject(this);
    }
}
