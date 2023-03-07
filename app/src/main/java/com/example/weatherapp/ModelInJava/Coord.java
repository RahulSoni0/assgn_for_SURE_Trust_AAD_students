package com.example.weatherapp.ModelInJava;

public class Coord {

    double lat;
    double lon;

    @Override
    public String toString() {
        return "Coord{" +
                "lat=" + lat +
                ", lon=" + lon +
                '}';
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

//    val lat: Double,
//    val lon: Double
}
