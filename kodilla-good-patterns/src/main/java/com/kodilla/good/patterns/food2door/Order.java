package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;

public class Order {
    private String article;
    private String unit;
    private BigDecimal quantity;

    public Order(String article, String unit, BigDecimal quantity) {
        this.article = article;
        this.unit = unit;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Order{" +
                "article='" + article + '\'' +
                ", unit='" + unit + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
