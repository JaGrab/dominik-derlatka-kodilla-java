package com.kodilla.good.patterns.challenges;

public class OrdinaryUser implements User {
    private String username;
    private String email;

    public OrdinaryUser(String username, String email) {
        this.username = username;
        this.email = email;
    }
    @Override
    public String getUsername() {
        return username;
    }
    @Override
    public String getEmail() {
        return email;
    }
}
