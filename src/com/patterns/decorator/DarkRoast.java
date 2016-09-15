package com.patterns.decorator;

/**
 * Created by karenvega on 15/09/16.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
