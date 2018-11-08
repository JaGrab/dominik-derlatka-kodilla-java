package com.kodilla.spring.portfolio;

public final class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
    public TaskList getTaskList(int taskList) {
        TaskList theList;
        if(taskList == 0) {
            theList = toDoList;
        } else if(taskList == 1) {
            theList = inProgressList;
        } else {
            theList = doneList;
        }
        return theList;
    }
    public void addTaskToList(int taskList, String task) {
        getTaskList(taskList).addTask(task);
    }
    public String getTaskFromList(int taskList, int taskIndex) {
        return getTaskList(taskList).getTask(taskIndex);
    }
}
