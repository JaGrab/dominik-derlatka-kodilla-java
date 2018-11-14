package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch(taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping", "ham", 3.5);
            case PAINTINGTASK:
                return new PaintingTask("Painting", "blue", "bathroom");
            case DRIVINGTASK:
                return new DrivingTask("Driving", "Orkney", "plane");
            default:
                return null;
        }

    }
}
