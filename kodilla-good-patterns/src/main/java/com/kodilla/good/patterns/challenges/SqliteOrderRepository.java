package com.kodilla.good.patterns.challenges;

public class SqliteOrderRepository implements OrderRepository {
    public void createOrder(User user, Article article, Quantity quantity) {
        System.out.println("Connecting to database");
        System.out.println("Storing data: " + user.getUsername() + ", " + article.getName() + ", " +
                quantity.getQuantity() + quantity.getUnit());
    }
}
