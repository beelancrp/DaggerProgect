package com.beelancrp.daggerproject.DI.component;

import com.beelancrp.daggerproject.DI.modules.ProfileModule;
import com.beelancrp.daggerproject.DI.supports.Cycles;
import com.beelancrp.daggerproject.DI.supports.Lifecycle;
import com.beelancrp.daggerproject.activities.ProfileActivity;

import dagger.Component;

/**
 * Created by bilan on 23.03.2016.
 */
@Component(
        modules = ProfileModule.class,
        dependencies = AppComponent.class
)
@Lifecycle(Cycles.ACTIVITY)
public interface ProfileComponent {
    void inject(ProfileActivity activity);
}
