package com.example.lam_43431_44549_cars_and_handler;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String name;
    private int logo;
    private List<Model> modelsList;

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

    public List<Model> getModelsList(){
        return this.modelsList;
    }
    public void addModel(String brand, int logo){
        Model model = new Model(brand,logo);
        modelsList.add(model);
    }
}
