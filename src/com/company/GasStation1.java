package com.company;

public class GasStation1 implements IFuel {
    Fuel[] fuels;
    String location = "";
    String name = "";

    public GasStation1(Fuel[] fuels, String location, String name){
        this.fuels = fuels;
        this.location = location;
        this.name = name;
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
    public String getLocation() {
        return this.location;
    }

    @Override
    public void goFuel(Car car) {

    }
}
