package com.company;

public class Super95 extends Petrol {
    @Override
    public Fuel offers(GasStation gasStation) {
        stationsWithThisFuel[counterStations] = gasStation;
        counterStations++;
        return Fuel.SUPER95;
    }

    @Override
    public void searchGasStation() {
        for (GasStation gasStation : stationsWithThisFuel) {
            if (gasStation != null) {
                gasStation.distanceToPerson = random.nextInt(19)+1;
                gasStation.prizeOfFuel = random.nextDouble()+2;
                System.out.println(gasStation.distanceToPerson + " km to " + gasStation.company +
                        " - Prize for super95: " + decimalFormat.format(gasStation.prizeOfFuel) + "€");
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



