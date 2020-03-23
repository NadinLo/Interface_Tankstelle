package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class Electricity implements ITypeOfDrive {
    GasStation [] stationsWithThisFuel = new GasStation[10];
    int counterStations = 0;
    Random random = new Random();
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    @Override
    public Fuel offers(GasStation gasStation) {
        stationsWithThisFuel[counterStations] = gasStation;
        counterStations++;
        return Fuel.ELECTRICITY;
    }

    @Override
    public void searchGasStation() {
        for (GasStation gasStation : stationsWithThisFuel) {
            if (gasStation != null) {
                gasStation.distanceToPerson = random.nextInt(19)+1;
                gasStation.prizeOfFuel = random.nextDouble()+2;
                System.out.println(gasStation.distanceToPerson + " km to " + gasStation.company +
                        " - Prize for Electricity: " + decimalFormat.format(gasStation.prizeOfFuel) + "€");
            }
        }

    }

    @Override
    public void goForTheNearest() {
        int i = 0;
        for (int j = i + 1; j < stationsWithThisFuel.length - 1; j++) {
            if (stationsWithThisFuel[j] != null) {
                if (stationsWithThisFuel[i].distanceToPerson > stationsWithThisFuel[j].distanceToPerson) {
                    i = j;
                }
            }
        }
        System.out.println("Go to: " + stationsWithThisFuel[i].company + " - it's the nearest.");
    }

    @Override
    public void goForTheCheapest() {
        int i = 0;
        for (int j = i + 1; j < stationsWithThisFuel.length - 1; j++) {
            if (stationsWithThisFuel[j] != null) {
                if (stationsWithThisFuel[i].prizeOfFuel > stationsWithThisFuel[j].prizeOfFuel) {
                    i = j;
                }
            }
        }
        System.out.println("Go to: " + stationsWithThisFuel[i].company + " - it's the cheapest.");
    }
}
