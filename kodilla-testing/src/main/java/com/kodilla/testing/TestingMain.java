package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Testing SimpleUser constructor");
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if(result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Testing Calculator class:");
        Calculator calculator = new Calculator();
        if(calculator.add(-3, 2) == -1){
            System.out.println("Method add OK");
        } else {
            System.out.println("Method add error");
        }
        if(calculator.subtract(-5, -7) == 2) {
            System.out.println("Method subtract OK");
        } else {
            System.out.println("Method subtract error");
        }
    }
}
