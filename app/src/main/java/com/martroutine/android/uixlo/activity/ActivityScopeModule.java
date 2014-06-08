package com.martroutine.android.uixlo.activity;

import android.content.Context;

import com.martroutine.android.common.skeleton.qualifier.ForActivity;
import com.martroutine.android.uixlo.app.ApplicationScopeModule;
import com.martroutine.android.uixlo.fragment.InstructionCategory;
import com.martroutine.android.uixlo.fragment.InstructionMember;
import com.martroutine.android.uixlo.fragment.InstructionSell;
import com.martroutine.android.uixlo.fragment.InstructionWelcome;

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
                InitialActivity.class,
                InstructionCategory.class,
                InstructionSell.class,
                InstructionMember.class,
                InstructionWelcome.class
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
