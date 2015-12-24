package com.anupbipinkiranprastab.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anupbipinkiranprastab.i_care.R;

/**
 * Created by bipin on 12/25/15.
 */
public class FoodFragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment1_food, container, false);

        return view;
    }
}
