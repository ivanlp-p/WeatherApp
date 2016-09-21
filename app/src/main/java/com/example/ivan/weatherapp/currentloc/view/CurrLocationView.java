package com.example.ivan.weatherapp.currentloc.view;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public interface CurrLocationView extends MvpView {

    void showTemp(String city, int temp);
}
