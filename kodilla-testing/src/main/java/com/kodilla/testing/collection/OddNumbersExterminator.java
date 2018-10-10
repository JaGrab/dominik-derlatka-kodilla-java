package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> evens = new ArrayList<Integer>();
        for(Integer element: numbers){
            if((element % 2) == 0){
                evens.add(element);
            }
        }
        return evens;
    }
}
