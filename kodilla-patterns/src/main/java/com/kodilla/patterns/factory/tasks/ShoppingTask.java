package com.kodilla.patterns.factory.tasks;

public class ShoppingTask extends TaskSimple {
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        super(taskName);
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    @Override
    public String executeTask() {
        executed = true;
        return "Bought " + quantity + "kg of " + whatToBuy;
    }
}
