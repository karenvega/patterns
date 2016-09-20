package com.patterns.factory;

/**
 * Created by karenvega on 20/09/16.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new ChicagoStyleCheesePizza();
        }

        return null;
    }
}
