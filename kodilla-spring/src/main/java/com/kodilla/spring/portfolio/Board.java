package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;

public final class Board {
    @Autowired
    private TaskList toDoList;
    @Autowired
    private TaskList inProgressList;
    @Autowired
    private TaskList doneList;

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
