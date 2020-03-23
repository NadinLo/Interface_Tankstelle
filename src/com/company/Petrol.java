package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public abstract class Petrol implements ITypeOfDrive {
    GasStation [] stationsWithThisFuel = new GasStation[10];
    int counterStations = 0;
    Random random = new Random();
    DecimalFormat decimalFormat = new DecimalFormat("#.##");


    @Override
    public abstract Fuel offers(GasStation gasStation);

    @Override
    public abstract void searchGasStation();
}
