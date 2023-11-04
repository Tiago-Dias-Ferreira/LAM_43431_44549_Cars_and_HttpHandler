package com.example.lam_43431_44549_cars_and_models;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public final static String keyBrand = "BrandKey";
    public final static String keyLogo = "LogoKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(new Car("Audi", R.drawable.audi));
        cars.add(new Car("Bentley", R.drawable.bentley));
        cars.add(new Car("BMW", R.drawable.bmw));
        cars.add(new Car("Citroen", R.drawable.citroen));
        cars.add(new Car("Jaguar", R.drawable.jaguar));
        cars.add(new Car("Jeep", R.drawable.jeep));
        cars.add(new Car("Mercedes", R.drawable.mercedes));
        cars.add(new Car("Mini", R.drawable.mini));
        cars.add(new Car("Opel", R.drawable.opel));
        cars.add(new Car("Porsche", R.drawable.porsche));
        cars.add(new Car("Toyota", R.drawable.toyota));
        cars.add(new Car("Volkswagen", R.drawable.volkswagen));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), cars));
    }
}