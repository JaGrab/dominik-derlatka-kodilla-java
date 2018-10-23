package com.kodilla.exception.test;

import java.util.ArrayList;

public class AirTrafficControl {
    public static void main (String[] args) {
        Radar radar = new Radar();
        radar.addAirport("Rotterdam", true);
        radar.addAirport("Moscow", true);
        radar.addAirport("Tokyo", false);
        radar.addAirport("New York", false);

        ArrayList<Flight> listOfFlights = new ArrayList<>();
        Flight flight1 = new Flight("Bagdad", "Rotterdam");
        Flight flight2 = new Flight("Casablanca", "Tokyo");
        Flight flight3 = new Flight("Liverpool", "Ankara");
        listOfFlights.add(flight1);
        listOfFlights.add(flight2);
        listOfFlights.add(flight3);
        for(Flight flight: listOfFlights) {
            System.out.println("Passengers waiting for flight from " +
                    flight.getDepartureAirport() + " to " +
                    flight.getArrivalAirport());
            try {
                if (radar.findFlight(flight)) {
                    System.out.println("Please check-in and proceed to the gate.");
                } else {
                    System.out.println("Weather conditions are bad. Your flight is delayed.");
                }
            } catch (RouteNotFoundException e) {
                System.out.println("Weather conditions for your flight are unknown.\n" +
                        "Please wait for further informations.");
            } finally {
                System.out.println("Your safety is our priority.\n");
            }
        }
    }
}
