package com.example.lam_43431_44549_cars_and_models;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ShowCar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_models);

        List<Car> modelsList = new ArrayList<>();
        Intent intent = getIntent();
        String brand = intent.getStringExtra(MainActivity.keyBrand);
        int logo = intent.getIntExtra(MainActivity.keyLogo, 0);

        RecyclerView recyclerView = findViewById(R.id.models_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for(Car car : MainActivity.cars){
            if(car.getName().equals(brand)){
                modelsList = car.modelsList;
            }
        }

        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), modelsList));
    }
}
