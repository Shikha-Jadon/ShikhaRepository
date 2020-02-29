package com.shikhaparkinglot;

import java.util.HashMap;
public class Car extends Vehicle
{
    static int carRowCapacity = 10;
    public static HashMap<Integer,String> carMap =  new HashMap<>();

    public static int getCarRowCapacity() {
        return carRowCapacity;
    }

    public static void setCarRowCapacity(int carRowCapacity) {
        Car.carRowCapacity = carRowCapacity;
    }

    public static HashMap<Integer, String> getCarMap() {
        return carMap;
    }

    public static void setCarMap(HashMap<Integer, String> carMap) {
        Car.carMap = carMap;
    }
}
