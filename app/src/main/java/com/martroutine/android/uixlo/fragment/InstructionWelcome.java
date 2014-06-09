package com.martroutine.android.uixlo.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.martroutine.android.common.skeleton.fragment.BaseFragment;
import com.martroutine.android.ui_xlo.app.R;
import com.martroutine.android.uixlo.activity.MainActivity;
import com.martroutine.android.uixlo.custom.CustomButton;

/**
 * Created by MARTROUTINE on 08/06/2014.
 */
public class InstructionWelcome extends BaseFragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View inflateView = inflater.inflate(R.layout.viewpagger_welcome, container, false);
        CustomButton customButton = (CustomButton) inflateView.findViewById(R.id.instruction_welcome_button);
        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        return inflateView;
    }

}
