package com.kodilla.good.patterns.airtrafic;

import java.util.HashSet;
import java.util.Set;

public class AirportRetriever {
    public Airport retrieve() {
        Set<Connection> connectionSet = new HashSet<>();
        connectionSet.add(new Connection("Berlin", "Moscow"));
        connectionSet.add(new Connection("Delhi", "Beijing"));
        connectionSet.add(new Connection("Berlin", "Paris"));
        connectionSet.add(new Connection("Tehran", "Moscow"));
        connectionSet.add(new Connection("Moscow", "Beijing"));
        connectionSet.add(new Connection("Tehran", "Delhi"));
        return new Airport(new ConnectionInformation(connectionSet));
    }
}
