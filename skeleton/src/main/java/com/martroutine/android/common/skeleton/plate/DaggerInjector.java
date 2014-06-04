package com.martroutine.android.common.skeleton.plate;

import dagger.ObjectGraph;

/**
 * Created by MARTROUTINE on 04/06/2014.
 */
public interface DaggerInjector {
    void inject(Object object);
    ObjectGraph getObjectGraph();
}
