package com.qa;

/**
 * The Vehicle class represents a generic vehicle with basic properties and methods.
 * It is an abstract class, so it cannot be instantiated directly.
 */
public abstract class Vehicle {
    // Unique identifier for the vehicle.
    private String id;
    // Make of the vehicle (e.g., Toyota, Yamaha).
    private String make;
    // Model of the vehicle (e.g., Camry, MT-07).
    private String model;

    /**
     * Constructor to initialize the vehicle's properties.
     *
     * @param id    The unique identifier for the vehicle.
     * @param make  The make of the vehicle.
     * @param model The model of the vehicle.
     */
    public Vehicle(String id, String make, String model) {
        this.id = id;
        this.make = make;
        this.model = model;
    }

    /**
     * Gets the unique identifier of the vehicle.
     *
     * @return The vehicle's ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the make of the vehicle.
     *
     * @return The vehicle's make.
     */
    public String getMake() {
        return make;
    }

    /**
     * Gets the model of the vehicle.
     *
     * @return The vehicle's model.
     */
    public String getModel() {
        return model;
    }

    /**
     * Abstract method to calculate the bill for repairing the vehicle.
     * Each subclass must provide its own implementation.
     *
     * @return The cost of repairing the vehicle.
     */
    public abstract double calculateBill();
}
