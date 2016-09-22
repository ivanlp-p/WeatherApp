package com.example.ivan.weatherapp.currentloc.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ivan.weatherapp.R;
import com.example.ivan.weatherapp.common.WeatherApplication;
import com.example.ivan.weatherapp.currentloc.presenter.CurrLocationPresenter;
import com.example.ivan.weatherapp.databinding.FragmentCurrLocationBinding;
import com.hannesdorfmann.mosby.mvp.MvpFragment;

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

        presenter = createPresenter();
        presenter.attachView(this);
        presenter.loadWeatherInfo();

        return binding.getRoot();
    }

    @Override
    public void showTemp(String city, int temp) {
        binding.cityName.setText(city);
        binding.temputure.setText(temp + " °С");
    }


}
