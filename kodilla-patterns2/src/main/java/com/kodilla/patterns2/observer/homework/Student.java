package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements StudentObservable {
    private final List<MentorObserver> observers;
    private final List<String> tasks;
    private final String name;

    public Student(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }
    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }
    public void registerObserver(MentorObserver observer) {
        observers.add(observer);
    }
    public void notifyObservers() {
        for(MentorObserver observer: observers) {
            observer.update(this);
        }
    }
    @Override
    public void removeObserver(MentorObserver observer) {
        observers.remove(observer);
    }
    public List<String> getTasks() {
        return tasks;
    }
    public String getName() {
        return name;
    }
}
