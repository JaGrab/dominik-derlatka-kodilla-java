package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryCircle() {
        //Given
        TaskFactory TaskFactory = new TaskFactory();
        //When
        Task shoppingTask = TaskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Bought 3.5kg of ham", shoppingTask.executeTask());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
    @Test
    public void testFactorySquare() {
        //Given
        TaskFactory TaskFactory = new TaskFactory();
        //When
        Task paintingTask = TaskFactory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Painted bathroom in blue", paintingTask.executeTask());
        Assert.assertEquals("Painting", paintingTask.getTaskName());
    }
    @Test
    public void testFactoryRectangle() {
        //Given
        TaskFactory TaskFactory = new TaskFactory();
        //When
        Task drivingTask = TaskFactory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Transported to Orkney by plane", drivingTask.executeTask());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
