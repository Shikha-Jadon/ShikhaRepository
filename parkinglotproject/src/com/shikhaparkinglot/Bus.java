package com.shikhaparkinglot;

import java.util.HashMap;

public class Bus extends Vehicle
{
    static int busRowCapacity=20;
    public static HashMap<Integer,String> busMap= new HashMap<>();

    public static int getBusRowCapacity() {
        return busRowCapacity;
    }

    public static void setBusRowCapacity(int busRowCapacity) {
        Bus.busRowCapacity = busRowCapacity;
    }

    public static HashMap<Integer, String> getBusMap() {
        return busMap;
    }

    public static void setBusMap(HashMap<Integer, String> busMap) {
        Bus.busMap = busMap;
    }
}
