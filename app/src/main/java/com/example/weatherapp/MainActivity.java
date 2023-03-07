package com.example.weatherapp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.weatherapp.ModelInJava.ModelResponse;
import com.example.weatherapp.databinding.ActivityMainBinding;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.openweathermap.org/data/2.5/").addConverterFactory(GsonConverterFactory.create()).build();

        WeatherApiInterface apiInterface = retrofit.create(WeatherApiInterface.class);


        binding.searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog = ProgressDialog.show(MainActivity.this, "Loading", "Please wait...", true);

                try {
                    InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }

                if (!binding.cityName.getText().toString().trim().equals("")) {
                    Call<ModelResponse> call = apiInterface.getWeather(binding.cityName.getText().toString(), "9149a4b800b22d122db23466a39b3989", "metric");
                    call.enqueue(new Callback<ModelResponse>() {
                        @Override
                        public void onResponse(Call<ModelResponse> call, Response<ModelResponse> response) {

                            if (response != null && response.body() != null) {

                                ModelResponse mresponse = response.body();
//                                Toast.makeText(MainActivity.this, mresponse.toString(), Toast.LENGTH_LONG).show();
                                Log.d("1234", "onFailure: " + mresponse);
                                progressDialog.dismiss();

                                binding.tvTemp.setText(mresponse.getMain().getTemp() + " " + "℃");
                                binding.tvName.setText(mresponse.getWeather().get(0).getMain() + " ");
                                binding.tvCityName.setText("    " + mresponse.getName() + "   , ");
                                binding.tvCountry.setText(mresponse.getSys().getCountry());
                                binding.tvTempMin.setText(" " + mresponse.getMain().getTemp_min() + " " + "℃");
                                binding.tvTempMax.setText(" " + mresponse.getMain().getTemp_max() + " " + "℃");
                                binding.tvWindSpeed.setText("    " + String.format("%.2f", mresponse.getWind().getSpeed() * 1.58) + " " + " km/hr ");

                                binding.tvHumidity.setText(" " + mresponse.getMain().getHumidity() + " ");

                                Long rise = Long.valueOf(mresponse.getSys().getSunrise());

                                String sunrise = new SimpleDateFormat("hh:mm a", Locale.ENGLISH).format(new Date(rise * 1000));

                                Long set = Long.valueOf(mresponse.getSys().getSunset());

                                String sunset = new SimpleDateFormat("hh:mm a", Locale.ENGLISH).format(new Date(set * 1000));

                                binding.tvSunrise.setText(sunrise);
                                binding.tvSunset.setText(sunset);
                            }

                        }

                        @Override
                        public void onFailure(Call<ModelResponse> call, Throwable t) {
                            Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                            Log.d("1234", "onFailure: " + t.getLocalizedMessage());
                            progressDialog.dismiss();
                        }
                    });
                } else {
                    binding.cityName.setError("please enter valid city name");
                    progressDialog.dismiss();
                }
                binding.cityName.setText("");


            }
        });


    }
}