package com.example.ivan.weatherapp.common;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

@Module
public class AndroidModule {
    private final WeatherApplication application;

    public AndroidModule(WeatherApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Context providesContext() {return application;}
}
