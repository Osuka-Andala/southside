package com.southside.osuka.southside;

/**
 * Created by osuka on 8/11/16.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm){
        super (fm);
    }

    @Override
    public Fragment getItem(int poston){
        return new TabFragment();
    }

    @Override
    public int getCount(){
        return 3;
    }
}
