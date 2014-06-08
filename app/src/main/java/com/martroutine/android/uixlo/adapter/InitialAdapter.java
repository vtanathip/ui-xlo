package com.martroutine.android.uixlo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MARTROUTINE on 08/06/2014.
 */
public class InitialAdapter extends FragmentPagerAdapter {

    public static final String TAG = "UIXLO";

    protected static final List<Fragment> list = new ArrayList<Fragment>() {
        {

        }
    };


    public InitialAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
