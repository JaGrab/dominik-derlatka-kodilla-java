package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User caren = new ZGeneration("Caren Short");

        //When
        String stevenPost = steven.sharePost();
        System.out.println("Steven post: " + stevenPost);
        String johnPost = john.sharePost();
        System.out.println("John post: " + johnPost);
        String carenPost = caren.sharePost();
        System.out.println("Caren post: " + carenPost);

        //Then
        Assert.assertEquals("Hello Facebook", stevenPost);
        Assert.assertEquals("Hello Twitter", johnPost);
        Assert.assertEquals("Hello Snapchat", carenPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenPost = steven.sharePost();
        System.out.println("Steven post: " + stevenPost);
        steven.setPublishingEngine(new TwitterPublisher());
        stevenPost = steven.sharePost();
        System.out.println("Steven now post: " + stevenPost);

        //Then
        Assert.assertEquals("Hello Twitter", stevenPost);
    }
}
