package com.qa;

/**
 * The Main class to demonstrate the functionality of the Garage class.
 */
public class Main {
    public static void main(String[] args) {
        // Create a new garage instance.
        Garage garage = new Garage();

        // Create a car and a motorbike instance.
        Vehicle car = new Car("1", "Toyota", "Camry", 4);
        Vehicle motorbike = new Motorbike("2", "Yamaha", "MT-07", 12);

        // Add the car and motorbike to the garage.
        garage.addVehicle(car);
        garage.addVehicle(motorbike);

        // Print out the vehicles currently in the garage.
        System.out.println("Vehicles in the garage:");
        for (Vehicle vehicle : garage.getVehicles()) {
            System.out.println(vehicle.getMake() + " " + vehicle.getModel());
        }

        // Fix the vehicle with ID "1" (the car).
        garage.fixVehicle("1");

        // Remove the vehicle with ID "2" (the motorbike) from the garage.
        garage.removeVehicleById("2");

        // Print out the remaining vehicles in the garage.
        System.out.println("After removing motorbike, vehicles in the garage:");
        for (Vehicle vehicle : garage.getVehicles()) {
            System.out.println(vehicle.getMake() + " " + vehicle.getModel());
        }

        // Empty the garage.
        garage.emptyGarage();

        // Print out the number of vehicles currently in the garage.
        System.out.println("After emptying the garage, vehicles in the garage:");
        System.out.println(garage.getVehicles().size());
    }
}
