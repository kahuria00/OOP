package com.example.objectorientedprogramming;

import android.util.Log;

public class Car {
    private String color;
    private String model;
    private int doors;
    private int speed;

    public Car(String color, String model, int doors, int speed) {
        this.color = color;
        this.model = model;
        this.doors = doors;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void  carryGoods(){
        Log.d( "Car","The car is carrying goods");
    }

    public void hoot(){
        Log.d("Car","Beeeeeeeeeeep");

    }
    public   int accelerate(int acceleration ){
        speed=speed+acceleration;
        return speed;


    }
    public int decelerate(int decelerate){
        speed=speed-decelerate;
        return speed;


    }
    public int stop(){
        speed=0;
        return speed;
    }
}
