package com.shikhaparkinglot;
import java.util.HashMap;
public class Bike extends Vehicle
{
    static int bikeRowCapacity = 10;
    public static HashMap<Integer,String> bikeMap = new HashMap<>();

    public static int getBikeRowCapacity() {
        return bikeRowCapacity;
    }

    public static void setBikeRowCapacity(int bikeRowCapacity) {
        Bike.bikeRowCapacity = bikeRowCapacity;
    }

    public static HashMap<Integer, String> getBikeMap() {
        return bikeMap;
    }

    public static void setBikeMap(HashMap<Integer, String> bikeMap) {
        Bike.bikeMap = bikeMap;
    }
}
