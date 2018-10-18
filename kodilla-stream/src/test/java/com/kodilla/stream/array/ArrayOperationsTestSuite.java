package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] testArray = IntStream.range(0, 22)
                .filter(n -> n % 3 == 0)
                .toArray();

        //When
        double average = ArrayOperations.getAverage(testArray);

        //Then
        Assert.assertEquals(10.5, average, 0);
    }
}
