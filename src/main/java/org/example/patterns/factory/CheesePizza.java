package org.example.patterns.factory;

import org.example.patterns.factory.factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory pif) {
        ingredientFactory = pif;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
