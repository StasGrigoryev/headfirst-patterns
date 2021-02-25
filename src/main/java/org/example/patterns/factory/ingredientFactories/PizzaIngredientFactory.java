package org.example.patterns.factory.ingredientFactories;

import org.example.patterns.factory.ingredients.*;

//This interface is an abstract org.example.patterns.factory that lets user to define a family of products
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
