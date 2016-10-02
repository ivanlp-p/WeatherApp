package com.example.ivan.weatherapp.currentloc.model;

import java.util.ArrayList;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public class List {

    public long dt;

    public Main main;

    public ArrayList <Weather> weather;

    public String dt_txt;

    public List(){
    }

    public List(long dt, Main main, ArrayList<Weather> weather, String dt_txt) {
        this.dt = dt;
        this.main = main;
        this.weather = weather;
        this.dt_txt = dt_txt;
    }

    public long getDt() {
        return dt;
    }

    public Main getMain() {
        return main;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public String getDt_txt() {
        return dt_txt;
    }
}
