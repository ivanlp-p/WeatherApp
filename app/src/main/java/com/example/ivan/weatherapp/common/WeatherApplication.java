package com.example.ivan.weatherapp.common;

import android.app.Application;

import com.example.ivan.weatherapp.currentloc.presenter.CurrLocationPresenterImpl;
import com.example.ivan.weatherapp.main.view.MainActivity;
import com.example.ivan.weatherapp.main.presenter.MainPresenterImpl;

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
    }

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggegWeatherApplication_ApplicationComponent
                .builder()
                .androidModule(new AndroidModule(this))
                .build();
    }

    public ApplicationComponent component() { return component;}
}
