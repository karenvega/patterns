package com.patterns.decorator;

/**
 * Created by karenvega on 15/09/16.
 */
public abstract class Beverage {

    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
