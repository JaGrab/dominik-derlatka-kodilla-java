package com.kodilla.patterns2.observer.homework;

public interface StudentObservable {
    void registerObserver(MentorObserver observer);
    void notifyObservers();
    void removeObserver(MentorObserver observer);
}
