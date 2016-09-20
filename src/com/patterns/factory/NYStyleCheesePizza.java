package com.patterns.factory;

/**
 * Created by karenvega on 20/09/16.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY style sauce and cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";
        toppings.add("Grated Reggiano cheese");
    }
}
