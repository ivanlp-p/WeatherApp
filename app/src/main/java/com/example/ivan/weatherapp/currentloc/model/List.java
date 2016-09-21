package com.example.ivan.weatherapp.currentloc.model;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public class List {

    public Main main;

    public String dt_txt;

    public List(){
    }

    public List(Main main, String dt_txt) {
        this.main = main;
        this.dt_txt = dt_txt;
    }

    public Main getMain() {
        return main;
    }

    public String getDt_txt() {
        return dt_txt;
    }
}
