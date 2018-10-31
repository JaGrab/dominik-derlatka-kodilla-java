package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String moviesDelimited = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue())
                .flatMap(l -> l.stream())
                .collect(Collectors.joining("!"));
        System.out.println("Movies delimited with exclamation mark:\n" + moviesDelimited);
    }
}
