package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "dylanm", 'M', 1973, 6, 14, 0));
        theUserList.add(new ForumUser(2, "phoebep", 'F', 1982, 5, 13, 5));
        theUserList.add(new ForumUser(3, "morganw", 'M', 1971, 4, 17, 13));
        theUserList.add(new ForumUser(4, "aimeem", 'F', 1985, 8, 26, 7));
        theUserList.add(new ForumUser(5, "ryant", 'M', 2000, 10, 23, 11));
        theUserList.add(new ForumUser(6, "madelynnc", 'F', 1977, 10, 28, 3));
        theUserList.add(new ForumUser(6, "giancarlog", 'M', 1979, 12, 30, 17));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }
}
