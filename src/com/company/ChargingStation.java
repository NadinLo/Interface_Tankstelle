package com.company;

public class ChargingStation implements IFuel {
    Fuel[] fuels;
    Location location;
    Company company;
    public ChargingStation(Fuel[] fuels, Location location, Company company){
        this.fuels = fuels;
        this.location = location;
        this.company = company;
    }

    @Override
    public boolean hasMyFuel(Fuel fuel) {
        boolean hasMyFuel = false;
        for (Fuel singleFuel : fuels) {
            if(singleFuel == fuel){
                hasMyFuel = true;
                break;
            }
        }
        return hasMyFuel;
    }

    @Override
    public Location getLocation() {
        return this.location;
    }

    @Override
    public void goFuel(Car car) {

    }
}
