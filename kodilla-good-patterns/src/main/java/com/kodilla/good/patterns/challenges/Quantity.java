package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;

public class Quantity {
    private String unit;
    private BigDecimal quantity;

    public Quantity(String unit, BigDecimal quantity) {
        this.unit = unit;
        this.quantity = quantity;
    }
    public String getUnit() {
        return unit;
    }
    public BigDecimal getQuantity() {
        return quantity;
    }
}
