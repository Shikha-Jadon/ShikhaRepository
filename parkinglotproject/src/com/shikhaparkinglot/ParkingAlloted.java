package com.shikhaparkinglot;

public class ParkingAlloted {

    public void vehicleParked(int id,String type)
    {
        if(type.equals("bike"))
        {
            Bike bike=new Bike();
            bike.setId(id);
            bike.setType(type);

            if (Bike.getBikeMap().containsKey(bike.getId()))
            {
                System.out.println("Bike with id="+bike.getId()+"is already parked");
            }
            else {

                Bike.getBikeMap().put(bike.getId(), bike.getType());
                Bike.setBikeMap(Bike.getBikeMap());
                System.out.println("Map_elements"+Bike.getBikeMap());
                Bike.setBikeRowCapacity(Bike.getBikeRowCapacity()-1);
                System.out.println("Bike with id="+bike.getId()+"is parked");
                System.out.println("Capacity of Bike parking left"+Bike.getBikeRowCapacity());
            }
        }

        else if(type.equals("car"))
        {
            Car car=new Car();
            car.setId(id);
            car.setType(type);

            if(Car.getCarMap().containsKey(car.getId()))
            {
                System.out.println("Car with id="+car.getId()+"is already parked");
            }
            else
            {
                Car.getCarMap().put(car.getId(),car.getType());
                Car.setCarMap(Car.getCarMap());
                Car.setCarRowCapacity(Car.getCarRowCapacity()-1);
                System.out.println("Car with id="+car.getId()+"is parked");
                System.out.println("Capacity of Car parking left"+Car.getCarRowCapacity());
            }

        }

        else if(type.equals("bus"))
        {
            Bus bus=new Bus();
            bus.setId(id);
            bus.setType(type);
            if(Bus.getBusMap().containsKey(bus.getId()))
            {
                System.out.println("Bus with id="+bus.getId()+"is already parked");
            }
            else
            {
                Bus.getBusMap().put(bus.getId(),bus.getType());
                Bus.setBusMap(Bus.getBusMap());
                Bus.setBusRowCapacity(Bus.getBusRowCapacity()-1);
                System.out.println("Bus with id="+bus.getId()+"is parked");
                System.out.println("Capacity of Bus parking left"+Bus.getBusRowCapacity());
            }

        }

        else if(type.equals("truck"))
        {
            Truck truck=new Truck();
            truck.setId(id);
            truck.setType(type);
            if(Truck.getTruckMap().containsKey(truck.getId()))
            {
                System.out.println("Truck with id="+truck.getId()+"is already parked");
            }
            else
            {
                Truck.getTruckMap().put(truck.getId(),truck.getType());
                Truck.setTruckMap(Truck.getTruckMap());
                Truck.setTruckRowCapacity(Truck.getTruckRowCapacity()-1);
                System.out.println("Truck with id="+truck.getId()+"is parked");
                System.out.println("Capacity of Truck parking left"+Truck.getTruckRowCapacity());
            }

        }

    }
}
