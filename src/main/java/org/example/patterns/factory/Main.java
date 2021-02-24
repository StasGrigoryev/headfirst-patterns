package org.example.patterns.factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        System.out.println(nyPizzaStore.orderPizza("veggie"));

        PizzaStore chPizzaStore = new ChicagoPizzaStore();
        System.out.println(chPizzaStore.orderPizza("cheese"));
    }
}
