package com.example.ivan.weatherapp.cities.list.presenter;

import com.example.ivan.weatherapp.cities.list.view.CitiesListView;
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

import javax.inject.Inject;

/**
 * Created by I.Laukhin on 24.09.2016.
 */

public class CitiesListPresenterImpl
        extends MvpBasePresenter<CitiesListView>
        implements CitiesListPresenter
{
    @Inject
    public CitiesListPresenterImpl() {
    }
}
