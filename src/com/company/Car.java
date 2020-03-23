package com.company;

public class Car {
    Brand brand;
    Fuel fuel;
    int fuelMax;
    ITypeOfDrive typeOfDrive;


    public Car (Brand brand, ITypeOfDrive type, int fuelMax){
        this.brand = brand;
        this.fuelMax = fuelMax;
        this.typeOfDrive = type;
    }



}
