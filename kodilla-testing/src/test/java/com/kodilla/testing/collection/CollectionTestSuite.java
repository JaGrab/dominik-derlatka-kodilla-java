package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        ArrayList<Integer> result = exterminator.exterminate(testArray);
        System.out.println("Testing " + result);
        //Then
        Assert.assertTrue(result.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        for(int i=-2; i<7; i++) {
            testArray.add(i);
        }
        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        for(int i=-2; i<7; i+=2) {
            expectedResult.add(i);
        }
//        System.out.println("Expected result: " + expectedResult);
        ArrayList<Integer> result = exterminator.exterminate(testArray);
        System.out.println("Testing " + result);
        //Then
        Assert.assertTrue(result.equals(expectedResult));

    }
}
