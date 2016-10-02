package com.example.ivan.weatherapp.location;

import android.location.Location;

/**
 * Created by I.Laukhin on 22.09.2016.
 */

public abstract class ILocationListener {

    private static final String TAG_ET = "TAG_ET";
    public static final int TIME_OUT = 100 * 1000;
    public static final long HALF_MINUTE  = 30 * 1000;

    public static final int MILLISECONDS_PER_SECOND = 1000;

    // колличество секунд для обновелния
    public static final int UPDATE_INTERVAL_IN_SECONDS = 5;


    //колличество секунд, для обновления в активном режиме
    public static final int FAST_CEILING_IN_SECONDS = 1;

    // интервал обновления в милисекундах
    public static final long UPDATE_INTERVAL_IN_MILLISECONDS =
            MILLISECONDS_PER_SECOND * UPDATE_INTERVAL_IN_SECONDS;

    // Интервал  обновления, кода приложения видно
    public static final long FAST_INTERVAL_CEILING_IN_MILLISECONDS =
            MILLISECONDS_PER_SECOND * FAST_CEILING_IN_SECONDS;

    protected LocationRunnable locationRunnable;


    /**
     * Включает определение месоположения
     */
    public abstract void startLocationUpdate();

    /**
     * Прекращает определение местоположения
     */
    public abstract void stopLocationUpdate();

    public interface LocationRunnable
    {
        /**
         * Вызывается, когда местоположение пользователя определяется
         *
         * @param location местоположение пользователя
         */
        void locationUpdate(Location location);
    }


    /**
     * Устанавливает слушателя на событие нахождения местоположения пользователя
     *
     * @param locationRunnable слушатель
     */
    public void setLocationRunnable(LocationRunnable locationRunnable)
    {
        this.locationRunnable = locationRunnable;
    }
}
