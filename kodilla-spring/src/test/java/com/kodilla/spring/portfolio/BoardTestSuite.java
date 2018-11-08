package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        // When
        board.addTaskToList(0, "To do");
        board.addTaskToList(1, "In progress");
        board.addTaskToList(2, "Done");
        // Then
        Assert.assertEquals("To do", board.getTaskFromList(0, 0));
        Assert.assertEquals("In progress", board.getTaskFromList(1, 0));
        Assert.assertEquals("Done", board.getTaskFromList(2, 0));
    }
}
