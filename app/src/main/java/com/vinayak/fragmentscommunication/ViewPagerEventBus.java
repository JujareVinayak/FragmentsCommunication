package com.vinayak.fragmentscommunication;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerEventBus extends FragmentPagerAdapter {
    private static final String[] TAB_TITLES = new String[]{ "First", "Second"};
    private final Context mContext;
    public ViewPagerEventBus(Context context, FragmentManager fm) {
       super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        if (position == 0) {
            return FirstFragmentEventBus.Companion.getInstance();
        } else {
            return SecondFragmentEventBus.Companion.getInstance();
        }
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TAB_TITLES[position];
    }
    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}
