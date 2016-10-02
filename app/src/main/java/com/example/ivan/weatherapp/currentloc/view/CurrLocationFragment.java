package com.example.ivan.weatherapp.currentloc.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ivan.weatherapp.R;
import com.example.ivan.weatherapp.common.WeatherApplication;
import com.example.ivan.weatherapp.currentloc.model.List;
import com.example.ivan.weatherapp.currentloc.presenter.CurrLocationPresenter;
import com.example.ivan.weatherapp.databinding.FragmentCurrLocationBinding;
import com.hannesdorfmann.mosby.mvp.MvpFragment;
import com.squareup.picasso.Picasso;

/**
 * Created by I.Laukhin on 21.09.2016.
 */

public class CurrLocationFragment
        extends MvpFragment<CurrLocationView, CurrLocationPresenter>
        implements CurrLocationView
{


    private FragmentCurrLocationBinding binding;

    @Override
    public CurrLocationPresenter createPresenter() {
        return ((WeatherApplication) getActivity().getApplication()).component().currLocationPresenter();
    }

    public static CurrLocationFragment newInstance(){
        return new CurrLocationFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_curr_location, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getPresenter().loadWeatherInfo();
    }

    @Override
    public void showTemp(String city, String picture, int temp) {
        Picasso.with(getContext()).load("http://openweathermap.org/img/w/" + picture + ".png").into(binding.picture);
        binding.cityName.setText(city);
        binding.temputure.setText(temp + " °С");
    }

    @Override
    public void showMorningTemp(List list) {
        Picasso.with(getContext()).load("http://openweathermap.org/img/w/" + list.getWeather().get(0).getIcon() + ".png").into(binding.picMorning);
        binding.temputureMorning.setText((int) list.getMain().getTemp() + " °С");
    }

    @Override
    public void showAfternoonTemp(List list) {
        Picasso.with(getContext()).load("http://openweathermap.org/img/w/" + list.getWeather().get(0).getIcon() + ".png").into(binding.picAfternoon);
        binding.temputureAfternoon.setText((int) list.getMain().getTemp() + " °С");
    }

    @Override
    public void showEveningTemp(List list) {
        Picasso.with(getContext()).load("http://openweathermap.org/img/w/" + list.getWeather().get(0).getIcon() + ".png").into(binding.picEvening);
        binding.temputureEvening.setText((int) list.getMain().getTemp() + " °С");
    }
}
