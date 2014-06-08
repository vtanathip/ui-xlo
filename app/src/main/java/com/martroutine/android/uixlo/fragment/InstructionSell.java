package com.martroutine.android.uixlo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.martroutine.android.common.skeleton.fragment.BaseFragment;
import com.martroutine.android.ui_xlo.app.R;

/**
 * Created by MARTROUTINE on 08/06/2014.
 */
public class InstructionSell extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.viewpagger_sell, container, false);
    }
}
