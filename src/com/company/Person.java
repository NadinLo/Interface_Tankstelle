package com.company;

public class Person {
    GasStation[] myGasStations = new GasStation[10];
    int counterGasStations;
    String name;
    Car car;

    public Person (String name){
        this.name = name;
    }

    public void drivesCar (Car car){
        this.car = car;
    }

    public void addToMyGasStations (GasStation gasStation){
        this.myGasStations[this.counterGasStations] = gasStation;
        this.counterGasStations++;
    }

    public void searchGasStation (ITypeOfDrive type){
        System.out.println("possible gas stations are: ");
        type.searchGasStation();
    }

    public void chooseNearestGasStation (ITypeOfDrive type){
        type.goForTheNearest ();
    }

    public void chooseCheapestGasStation (ITypeOfDrive type){
        type.goForTheCheapest();
    }


}
