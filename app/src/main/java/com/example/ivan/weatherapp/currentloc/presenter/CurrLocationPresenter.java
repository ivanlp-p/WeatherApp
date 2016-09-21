package com.example.ivan.weatherapp.currentloc.presenter;

import com.example.ivan.weatherapp.currentloc.view.CurrLocationView;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public interface CurrLocationPresenter extends MvpPresenter<CurrLocationView> {

    void loadWeatherInfo();
}
