package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderProcessor productOrderService = new OrderProcessor(
                new InformationServiceEmail(), new StandardOrderService(), new SqliteOrderRepository());
        productOrderService.process(orderRequest);
    }
}
