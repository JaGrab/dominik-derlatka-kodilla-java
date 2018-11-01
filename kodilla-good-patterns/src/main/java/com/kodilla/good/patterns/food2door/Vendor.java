package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class Vendor implements Supplier {
    private String name;
    private List<OrderService> orderServiceList;

    public Vendor(String name, List<OrderService> orderServiceList) {
        this.name = name;
        this.orderServiceList = orderServiceList;
    }
    public boolean process(Order order) {
        System.out.println("Processing order for " + getName());
        if(orderServiceList.size() > 0) {
            for (OrderService service: orderServiceList) {
                service.processOrder(order);
            }
            System.out.println("Order processed properly\n");
            return true;
        } else {
            System.out.println("No ordering routine for " + getName());
            System.out.println("Order cancelled\n");
            return false;
        }
    }
    public String getName() {
        return name;
    }
}
