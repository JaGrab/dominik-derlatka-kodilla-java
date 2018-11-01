package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DemandRetriever {
    public List<Demand> retrieve() {
        List<OrderService> orderServiceList1 = new ArrayList<>();
        orderServiceList1.add(new ProvisionalInvoice());
        orderServiceList1.add(new Prepayment());
        orderServiceList1.add(new Shipment());
        Supplier supplier1 = new Vendor("ExtraFoodShop", orderServiceList1);
        Order order1 = new Order("Carrot", "kg", new BigDecimal("3.5"));
        List<OrderService> orderServiceList2 = new ArrayList<>();
        orderServiceList2.add(new Prepayment());
        Supplier supplier2 = new Vendor("HealthyShop", orderServiceList2);
        Order order2 = new Order("Spinach", "kg", new BigDecimal("4.1"));
        List<OrderService> orderServiceList3 = new ArrayList<>();
        orderServiceList3.add(new Shipment());
        Supplier supplier3 = new Vendor("GlutenFreeShop", orderServiceList3);
        Order order3 = new Order("Salmon", "pcs", new BigDecimal("7"));
        List<Demand> demandList = new ArrayList<>();
        demandList.add(new Demand(supplier1, order1));
        demandList.add(new Demand(supplier2, order2));
        demandList.add(new Demand(supplier3, order3));
        return demandList;
    }
}
