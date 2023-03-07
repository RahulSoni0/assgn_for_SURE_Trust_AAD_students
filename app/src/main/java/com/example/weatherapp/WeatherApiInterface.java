package com.example.weatherapp;

import com.example.weatherapp.ModelInJava.ModelResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApiInterface {


    //    https://api.openweathermap.org/data/2.5/
//    https://api.openweathermap.org/data/2.5/weather?q=chennai&appid=9149a4b800b22d122db23466a39b3989&units=metric
    @GET("weather")
    Call<ModelResponse> getWeather(@Query("q") String cityName,
                                   @Query("appid") String apikey,
                                   @Query("units") String unit);



}
