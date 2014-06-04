package com.martroutine.android.common.skeleton.android;

import android.content.Context;

import com.martroutine.android.common.skeleton.qualifier.ForApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by MARTROUTINE on 04/06/2014.
 */
@Module(library = true)
public class AndroidAppModule {
    public static final String UIXLO = "UIXLO";
    public static Context sApplicationContext = null;

    @Provides
    @Singleton
    @ForApplication
    Context provideApplicationContext() {
        return sApplicationContext;
    }
}
