package com.shikhaparkinglot;
import java.util.*;

import static com.shikhaparkinglot.Choice.PARKING;

public class ParkingSystem {
    public static void main(String[] args) {

        for (int loo = 1; loo < 5; loo++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter type of the vehicle");
            String type = sc.nextLine();
            System.out.println("enter id of the vehicle");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("enter wat u want-1)PARKING 2) GET_VEHICLE");
            String choice = sc.nextLine();

            if (choice.toUpperCase().equals("PARKING"))
            {
                ParkingAlloted parking = new ParkingAlloted();
                parking.vehicleParked(id, type.toLowerCase());
            }
            else
            {
                FreeParkingAllot freeParking = new FreeParkingAllot();
                freeParking.vehicleUnParked(id, type.toLowerCase());

            }
        }
    }
}
