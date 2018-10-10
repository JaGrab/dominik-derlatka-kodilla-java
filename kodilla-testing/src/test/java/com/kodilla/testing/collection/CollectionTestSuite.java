package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.rules.TestName;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Rule
    public TestName name = new TestName();
    @Before
    public void before() {
        System.out.println("Start test: " + name.getMethodName());
    }
    @After
    public void after() {
        System.out.println("End test: " + name.getMethodName());
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
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = exterminator.exterminate(testArray);
        System.out.println("Testing " + result);
        //Then
        Assert.assertTrue(result.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        for(int i=-2; i<7; i++) {
            testArray.add(i);
        }
        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        for(int i=-2; i<7; i+=2) {
            expectedResult.add(i);
        }
//        System.out.println("Expected result: " + expectedResult);
        //When
        ArrayList<Integer> result = exterminator.exterminate(testArray);
        System.out.println("Testing " + result);
        //Then
        Assert.assertTrue(result.equals(expectedResult));
    }
}
