package com.martroutine.android.uixlo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.martroutine.android.uixlo.fragment.CategoryFragment;
import com.martroutine.android.uixlo.fragment.MemberFragment;
import com.martroutine.android.uixlo.fragment.PostFragment;

/**
 * Created by MARTROUTINE on 09/06/2014.
 */
public class TabAdapter extends FragmentPagerAdapter {
    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CategoryFragment();
            case 1:
                return new PostFragment();
            case 2:
                return new MemberFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}