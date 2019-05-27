package com.example.objectorientedprogramming;

import android.util.Log;

public class SportsCar extends Car {
    public SportsCar(String color, String model, int doors, int speed) {
        super(color, model, doors, speed);
    }

    @Override
    public void hoot() {
        // super.hoot();
        Log.d("SportsCar","cluuuunk");
    }

    public void hoot(String Sound){
        Log.d("masserati",Sound);


    }
}
