package com.qa;


    public class Car extends Vehicle {
        private int numberOfDoors;

        public Car(String id, String make, String model, int numberOfDoors) {
            super(id, make, model);
            this.numberOfDoors = numberOfDoors;
        }

        @Override
        public double calculateBill() {
            return 100 + (numberOfDoors * 10);
        }

        public int getNumberOfDoors() {
            return numberOfDoors;
        }
    }


