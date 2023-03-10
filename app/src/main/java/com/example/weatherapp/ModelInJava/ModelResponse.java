package com.example.weatherapp.ModelInJava;

import java.util.List;

public class ModelResponse {
    String base;
    Clouds clouds;
    int cod;
    Coord coord;
    int dt;
    int id;
    Main main;
    String name;
    Sys sys;
    int timezone;
    int visibility;
    List<Weather> weather;
    Wind wind;

    @Override
    public String toString() {
        return "ModelResponse{" +
                "base='" + base + '\'' +
                ", clouds=" + clouds +
                ", cod=" + cod +
                ", coord=" + coord +
                ", dt=" + dt +
                ", id=" + id +
                ", main=" + main +
                ", name='" + name + '\'' +
                ", sys=" + sys +
                ", timezone=" + timezone +
                ", visibility=" + visibility +
                ", weather=" + weather +
                ", wind=" + wind +
                '}';
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }


//    val dt: Int,
//    val id: Int,
//    val main: Main,
//    val name: String,
//    val sys: Sys,
//    val timezone: Int,
//    val visibility: Int,
//    val weather: List<Weather>,
//    val wind: Wind
}
