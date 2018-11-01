package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {
        DemandRetriever demandRetriever = new DemandRetriever();
        for (Demand demand : demandRetriever.retrieve()) {
            demand.getSupplier().process(demand.getOrder());
        }
    }
}
