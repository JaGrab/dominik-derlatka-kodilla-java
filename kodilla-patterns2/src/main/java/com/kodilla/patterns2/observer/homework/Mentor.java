package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorObserver {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }
    @Override
    public void update(Student student) {
        System.out.println(mentorName + ": New task from " + student.getName() + "\n" +
                " (total: " + student.getTasks().size() + " tasks)");
        updateCount++;
    }
    public String getMentorName() {
        return mentorName;
    }
    public int getUpdateCount() {
        return updateCount;
    }
}
