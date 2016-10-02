package com.example.ivan.weatherapp.common;

import android.app.Application;

import com.example.ivan.weatherapp.cities.list.presenter.CitiesListPresenterImpl;
import com.example.ivan.weatherapp.currentloc.presenter.CurrLocationPresenterImpl;
import com.example.ivan.weatherapp.main.view.MainActivity;
import com.example.ivan.weatherapp.main.presenter.MainPresenterImpl;

import net.danlew.android.joda.JodaTimeAndroid;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public class WeatherApplication extends Application {
    private ApplicationComponent component;

    @Singleton
    @Component(modules = {
            AndroidModule.class,
            NetModule.class})
    public interface ApplicationComponent {
        void inject(MainActivity activity);

        CurrLocationPresenterImpl currLocationPresenter();
        MainPresenterImpl mainPresenter();
        CitiesListPresenterImpl citiesListPresenter();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        JodaTimeAndroid.init(this);

        component = DaggerWeatherApplication_ApplicationComponent
                .builder()
                .androidModule(new AndroidModule(this))
                .build();
    }

    public ApplicationComponent component() { return component;}
}
