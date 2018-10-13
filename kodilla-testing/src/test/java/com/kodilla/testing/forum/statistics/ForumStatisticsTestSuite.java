package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;
    Statistics statistics;
    ArrayList<String> userNamesList;
    ForumStatistics forumStatistics;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeGiven(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        statistics = mock(Statistics.class);
        userNamesList = new ArrayList<String>();
        forumStatistics = new ForumStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsEmpty(){
        //Given
        when(statistics.usersNames()).thenReturn(userNamesList);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(0, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(0, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(0, forumStatistics.getNumberOfComments());
        Assert.assertEquals(0, forumStatistics.getPostsPerUser(), 0.0);
        Assert.assertEquals(0, forumStatistics.getCommentsPerUser(), 0.0);
        Assert.assertEquals(0, forumStatistics.getCommentsPerPost(), 0.0);
        //forumStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsMorePosts(){
        //Given
        for(int i=0; i<100; i++){
            userNamesList.add("User " + i);
        }
        when(statistics.usersNames()).thenReturn(userNamesList);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(500);

        //When
        forumStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(500, forumStatistics.getNumberOfComments());
        Assert.assertEquals(10, forumStatistics.getPostsPerUser(), 0.0);
        Assert.assertEquals(5, forumStatistics.getCommentsPerUser(), 0.0);
        Assert.assertEquals(0.5, forumStatistics.getCommentsPerPost(), 0.0);
        //forumStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsMoreComments(){
        //Given
        for(int i=0; i<100; i++){
            userNamesList.add("User " + i);
        }
        when(statistics.usersNames()).thenReturn(userNamesList);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(2000);

        //When
        forumStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(2000, forumStatistics.getNumberOfComments());
        Assert.assertEquals(10, forumStatistics.getPostsPerUser(), 0.0);
        Assert.assertEquals(20, forumStatistics.getCommentsPerUser(), 0.0);
        Assert.assertEquals(2, forumStatistics.getCommentsPerPost(), 0.0);
        //forumStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsNoComments() {
        //Given
        for (int i = 0; i < 100; i++) {
            userNamesList.add("User " + i);
        }
        when(statistics.usersNames()).thenReturn(userNamesList);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(0, forumStatistics.getNumberOfComments());
        Assert.assertEquals(10, forumStatistics.getPostsPerUser(), 0.0);
        Assert.assertEquals(0, forumStatistics.getCommentsPerUser(), 0.0);
        Assert.assertEquals(0, forumStatistics.getCommentsPerPost(), 0.0);
        //forumStatistics.showStatistics();
    }
}