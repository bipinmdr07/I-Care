package com.anupbipinkiranprastab.adapters;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.anupbipinkiranprastab.fragments.FoodFragment1;
import com.anupbipinkiranprastab.fragments.FoodFragment2;
import com.anupbipinkiranprastab.fragments.FoodFragment3;


public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm){
        super(fm);
    }

    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new FoodFragment1();
            case 1:
                return new FoodFragment2();
            case 2:
                return new FoodFragment3();
        }
        return null;
    }
}
