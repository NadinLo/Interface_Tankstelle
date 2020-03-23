package com.company;

public class GasStation{
    String place;
    Company company;
    Fuel[] offerdFuel = new Fuel[5];
    int counterOfferedFuel;
    int distanceToPerson;
    double prizeOfFuel;

    public GasStation (Company company, String place){
        this.company = company;
        this.place = place;
    }

    public void offers (ITypeOfDrive type){
        this.offerdFuel[this.counterOfferedFuel] = type.offers(this);
        this.counterOfferedFuel++;
    }

}
