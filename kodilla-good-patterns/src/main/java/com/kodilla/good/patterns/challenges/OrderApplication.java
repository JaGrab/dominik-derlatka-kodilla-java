package com.kodilla.good.patterns.challenges;

public class OrderApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(
                new InformationServiceEmail(), new StandardOrderService(), new SqliteOrderRepository());
        productOrderService.process(orderRequest);
    }
}
