package com.martroutine.android.uixlo.app;

import com.martroutine.android.common.skeleton.android.AndroidAppModule;

import dagger.Module;

/**
 * Created by MARTROUTINE on 04/06/2014.
 */
@Module(
        complete = true,
        library = true,
        addsTo = AndroidAppModule.class,
        injects = {
                BaseXLOApplication.class
        }
)
public class ApplicationScopeModule {
}
