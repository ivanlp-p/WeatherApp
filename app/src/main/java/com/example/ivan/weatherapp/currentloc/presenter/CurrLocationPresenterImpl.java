package com.example.ivan.weatherapp.currentloc.presenter;

import android.content.Context;
import android.util.Log;

import com.example.ivan.weatherapp.currentloc.model.LocationEntity;
import com.example.ivan.weatherapp.currentloc.view.CurrLocationView;
import com.example.ivan.weatherapp.net.OpenWeatherMapApi;
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public class CurrLocationPresenterImpl
        extends MvpBasePresenter<CurrLocationView>
        implements CurrLocationPresenter {
    private Context context;
    private OpenWeatherMapApi openWeatherMapApi;
    private LocationEntity locationEntity;

    @Inject
    public CurrLocationPresenterImpl(Context context, OpenWeatherMapApi openWeatherMapApi) {
        this.context = context;
        this.openWeatherMapApi = openWeatherMapApi;

    }

    @Override
    public void attachView(CurrLocationView view) {
        super.attachView(view);
    }

    @Override
    public void loadWeatherInfo() {



            //  LocationManager locationManager = context.getSystemService(Context.LOCATION_SERVICE);

            Call<LocationEntity> call = openWeatherMapApi.getCurrentLocation(String.valueOf(35), String.valueOf(140));
            call.enqueue(new Callback<LocationEntity>() {

                @Override
                public void onResponse(Call<LocationEntity> call, Response<LocationEntity> response) {
                    locationEntity = response.body();

                    if (isViewAttached()) {
                        String city = locationEntity.getCity().getName();
                        int temp = (int)locationEntity.getList().get(0).getMain().getTemp();

                        getView().showTemp(city, temp);
                    }
                }

                @Override
                public void onFailure(Call<LocationEntity> call, Throwable t) {
                    t.printStackTrace();
                }
            });


    }
}
