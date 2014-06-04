package com.martroutine.android.uixlo.app;

import com.martroutine.android.common.skeleton.app.XLOApplication;

import java.util.Collections;
import java.util.List;

/**
 * Created by MARTROUTINE on 04/06/2014.
 */
public class BaseXLOApplication extends XLOApplication{
    @Override
    protected List<Object> getAppModules() {
        return Collections.<Object>singletonList(new ApplicationScopeModule());
    }
}
