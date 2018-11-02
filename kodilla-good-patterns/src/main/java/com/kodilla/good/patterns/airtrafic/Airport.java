package com.kodilla.good.patterns.airtrafic;

import java.util.Map;
import java.util.Set;

public class Airport {
    private ConnectionInformation connectionInformation;

    public Airport(ConnectionInformation connectionInformation) {
        this.connectionInformation = connectionInformation;
    }
    public void processConnection(String airport, boolean from) {
        Set<Connection> result = connectionInformation.findConnection(airport, from);
        String direction = " to ";
        if(from) {
            direction = " from ";
        }
        if(result.size() > 0) {
            System.out.println("Connections" + direction + airport + ":");
            result.stream().forEach(c -> {
                System.out.println(c.getFrom() + " -> " + c.getTo());
            });
        } else {
            System.out.println("No connections found" + direction + airport);
        }
        System.out.println();
    }
    public void processInterconnection(String from, String to) {
        Map<Connection,Connection> result = connectionInformation.findInterconnection(from, to);
        if(result.size() > 0) {
            System.out.println("Connecting flights from " + from + " to " + to + ":");
            result.entrySet().stream().forEach(c -> {
                System.out.println(c.getKey().getFrom() + " -> " + c.getKey().getTo() +
                        " -> " + c.getValue().getTo());
            });
        } else {
            System.out.println("No connecting flights found " + from + " to " + to);
        }
        System.out.println();
    }
}
