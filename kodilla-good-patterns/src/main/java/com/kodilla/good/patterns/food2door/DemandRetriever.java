package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DemandRetriever {
    public Demand retrieve() {
        List<OrderService> orderServiceList = new ArrayList<>();
        orderServiceList.add(new ProvisionalInvoice());
        orderServiceList.add(new Prepayment());
        orderServiceList.add(new Shipment());
        Supplier supplier = new Vendor("ExtraFoodShop", orderServiceList);
        Order order = new Order("Carrot", "kg", new BigDecimal("3.5"));
        return new Demand(supplier, order);
    }
}
