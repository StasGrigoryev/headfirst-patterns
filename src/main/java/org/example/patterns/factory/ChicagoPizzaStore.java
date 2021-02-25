package org.example.patterns.factory;

import org.example.patterns.factory.ingredientFactories.ChicagoPizzaIngredientFactory;
import org.example.patterns.factory.ingredientFactories.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

    //org.example.patterns.factory method implementation
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(new ChicagoPizzaIngredientFactory());
            pizza.setName("A Lovely Cheese Pizza Just For Me");
        }   else if (type.equals("veggie")) {
            pizza = new VeggiePizza(new ChicagoPizzaIngredientFactory());
            pizza.setName("Chicago Veggie Pizza");
        }
        return pizza;
    }
}
