package com.example.weatherapp.ModelInJava;

public class Clouds {
    int all;

    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                '}';
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }
}
