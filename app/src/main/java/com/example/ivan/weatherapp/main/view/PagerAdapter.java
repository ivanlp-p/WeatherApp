package com.example.ivan.weatherapp.main.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.ivan.weatherapp.cities.list.view.CitiesListFragment;
import com.example.ivan.weatherapp.currentloc.view.CurrLocationFragment;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        if (position == 0) {
            fragment =  new CurrLocationFragment().newInstance();
        } else if (position == 1) {
            fragment = new CitiesListFragment().newInstance();
        }
        /*switch (position) {
            case 0:
                fragment = new CurrLocationFragment().newInstance();
            case 1:
                fragment = new CitiesListFragment().newInstance();
        }*/

        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";

        if (position == 0) {
            title = "Текущее местоположение";
        } else if (position == 1) {
            title = "Другие города";
        }

     /*   switch (position) {
            case 0:
                title = "Текущее местоположение";
            case 1:
                title = "Другие города";
        }*/

        return title;
    }
}
