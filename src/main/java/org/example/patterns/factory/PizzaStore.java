package org.example.patterns.factory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // org.example.patterns.factory method
    protected abstract Pizza createPizza(String type);

}
