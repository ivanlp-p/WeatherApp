package com.example.ivan.weatherapp.currentloc.view;

import com.example.ivan.weatherapp.currentloc.model.List;
import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public interface CurrLocationView extends MvpView {

    void showTemp(String city, String picture, int temp);

    void showMorningTemp(List list);

    void showAfternoonTemp(List list);

    void showEveningTemp(List list);
}
