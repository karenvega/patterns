package com.patterns.strategy;

import com.patterns.strategy.QuackBehaviour;

/**
 * Created by karenvega on 8/09/16.
 */
public class Quack implements QuackBehaviour {

    public void quack() {
        System.out.println("Quack");
    }
}
