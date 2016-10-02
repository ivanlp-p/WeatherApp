package com.example.ivan.weatherapp.utils;

import android.util.Log;

import com.example.ivan.weatherapp.currentloc.model.List;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Created by I.Laukhin on 02.10.2016.
 */

public class WeatherForDayHelper {

    public WeatherForDayHelper() {
    }

    public List morningTemp (ArrayList<List> listWeather) {
        List morningList = null;
        DateTime currentTime = new DateTime(listWeather.get(0).dt * 1000);
        int currentDay = currentTime.getDayOfMonth();

        for (int i = 0; i < listWeather.size(); i++) {
            DateTime time = new DateTime(listWeather.get(i).dt * 1000);
            if (time.getDayOfMonth() == currentDay){
                if (time.getHourOfDay() > 3 && time.getHourOfDay() < 12) {
                    morningList = listWeather.get(i);
                }
            } else if (morningList == null && time.getDayOfMonth() == (currentDay + 1)) {
                if (time.getHourOfDay() > 3 && time.getHourOfDay() < 12) {
                    morningList = listWeather.get(i);
                }
            }

        }
        DateTime morningTime = new DateTime(morningList.dt * 1000);
        Log.d("hour", "morning time = " + morningTime);
        Log.d("hour", "morning hour = " + morningTime.getHourOfDay());
        Log.d("hour", "morning day = " + morningTime.getDayOfMonth());
        return morningList;
    }

    public List afternoonTemp (ArrayList<List> listWeather) {
        List afternoonList = null;
        DateTime currentTime = new DateTime(listWeather.get(0).dt * 1000);
        int currentDay = currentTime.getDayOfMonth();

        for (int i = 0; i < listWeather.size(); i++) {
            DateTime time = new DateTime(listWeather.get(i).dt * 1000);
            if (time.getDayOfMonth() == currentDay){
                if (time.getHourOfDay() > 11 && time.getHourOfDay() < 16) {
                    afternoonList = listWeather.get(i);
                }
            } else if (afternoonList == null && time.getDayOfMonth() == (currentDay + 1)) {
                if (time.getHourOfDay() > 11 && time.getHourOfDay() < 16) {
                    afternoonList = listWeather.get(i);
                }
            }

        }
        DateTime afternoonTime = new DateTime(afternoonList.dt * 1000);
        Log.d("hour", "afternoon time = " + afternoonTime);
        Log.d("hour", "afternoon hour = " + afternoonTime.getHourOfDay());
        Log.d("hour", "afternoon day = " + afternoonTime.getDayOfMonth());
        return afternoonList;
    }

    public List eveningTemp (ArrayList<List> listWeather) {
        List eveningList = null;
        DateTime currentTime = new DateTime(listWeather.get(0).dt * 1000);
        int currentDay = currentTime.getDayOfMonth();

        for (int i = 0; i < listWeather.size(); i++) {
            DateTime time = new DateTime(listWeather.get(i).dt * 1000);
            if (time.getDayOfMonth() == currentDay){
                if (time.getHourOfDay() > 15 && time.getHourOfDay() < 24) {
                    eveningList = listWeather.get(i);
                }
            } else if (eveningList == null && time.getDayOfMonth() == (currentDay + 1)) {
                if (time.getHourOfDay() > 15 && time.getHourOfDay() < 24) {
                    eveningList = listWeather.get(i);
                }
            }

        }
        DateTime eveningTime = new DateTime(eveningList.dt * 1000);
        Log.d("hour", "evening time = " + eveningTime);
        Log.d("hour", "evening hour = " + eveningTime.getHourOfDay());
        Log.d("hour", "evening day = " + eveningTime.getDayOfMonth());
        return eveningList;
    }
}
