package com.kodilla.good.patterns.food2door;

public class Shipment implements OrderService {
    public boolean processOrder (Order order) {
        System.out.println("Arrange shipment for " + order + "... done.");
        return true;
    }
}
