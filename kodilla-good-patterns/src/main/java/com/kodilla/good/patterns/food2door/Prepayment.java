package com.kodilla.good.patterns.food2door;

public class Prepayment implements  OrderService {
    public boolean processOrder(Order order) {
        System.out.println("Prepayment for " + order + "... done.");
        return true;
    }
}
