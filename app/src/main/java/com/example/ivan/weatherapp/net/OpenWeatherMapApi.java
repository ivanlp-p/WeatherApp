package com.example.ivan.weatherapp.net;

import com.example.ivan.weatherapp.currentloc.model.LocationEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public interface OpenWeatherMapApi {

    String BASE_URL = "http://api.openweathermap.org/data/2.5/";

    @GET("forecast?units=metric&appid=7ddcdff6cef78986dee096d75b1ae6f0")
    Call<LocationEntity> getCurrentLocation(@Query("lat") String lat, @Query("lon") String lon);
}
