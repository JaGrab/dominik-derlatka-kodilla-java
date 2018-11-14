package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.BalancedPredictor;

public class CoroporateCustomer extends Customer {
    public CoroporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
