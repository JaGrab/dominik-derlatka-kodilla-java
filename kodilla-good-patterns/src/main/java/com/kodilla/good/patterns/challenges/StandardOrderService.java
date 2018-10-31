package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;

public class StandardOrderService implements OrderService {
    public boolean order(User user, Article article, Quantity quantity) {
        System.out.println("Checking arrears for user: " + user.getUsername());
        System.out.print("Is article " + article.getName() + " " + quantity.getQuantity() +
                quantity.getUnit() + " in stock?... ");
        BigDecimal inStock = new BigDecimal("5");
        if(quantity.getQuantity().compareTo(inStock) == -1) {
            System.out.println("Yes");
            return true;
        } else {
            System.out.println("No");
            return false;
        }
    }
}
