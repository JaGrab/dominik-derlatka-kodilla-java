package com.kodilla.good.patterns.challenges;

public class InformationServiceEmail implements InformationService {
    public void inform(User user) {
        System.out.println("Email for " + user.getUsername() + " " + "was sent to: " + user.getEmail());
    }
}
