package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HerringDecorator extends AbstractPizzaOrderDecorator {
    public HerringDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(11));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + herring";
    }
}
