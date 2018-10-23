package com.kodilla.exception.index;

import java.util.List;

public class IndexExceptionRunner {
    public static void main(String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> collecton = videoCollector.getCollection();
        if(collecton.size() > 2) {
            String movie = collecton.get(0);
            System.out.println(movie);
            String anotherMovie = collecton.get(2);
            System.out.println(anotherMovie);
        }
    }
}
