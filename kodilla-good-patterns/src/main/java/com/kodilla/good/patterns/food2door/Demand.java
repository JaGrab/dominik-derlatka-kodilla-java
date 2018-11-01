package com.kodilla.good.patterns.food2door;

public class Demand {
    private Supplier supplier;
    private Order order;

    public Demand(Supplier supplier, Order order) {
        this.supplier = supplier;
        this.order = order;
    }
    public Supplier getSupplier() {
        return supplier;
    }
    public Order getOrder() {
        return order;
    }
}
