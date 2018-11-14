package com.kodilla.patterns.factory.tasks;

public class TaskSimple implements Task {
    private final String taskName;
    protected boolean executed;

    public TaskSimple(String taskName) {
        this.taskName = taskName;
        this.executed = false;
    }
    public String executeTask() {
        executed = true;
        return "Task executed";
    }
    public String getTaskName() {
        return taskName;
    }
    public boolean isTaskExecuted() {
        return executed;
    }
}
