package com.company;

public class Car {
    Brand brand;
    Fuel fuel;
    int fuelMax;
    Location location;

    public Car (Brand brand, Fuel fuel, int fuelMax){
        this.brand = brand;
        this.fuelMax = fuelMax;
        this.fuel = fuel;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
