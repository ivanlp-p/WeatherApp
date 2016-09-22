package com.example.ivan.weatherapp.main.presenter;

import android.content.Context;

import com.example.ivan.weatherapp.main.view.MainView;
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

import javax.inject.Inject;

/**
 * Created by I.Laukhin on 20.09.2016.
 */

public class MainPresenterImpl extends MvpBasePresenter<MainView> implements MainPresenter {

    private Context context;

    @Inject
    public MainPresenterImpl(Context context) {
        this.context = context;
    }
}
