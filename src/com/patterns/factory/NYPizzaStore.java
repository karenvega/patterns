package com.patterns.factory;

/**
 * Created by karenvega on 20/09/16.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new NYStyleCheesePizza();
        }

        return null;
    }
}
