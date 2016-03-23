package com.beelancrp.daggerproject.DI.modules;

import com.beelancrp.daggerproject.DI.supports.Cycles;
import com.beelancrp.daggerproject.DI.supports.Lifecycle;
import com.beelancrp.daggerproject.mocks.MockServiceProfile;
import com.beelancrp.daggerproject.pojo.ProfileData;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bilan on 23.03.2016.
 */
@Module
public class ProfileModule {

    @Provides
    @Lifecycle(Cycles.ACTIVITY)
    ArrayList<ProfileData> provideProfilesList(){
        return MockServiceProfile.getInstance().getProfilesList();
    }
}
