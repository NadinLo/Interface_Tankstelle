package com.company;

public class Main {

    public static void main(String[] args) {
        Person carDriver = new Person("Peter");
        Car opel1 = new Car(Brand.OPEL, Fuel.DIESEL, 300);
        carDriver.drivesCar(opel1);
        carDriver.car.setLocation(Location.DORNBIRN);

        GasStation omv = new GasStation(new Fuel[]{ Fuel.SUPER_E10, Fuel.SUPER95}, Location.DORNBIRN, Company.OMV);
        GasStation shell = new GasStation(new Fuel[]{ Fuel.SUPER_E10, Fuel.SUPER95, Fuel.DIESEL}, Location.BREGENZ, Company.SHELL);
        ChargingStation vkw = new ChargingStation(new Fuel[] { Fuel.ELECTRICITY}, Location.LUSTENAU, Company.VKW);

        IFuel[] fuelStations = new IFuel[10];
        fuelStations[0] = omv;
        fuelStations[1] = shell;
        fuelStations[2] = vkw;

        for (IFuel fuel : fuelStations) {
            if(fuel != null) {
            if(fuel.hasMyFuel(opel1.fuel) && fuel.getLocation() == carDriver.car.location){
                    fuel.goFuel(opel1);
                    break;
                }
            }
        }
    }
}
