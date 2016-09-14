package com.patterns.strategy;

import com.patterns.strategy.FlyBehaviour;

/**
 * Created by karenvega on 8/09/16.
 */
public class FlyRocketPowered implements FlyBehaviour {

    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
