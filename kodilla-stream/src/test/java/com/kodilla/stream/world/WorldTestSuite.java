package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("France", new BigDecimal(1));
        Country country2 = new Country("Germany", new BigDecimal(2));
        Country country3 = new Country("Italy", new BigDecimal(3));
        Country country4 = new Country("Ecuador", new BigDecimal(4));
        Country country5 = new Country("Venezuela", new BigDecimal(5));
        Country country6 = new Country("Peru", new BigDecimal(6));
        Country country7 = new Country("Japan", new BigDecimal(7));
        Country country8 = new Country("China", new BigDecimal(8));
        Country country9 = new Country("India", new BigDecimal(9));
        Continent continent1 = new Continent("Europe");
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        Continent continent2 = new Continent("South America");
        continent2.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);
        Continent continent3 = new Continent("Asia");
        continent3.addCountry(country7);
        continent3.addCountry(country8);
        continent3.addCountry(country9);
        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("45");
        Assert.assertEquals(expectedPeopleQuantity, worldPeopleQuantity);
    }
}
