package com.example.ivan.weatherapp.main.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ivan.weatherapp.R;
import com.example.ivan.weatherapp.common.WeatherApplication;
import com.example.ivan.weatherapp.databinding.ActivityMainBinding;
import com.example.ivan.weatherapp.main.presenter.MainPresenter;
import com.hannesdorfmann.mosby.mvp.MvpActivity;

public class MainActivity
        extends MvpActivity<MainView, MainPresenter>
        implements MainView
{

    private ActivityMainBinding binding;

    @NonNull
    @Override
    public MainPresenter createPresenter() {
        return ((WeatherApplication) getApplication()).component().mainPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((WeatherApplication) getApplication()).component().inject(this);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
