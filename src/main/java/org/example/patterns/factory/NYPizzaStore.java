package org.example.patterns.factory;

import org.example.patterns.factory.factories.NYPizzaIngredientFactory;
import org.example.patterns.factory.factories.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NYC Style Cheese Pizza");
        }   else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NYC Style Veggie Pizza");
        }
        return pizza;
    }
}
