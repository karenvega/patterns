package com.patterns.decorator;

/**
 * Created by karenvega on 15/09/16.
 */
public class StarbuzzCoffee {

    public static void main (String [] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " Cost: " + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);

        System.out.println(beverage1.getDescription() + " Cost: " + beverage1.cost());
    }
}
