package com.kodilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public class BookDirectory {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public BookDirectory() {
        theForumUserList.add(new ForumUser("Dylan Murphy", "Wolf of the mountain",
                2003, "0001"));
        theForumUserList.add(new ForumUser("Phoebe Pearson", "Slaves of dreams",
                2012, "0002"));
        theForumUserList.add(new ForumUser("Morgan Walsh", "Obliteration of heaven",
                2001, "0003"));
        theForumUserList.add(new ForumUser("Aimee Murphy", "Rejecting the night",
                2015, "0004"));
        theForumUserList.add(new ForumUser("Ryan Talley", "Gangsters and kings",
                2007, "0005"));
        theForumUserList.add(new ForumUser("Madelynn Carson", "Unity without duty",
                2007, "0006"));
        theForumUserList.add(new ForumUser("Giancarlo Guerrero", "Enemies of eternity",
                2009, "0007"));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }
}
