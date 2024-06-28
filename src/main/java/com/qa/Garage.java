package com.qa;

import java.util.ArrayList;
import java.util.List;

/**
 * The Garage class represents a garage that can hold and manage a collection of vehicles.
 */
public class Garage {
    // A list to store the vehicles in the garage.
    private List<Vehicle> vehicles;

    /**
     * Constructor to initialize the vehicles list.
     */
    public Garage() {
        this.vehicles = new ArrayList<>();
    }

    /**
     * Adds a vehicle to the garage.
     *
     */
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    /**
     * Removes a vehicle from the garage by its ID.
     *
     * @param id The ID of the vehicle to be removed.
     */
    public void removeVehicleById(String id) {
        vehicles.removeIf(vehicle -> vehicle.getId().equals(id));
    }

    /**
     * Fixes a vehicle by its ID and calculates the bill for the repair.
     *
     * @param id The ID of the vehicle to be fixed.
     */
    public void fixVehicle(String id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(id)) {
                double bill = vehicle.calculateBill();
                System.out.println("Fixing vehicle ID: " + id + ", Bill: £" + bill);
                return;
            }
        }
        // If the vehicle with the given ID is not found, print an error message.
        System.out.println("Vehicle with ID: " + id + " not found.");
    }

    /**
     * Empties the garage by clearing the list of vehicles.
     */
    public void emptyGarage() {
        vehicles.clear();
    }

    /**
     * Returns the list of vehicles currently in the garage.
     *
     * @return A list of vehicles.
     */
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}


