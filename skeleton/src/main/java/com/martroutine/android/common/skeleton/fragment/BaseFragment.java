package com.martroutine.android.common.skeleton.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.martroutine.android.common.skeleton.activity.BaseActivity;

/**
 * Created by MARTROUTINE on 04/06/2014.
 */
public class BaseFragment extends Fragment{
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Assume that it lives within a BaseActivity host
        ((BaseActivity) getActivity()).inject(this);
    }
}
