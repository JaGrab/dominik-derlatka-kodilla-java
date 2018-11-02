package com.kodilla.good.patterns.airtrafic;

import java.util.*;
import java.util.stream.Collectors;

public class ConnectionInformation {
    private Set<Connection> connectionSet;

    public ConnectionInformation(Set<Connection> connectionSet) {
        this.connectionSet = connectionSet;
    }

    public Set<Connection> findConnection(String airport, boolean from) {
        return connectionSet.stream().
                    filter(s -> {
                        if (from && (s.getFrom().equals(airport))) {
                            return true;
                        } else if (!from && (s.getTo().equals(airport))) {
                            return true;
                        } else {
                            return false;
                        }
                    }).
                    collect(Collectors.toSet());
    }
    public Map<Connection,Connection> findInterconnection(String from, String to) {
        return connectionSet.stream().
                    filter(c -> c.getFrom().equals(from)).
                    collect(Collectors.toMap(c -> c, c ->
                            connectionSet.stream().filter(con -> {
                                if (con.getFrom().equals(c.getTo()) && con.getTo().equals(to)) {
                                    return true;
                                } else {
                                    return false;
                                }
                            }).findFirst().orElse(new Connection("",""))));
    }
}
