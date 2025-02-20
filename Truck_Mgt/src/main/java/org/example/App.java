package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Truck_Service truckService = new Truck_Service();
        Truck tata = new Truck("Tata", "2019",1000,"Rajesh");
        Truck volvo = new Truck("Volvo","2015",1500,"Suman");
        Truck BMW = new Truck("BMW","2024",5000,"Babu");
        Truck Audi = new Truck("Audi","2025",600,"Kiran");


        //Adding into the database
        truckService.addTruck(tata);
        truckService.addTruck(volvo);
        truckService.addTruck(BMW);
        truckService.addTruck(Audi);

        //Fetch
        System.out.println("Fetching by id-----------------------");
        Truck truckById = truckService.getTruckById(1);
        System.out.println("Truck fetched by id : "+truckById);

        //Update
        System.out.println("Changing Driver Name----------------------");
        truckById.setDriver_name("Pramila");
        truckService.updateTruck(truckById);
        System.out.println("truck data updated :" +truckService.getTruckById(1));

         //Get all truck data
        System.out.println("Fetching All trucks -------------------");
        List<Truck> allTrucks = truckService.getAllTrucks();
        System.out.println("All truck in Db : ");
        for(Truck truck1 : allTrucks)
        {
            System.out.println(truck1);
        }

        //delete truck Data
        System.out.println("Deleting truck by ID ----------------");
        truckService.deleteTruck(2);
        System.out.println("Data deleted by id : "+2);

        //Getting all trucks
        System.out.println("fetching all trucks--------------");
        List<Truck> allTrucks1 = truckService.getAllTrucks();
        System.out.println("Trucks after all operations : " );
        for(Truck truck2 : allTrucks1)
        {
            System.out.println(truck2);
        }
    }
}
