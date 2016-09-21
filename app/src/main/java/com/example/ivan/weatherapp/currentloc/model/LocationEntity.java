package com.example.ivan.weatherapp.currentloc.model;

import java.util.ArrayList;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public class LocationEntity {

    public City city;

    public ArrayList<List> list;

    public LocationEntity(){
    }

    public LocationEntity(City city, ArrayList<List> list) {
        this.city = city;
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public ArrayList<List> getList() {
        return list;
    }
}
