package com.patterns.strategy;

import com.patterns.strategy.Duck;
import com.patterns.strategy.FlyNoWay;

/**
 * Created by karenvega on 8/09/16.
 */
public class ModelDuck extends Duck {

    public ModelDuck () {
        flyBehaviour = new FlyNoWay();
//        quackBehaviour = new Quack();
    }
    @Override
    public void display() {

    }
}
