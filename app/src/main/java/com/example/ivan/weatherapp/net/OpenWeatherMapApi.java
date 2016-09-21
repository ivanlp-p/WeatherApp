package com.example.ivan.weatherapp.net;

import com.example.ivan.weatherapp.currentloc.model.LocationEntity;

import retrofit2.Call;
import retrofit2.http.Path;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public interface OpenWeatherMapApi {

    String BASE_URL = "http://api.openweathermap.org/data/2.5/forecast?l";

    Call<LocationEntity> getCurrentLocation(@Path("lat") String lat, @Path("lon") String lon);
}
