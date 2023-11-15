package com.example.lam_43431_44549_cars_and_handler;

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

        //bentley models
        bentleyCar.addModel("Bentaya", R.drawable.btybentaya);
        bentleyCar.addModel("Continental GT", R.drawable.btycontinentalgt);
        bentleyCar.addModel("Flying Spur", R.drawable.btyflyingspur);

        Car mercedesCar = new Car("Mercedes", R.drawable.mercedes);

        cars.add(mercedesCar);

        //mercedes models
        mercedesCar.addModel("AMG", R.drawable.mcdamg);
        mercedesCar.addModel("Classe A", R.drawable.mcdclassea);
        mercedesCar.addModel("Classe B", R.drawable.mcdclasseb);
        mercedesCar.addModel("Classe C", R.drawable.mcdclassec);
        mercedesCar.addModel("Classe D", R.drawable.mcdclassecle);
        mercedesCar.addModel("Classe E", R.drawable.mcdclassee);
        mercedesCar.addModel("G-Wagon", R.drawable.mcdclasseg);
        mercedesCar.addModel("Classe GLE", R.drawable.mcdclassegle);

        Car porscheCar = new Car("BMW", R.drawable.porsche);

        cars.add(porscheCar);

        //porsche models
        porscheCar.addModel("718 Boxter", R.drawable.psc718boxter);
        porscheCar.addModel("718 Cayman", R.drawable.psc718cayman);
        porscheCar.addModel("718 Cayman GT4", R.drawable.psc718caymangt4);
        porscheCar.addModel("718 Spyder RS", R.drawable.psc718spyderrs);
        porscheCar.addModel("911 Carrera", R.drawable.psc911carrera);
        porscheCar.addModel("911 Carrera 4S", R.drawable.psc911carrera4s);
        porscheCar.addModel("911 GT3 RS", R.drawable.psc911gt3rs);
        porscheCar.addModel("911 Targa 4", R.drawable.psc911targa4);
        porscheCar.addModel("Panamera Executive", R.drawable.pscpanameraexecutive);
        porscheCar.addModel("Taycan 4 CrossTurismo", R.drawable.psctaycan4crossturismo);
        porscheCar.addModel("Taycan Turbo S", R.drawable.psctaycanturbos);


        Car audiCar = new Car("audi", R.drawable.audi);

        cars.add(audiCar);

        //audi models
        audiCar.addModel("A5 Coupé", R.drawable.audia5coupe);
        audiCar.addModel("S3 Saloon", R.drawable.audis3saloon);
        audiCar.addModel("RS3 Sportback", R.drawable.audirs3sportback);
        audiCar.addModel("RS6 Avante", R.drawable.audirs6avante);
        audiCar.addModel("A7 Sportback", R.drawable.audia7sportback);
        audiCar.addModel("RS7 Sportback", R.drawable.audirs7sportback);
        audiCar.addModel("Q3", R.drawable.audiq3);
        audiCar.addModel("Q4 e-tron", R.drawable.audiq4etron);
        audiCar.addModel("Q5", R.drawable.audiq5);
        audiCar.addModel("R8", R.drawable.audir8);
        audiCar.addModel("TTS Coupé", R.drawable.audittscoupe);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(this, cars));
    }
}