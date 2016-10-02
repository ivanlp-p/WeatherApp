package com.example.ivan.weatherapp.cities.list.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ivan.weatherapp.R;
import com.example.ivan.weatherapp.cities.list.presenter.CitiesListPresenter;
import com.example.ivan.weatherapp.common.WeatherApplication;
import com.example.ivan.weatherapp.databinding.FragmentCitiesBinding;
import com.hannesdorfmann.mosby.mvp.MvpFragment;

/**
 * Created by I.Laukhin on 24.09.2016.
 */

public class CitiesListFragment
        extends MvpFragment<CitiesListView, CitiesListPresenter>
        implements CitiesListView
{
    private FragmentCitiesBinding binding;

    @Override
    public CitiesListPresenter createPresenter() {
        return ((WeatherApplication) getActivity().getApplication()).component().citiesListPresenter();
    }

    public CitiesListFragment newInstance() {
        return new CitiesListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cities, container, false);

        return binding.getRoot();
    }
}
