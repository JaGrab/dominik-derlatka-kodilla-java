package com.kodilla.stream.book;

public final class ForumUser {
    private final String author;
    private final String title;
    private final int yearOfPublication;
    private final String signature;

    public ForumUser(final String author, final String title,
                     final int yearOfPublication, final String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public String getSignature() {
        return signature;
    }
    @Override
    public String toString() {
        return "ForumUser{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", signature='" + signature + '\'' +
                '}';
    }
}
