package com.martroutine.android.common.skeleton.activity;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.martroutine.android.common.skeleton.app.XLOApplication;
import com.martroutine.android.common.skeleton.plate.DaggerInjector;

import dagger.ObjectGraph;

/**
 * Created by MARTROUTINE on 04/06/2014.
 */
public abstract class BaseActivity extends SherlockFragmentActivity implements DaggerInjector{
    private ObjectGraph mActivityGraph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        XLOApplication application = (XLOApplication) getApplication();
        mActivityGraph = application.getObjectGraph().plus(geActivitytModules());

        mActivityGraph.inject(this);
    }

    @Override
     protected void onDestroy() {
        mActivityGraph = null;
        super.onDestroy();
    }

    @Override
    public void inject(Object object) {
        mActivityGraph.inject(object);
    }

    public ObjectGraph getObjectGraph() {
        return mActivityGraph;
    }

    protected abstract Object[] geActivitytModules();
}
