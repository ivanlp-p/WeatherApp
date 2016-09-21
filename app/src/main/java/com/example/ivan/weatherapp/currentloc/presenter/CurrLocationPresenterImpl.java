package com.example.ivan.weatherapp.currentloc.presenter;

import android.content.Context;

import com.example.ivan.weatherapp.currentloc.model.LocationEntity;
import com.example.ivan.weatherapp.currentloc.view.CurrLocationView;
import com.example.ivan.weatherapp.net.OpenWeatherMapApi;
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

import javax.inject.Inject;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public class CurrLocationPresenterImpl
        extends MvpBasePresenter<CurrLocationView>
        implements CurrLocationPresenter
{
    private Context context;
    private OpenWeatherMapApi openWeatherMapApi;

    @Inject
    public CurrLocationPresenterImpl(Context context, OpenWeatherMapApi openWeatherMapApi) {
        this.context = context;
        this.openWeatherMapApi = openWeatherMapApi;

    }

    @Override
    public void loadWeatherInfo() {

        if (isViewAttached()){

          //  LocationManager locationManager = context.getSystemService(Context.LOCATION_SERVICE);


            LocationEntity locationEntity = (LocationEntity) openWeatherMapApi.getCurrentLocation(String.valueOf(34), String.valueOf(140));

            String city = locationEntity.getCity().getName();
            int temp = locationEntity.getList().get(0).getMain().getTemp();
        }

    }
}
