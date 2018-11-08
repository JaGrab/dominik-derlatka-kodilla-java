package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("list1")
    private TaskList toDoList;
    @Autowired
    @Qualifier("list2")
    private TaskList inProgressList;
    @Autowired
    @Qualifier("list3")
    private TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }
    @Bean(name = "list1")
    public TaskList getToDoList() {
        return new TaskList();
    }
    @Bean(name = "list2")
    public TaskList getInProgressList() {
        return new TaskList();
    }
    @Bean(name = "list3")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
