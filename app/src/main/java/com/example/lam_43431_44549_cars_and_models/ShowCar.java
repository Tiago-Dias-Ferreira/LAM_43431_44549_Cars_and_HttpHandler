package com.example.lam_43431_44549_cars_and_models;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowCar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String brand = intent.getStringExtra(MainActivity.keyBrand);
        int logo = intent.getIntExtra(MainActivity.keyLogo, 0);

        TextView textView = findViewById(R.id.showBrand);
        textView.setText(brand);
        ImageView imageView = findViewById(R.id.showCar);
        imageView.setImageResource(logo);
    }

}
