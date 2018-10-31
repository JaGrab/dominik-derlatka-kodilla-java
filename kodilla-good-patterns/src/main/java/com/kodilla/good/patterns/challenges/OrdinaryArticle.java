package com.kodilla.good.patterns.challenges;

import java.util.List;

public class OrdinaryArticle implements Article {
    private String name;
    private List<String> units;

    public OrdinaryArticle(String name, List<String> units) {
        this.name = name;
        this.units = units;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public List<String> getUnits() {
        return units;
    }
}
