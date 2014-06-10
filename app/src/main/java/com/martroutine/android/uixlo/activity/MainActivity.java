package com.martroutine.android.uixlo.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.martroutine.android.ui_xlo.app.R;
import com.martroutine.android.uixlo.adapter.TabAdapter;


public class MainActivity extends BaseUIXLOActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar mActionBar = getSupportActionBar();
        LayoutInflater mInflater = LayoutInflater.from(this);
        View mCustomView = mInflater.inflate(R.layout.custom_actionbar, null);
        mActionBar.setCustomView(mCustomView);
        mActionBar.setDisplayShowCustomEnabled(true);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        } 
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public static class PlaceholderFragment extends SherlockFragment implements ActionBar.TabListener {

        private ViewPager viewPager;
        private ActionBar actionBar;
        private TabAdapter mAdapter;
        private String[] tabs;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            tabs = getResources().getStringArray(R.array.tab_name);
            viewPager = (ViewPager) rootView.findViewById(R.id.pager);

            actionBar = getSherlockActivity().getSupportActionBar();
            mAdapter = new TabAdapter(getActivity().getSupportFragmentManager());

            viewPager.setAdapter(mAdapter);
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

            for (int i = 0; i< tabs.length; i++) {
                View customView = inflater.inflate(R.layout.custom_actionbar_tab, container, false);
                ImageView customImageView = (ImageView) customView.findViewById(R.id.tabImageView);

                switch (i) {
                    case 0:  customImageView.setImageResource(R.drawable.category);
                        break;
                    case 1:  customImageView.setImageResource(R.drawable.announcement);
                        break;
                    case 2:  customImageView.setImageResource(R.drawable.member);
                        break;
                }

                TextView customTextView = (TextView) customView.findViewById(R.id.tabTextView);
                customTextView.setText(tabs[i]);
                actionBar.addTab(actionBar.newTab().setCustomView(customView).setTabListener(this));
                Log.d(TAG, "MainActivity add tab : " + tabs[i]);
            }

            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                @Override
                public void onPageSelected(int position) {
                    actionBar.setSelectedNavigationItem(position);
                }

                @Override
                public void onPageScrollStateChanged(int state) {
                }
            });


            return rootView;
        }

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }
    }
}
