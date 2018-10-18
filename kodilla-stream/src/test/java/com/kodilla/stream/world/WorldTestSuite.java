package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country france = new Country("France", new BigDecimal(1));
        Country germany = new Country("Germany", new BigDecimal(2));
        Country italy = new Country("Italy", new BigDecimal(3));
        Country ecuador = new Country("Ecuador", new BigDecimal(4));
        Country venezuela = new Country("Venezuela", new BigDecimal(5));
        Country peru = new Country("Peru", new BigDecimal(6));
        Country japan = new Country("Japan", new BigDecimal(7));
        Country china = new Country("China", new BigDecimal(8));
        Country india = new Country("India", new BigDecimal(9));
        Continent europe = new Continent("Europe");
        europe.addCountry(france);
        europe.addCountry(germany);
        europe.addCountry(italy);
        Continent southAmerica = new Continent("South America");
        southAmerica.addCountry(ecuador);
        southAmerica.addCountry(venezuela);
        southAmerica.addCountry(peru);
        Continent asia = new Continent("Asia");
        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(india);
        World world = new World();
        world.addContinent(europe);
        world.addContinent(southAmerica);
        world.addContinent(asia);

        //When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("45");
        Assert.assertEquals(expectedPeopleQuantity, worldPeopleQuantity);
    }
}
