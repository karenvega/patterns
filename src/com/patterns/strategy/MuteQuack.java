package com.patterns.strategy;

/**
 * Created by karenvega on 8/09/16.
 */
public class MuteQuack implements QuackBehaviour {

    public void quack() {
        System.out.println("<< silence >>");
    }
}
