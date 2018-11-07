package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        // When
        double resultAdd = calculator.add(-1, 3);
        double resuldSub = calculator.sub(2, -5);
        double resultMul = calculator.mul(-7, -3);
        double resultDiv = calculator.div(-9, 3);
        try {
            calculator.div(3, 0);
        } catch (ArithmeticException e) {
        // Then
            Assert.assertEquals("a = 3.0 b = 0.0", e.getMessage());
        }
        Assert.assertEquals(2, resultAdd, 0);
        Assert.assertEquals(7, resuldSub, 0);
        Assert.assertEquals(21, resultMul, 0);
        Assert.assertEquals(-3, resultDiv, 0);
    }
}
