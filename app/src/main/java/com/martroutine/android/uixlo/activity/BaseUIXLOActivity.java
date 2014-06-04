package com.martroutine.android.uixlo.activity;

import com.martroutine.android.common.skeleton.activity.BaseActivity;

/**
 * Created by MARTROUTINE on 04/06/2014.
 */
public class BaseUIXLOActivity extends BaseActivity {
    public static final String TAG = "UIXLO";
    @Override
    protected Object[] geActivitytModules() {
        return new Object[]{
                new ActivityScopeModule(this)
        };
    }
}
