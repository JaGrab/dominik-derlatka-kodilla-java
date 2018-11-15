package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bigmac.SESAMEBUN)
                .burgers(2)
                .sauce(Bigmac.THOUSANDISLANDSSAUCE)
                .ingredient(Bigmac.CHEESE)
                .ingredient(Bigmac.ONION)
                .ingredient(Bigmac.CUCUMBER)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
}
