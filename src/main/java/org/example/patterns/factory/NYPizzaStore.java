package org.example.patterns.factory;

import org.example.patterns.factory.ingredientFactories.NYPizzaIngredientFactory;
import org.example.patterns.factory.ingredientFactories.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    //org.example.patterns.factory method implementation
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
