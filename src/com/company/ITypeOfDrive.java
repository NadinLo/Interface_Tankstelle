package com.company;

public interface ITypeOfDrive {
    GasStation [] stationsWithThisFuel = new GasStation[10];
    int counterStations = 0;

    public Fuel offers(GasStation gasStation);
    public void searchGasStation ();
    public void goForTheNearest ();
    public void goForTheCheapest ();
}
