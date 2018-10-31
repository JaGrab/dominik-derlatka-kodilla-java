package com.kodilla.good.patterns.challenges;

public interface OrderRepository {
    public void createOrder(User user, Article article, Quantity quantity);
}
