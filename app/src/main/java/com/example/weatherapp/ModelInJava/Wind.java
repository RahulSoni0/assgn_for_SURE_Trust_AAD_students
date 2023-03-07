package com.example.weatherapp.ModelInJava;

public class Wind {

    int deg;
    double speed;

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "deg=" + deg +
                ", speed=" + speed +
                '}';
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
//    val deg: Int,
//    val speed: Double
}
