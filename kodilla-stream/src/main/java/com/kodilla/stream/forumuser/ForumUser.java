package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final private int id;
    final private String username;
    final private char sex;
    final private LocalDate dateOfBirth;
    final private int numberOfPosts;

    public ForumUser(final int id, final String username, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int numberOfPosts) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }
    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public char getSex() {
        return sex;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public int getNumberOfPosts() {
        return numberOfPosts;
    }
    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
