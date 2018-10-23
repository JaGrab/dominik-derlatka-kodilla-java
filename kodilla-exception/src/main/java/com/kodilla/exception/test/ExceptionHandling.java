package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void  main (String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(2.0, 3.0));
        } catch (Exception e) {
            System.out.println("I caught an exception... probably: " + e);
        } finally {
            System.out.println("The exception hunting is over");
        }
    }
}
