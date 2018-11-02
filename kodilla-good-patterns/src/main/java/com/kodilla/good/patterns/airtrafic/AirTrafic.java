package com.kodilla.good.patterns.airtrafic;

public class AirTrafic {
    public static void main(String[] args) {
        AirportRetriever airportRetriever = new AirportRetriever();
        Airport airport = airportRetriever.retrieve();
        airport.processConnection("Berlin", true);
        airport.processConnection("Moscow", false);
        airport.processInterconnection("Tehran", "Beijing");
    }
}
