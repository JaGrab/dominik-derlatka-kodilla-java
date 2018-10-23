package com.kodilla.exception.test;

import java.util.HashMap;

public class Radar {
    private HashMap<String,Boolean> airportMap = new HashMap<>();
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        String arrivalAirport = flight.getArrivalAirport();
        if(airportMap.containsKey(arrivalAirport)) {
            return airportMap.get(arrivalAirport);
        } else {
            throw new RouteNotFoundException("Missing data for: " + arrivalAirport);
        }
    }
    public void addAirport(String airport, Boolean canFly) {
        airportMap.put(airport, canFly);
    }
}
