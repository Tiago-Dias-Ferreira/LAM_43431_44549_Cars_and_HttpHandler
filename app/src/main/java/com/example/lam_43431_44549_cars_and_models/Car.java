package com.example.lam_43431_44549_cars_and_models;

import android.speech.ModelDownloadListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Car {

    String name;
    int logo;
    List<Car> modelsList;

    public Car(String name, int logo){
        this.name = name;
        this.logo = logo;
        modelsList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getLogo() {
        return logo;
    }

    public void addModel(String brand, int logo){
        Car model = new Car(brand,logo);
        modelsList.add(model);
    }

}
