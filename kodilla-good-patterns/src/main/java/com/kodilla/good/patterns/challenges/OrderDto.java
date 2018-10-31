package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private User user;
    private Boolean isOrdered;

    public OrderDto(User user, Boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }
    public User getUser() {
        return user;
    }
    public Boolean getOrdered() {
        return isOrdered;
    }
}
