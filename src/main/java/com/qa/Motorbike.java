package com.qa;

    public class Motorbike extends Vehicle {
        private int age;

        public Motorbike(String id, String make, String model, int age) {
            super(id, make, model);
            this.age = age;
        }

        @Override
        public double calculateBill() {
            return 100 + (age * 10);
        }

        public int getAge () {
            return age;
        }
    }


