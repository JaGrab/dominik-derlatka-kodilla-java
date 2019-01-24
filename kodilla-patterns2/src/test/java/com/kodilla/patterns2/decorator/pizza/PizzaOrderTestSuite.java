package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testTheGunsOfNavaronePizza() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new StrawberryJellyDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(34), theCost);
        assertEquals("Margherita + bacon + strawberry jelly + extra cheese", description);
    }
    @Test
    public void testWhereEaglesDare() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new HerringDecorator(theOrder);
        theOrder = new WhippedCreamDecorator(theOrder);
        theOrder = new RaisinsDecorator(theOrder);
        theOrder = new NuthouseVoucherDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(37), theCost);
        assertEquals("Margherita + herring + whipped cream + raisins + nuthouse voucher", description);
    }
}
