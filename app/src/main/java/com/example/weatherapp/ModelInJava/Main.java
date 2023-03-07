package com.example.weatherapp.ModelInJava;

public class Main {

    double feels_like;
    int humidity;
    int pressure;
    double temp;
    double temp_max;
    double temp_min;

    @Override
    public String toString() {
        return "Main{" +
                "feels_like=" + feels_like +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", temp=" + temp +
                ", temp_max=" + temp_max +
                ", temp_min=" + temp_min +
                '}';
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }


//    val feels_like: Double,
//    val humidity: Int,
//    val pressure: Int,
//    val temp: Double,
//    val temp_max: Double,
//    val temp_min: Double
}
