package com.martroutine.android.uixlo.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.martroutine.android.ui_xlo.app.R;
import com.martroutine.android.uixlo.adapter.InitialAdapter;
import com.viewpagerindicator.LinePageIndicator;

import javax.inject.Inject;

/**
 * Created by MARTROUTINE on 08/06/2014.
 */
public class InitialActivity extends BaseUIXLOActivity{

    @Inject
    public SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "InitialActivity onCreate.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        // comment this for testing instruction page
        /*if (sharedPreferences.getBoolean("firstrun", true)) {*/
            sharedPreferences.edit().putBoolean("firstrun", false).commit();

            if (savedInstanceState == null) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, new ViewPaggerHolderFragment())
                        .commit();
                Log.d(TAG, "Attach ViewPagger to InitialActivity.");
            }

        /*} else {
            Intent intent = new Intent(this, MainActivity.class);
            Log.d(TAG, "Start MainActivity.");
            startActivity(intent);
            this.finish();
            Log.d(TAG, "InitialActivity finished.");
        }*/

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "In further InitialActivity onBackPressed will do nothing.");
    }

    public static class ViewPaggerHolderFragment extends Fragment {

        private ViewPager viewPager;
        private LinePageIndicator linePageIndicator;
        private InitialAdapter initialAdapter;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            Log.d(TAG, "InitialActivity inner class onCreateView.");

            View rootView = inflater.inflate(R.layout.fragment_initial, container, false);

            viewPager = (ViewPager) rootView.findViewById(R.id.pager);
            linePageIndicator = (LinePageIndicator) rootView.findViewById(R.id.indicator);

            initialAdapter = new InitialAdapter(getActivity().getSupportFragmentManager());

            viewPager.setAdapter(initialAdapter);

            linePageIndicator.setViewPager(viewPager);

            return rootView;
        }

    }
}
