package com.shikhaparkinglot;

import java.util.HashMap;
public class Truck extends Vehicle
{
    static int truckRowCapacity = 10;
    public static HashMap<Integer,String> truckMap =  new HashMap<>();

    public static int getTruckRowCapacity() {
        return truckRowCapacity;
    }

    public static void setTruckRowCapacity(int truckRowCapacity) {
        Truck.truckRowCapacity = truckRowCapacity;
    }

    public static HashMap<Integer, String> getTruckMap() {
        return truckMap;
    }

    public static void setTruckMap(HashMap<Integer, String> truckMap) {
        Truck.truckMap = truckMap;
    }
}
