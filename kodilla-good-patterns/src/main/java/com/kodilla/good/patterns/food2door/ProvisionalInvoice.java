package com.kodilla.good.patterns.food2door;

public class ProvisionalInvoice implements OrderService {
    public boolean processOrder (Order order) {
        System.out.println("Getting provisional invoice for " + order + "... done.");
        return true;
    }
}
