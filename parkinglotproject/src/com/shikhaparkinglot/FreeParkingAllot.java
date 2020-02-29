package com.shikhaparkinglot;

public class FreeParkingAllot {
    public void vehicleUnParked(int id,String type)
    {
        if(type.equals("bike"))
        {
            System.out.println("map after free"+Bike.getBikeMap());
            if(Bike.getBikeMap().containsKey(id))
            {
                Bike.getBikeMap().remove(id,type);
                Bike.setBikeMap(Bike.getBikeMap());
                Bike.setBikeRowCapacity(Bike.getBikeRowCapacity()+1);
                System.out.println("Bike with id="+id+"is get unParked");
                System.out.println("Capacity of Bike parking left"+Bike.getBikeRowCapacity());
            }
            else
            {
                System.out.println("Bike with id="+id+"is not present in parking");
            }

        }
        else if(type.equals("car"))
        {
            if(Car.getCarMap().containsKey(id))
            {
                Car.getCarMap().remove(id,type);
                Car.setCarMap(Car.getCarMap());
                Car.setCarRowCapacity(Car.getCarRowCapacity()+1);
                System.out.println("Car with id="+id+"is get unParked");
                System.out.println("Capacity of Car parking left"+Car.getCarRowCapacity());

            }
            else
            {
                System.out.println("Car with id="+id+"is not present in parking");
            }
        }
        else if(type.equals("bus"))
        {
            Bus bus=new Bus();
            if(Bus.getBusMap().containsKey(id))
            {
                Bus.getBusMap().remove(id,type);
                Bus.setBusMap(Bus.getBusMap());
                Bus.setBusRowCapacity(Bus.getBusRowCapacity()+1);
                System.out.println("Bus with id="+id+"is get unParked");
                System.out.println("Capacity of Bus parking left"+Bus.getBusRowCapacity());
            }
            else
            {
                System.out.println("Bus with id="+id+"is not present in parking");
            }
        }
        else if(type.equals("truck"))
        {
            Truck truck=new Truck();
            if(Truck.getTruckMap().containsKey(id))
            {
                Truck.getTruckMap().remove(id,type);
                Truck.setTruckMap(Truck.getTruckMap());
                Truck.setTruckRowCapacity(Truck.getTruckRowCapacity()+1);
                System.out.println("Truck with id="+id+"is get unParked");
                System.out.println("Capacity of Truck parking left"+Truck.getTruckRowCapacity());
            }
            else
            {
                System.out.println("Truck with id="+id+"is not present in parking");
            }
        }
    }
}
