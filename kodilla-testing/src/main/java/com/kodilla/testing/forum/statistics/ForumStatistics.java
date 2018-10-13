package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers = 0;
    private int numberOfPosts = 0;
    private int numberOfComments = 0;
    private double postsPerUser = 0.0;
    private double commentsPerUser = 0.0;
    private double commentsPerPost = 0.0;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfPosts > 0 && numberOfUsers > 0){
            postsPerUser = (double) numberOfPosts / numberOfUsers;
        }
        if(numberOfComments > 0 && numberOfUsers > 0){
            commentsPerUser = (double) numberOfComments / numberOfUsers;
        }
        if(numberOfComments > 0 && numberOfPosts > 0){
            commentsPerPost = (double) numberOfComments / numberOfPosts;
        }
    }
    public void showStatistics() {
        System.out.println("Forum statistics:");
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Posts per user: " + postsPerUser);
        System.out.println("Comments per user: " + commentsPerUser);
        System.out.println("Comments per post: " + commentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
