package com.patterns.strategy;

import com.patterns.strategy.Quack;
import com.patterns.strategy.Duck;
import com.patterns.strategy.FlyWithWings;

/**
 * Created by karenvega on 8/09/16.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {

    }
}
