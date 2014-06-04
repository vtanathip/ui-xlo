package com.martroutine.android.uixlo.activity;

import android.content.Context;

import com.martroutine.android.common.skeleton.qualifier.ForActivity;
import com.martroutine.android.uixlo.app.ApplicationScopeModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by MARTROUTINE on 04/06/2014.
 */
@Module(
        complete = true,
        library = true,
        addsTo = ApplicationScopeModule.class,
        injects = {
                MainActivity.class,
        }
)
public class ActivityScopeModule {
    private final BaseUIXLOActivity mActivity;
    public ActivityScopeModule(BaseUIXLOActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    @Singleton
    @ForActivity
    Context providesActivityContext() {
        return mActivity;
    }
}
