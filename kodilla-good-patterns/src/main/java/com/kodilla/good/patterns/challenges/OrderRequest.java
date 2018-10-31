package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private User user;
    private Article article;
    private Quantity quantity;

    public OrderRequest(User user, Article article, Quantity quantity) {
        this.user = user;
        this.article = article;
        this.quantity = quantity;
    }
    public User getUser() {
        return user;
    }
    public Article getArticle() {
        return article;
    }
    public Quantity getQuantity() {
        return quantity;
    }
}
