package com.example.lam_43431_44549_cars_and_models;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static String keyBrand = "BRAND_KEY";
    public static String keyLogo = "LOGO_KEY";
    public static ArrayList<Car> cars;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cars = new ArrayList<>();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        Car bentleyCar = new Car("Bentley", R.drawable.bentley);

        cars.add(bentleyCar);

        Car mercedesCar = new Car("Mercedes", R.drawable.mercedes);

        cars.add(mercedesCar);

        Car porscheCar = new Car("BMW", R.drawable.bmw);

        cars.add(porscheCar);


        Car audiCar = new Car("audi", R.drawable.audi);

        cars.add(audiCar);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(this, cars));
    }
}