package org.example.patterns.factory;

import org.example.patterns.factory.ingredients.*;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake(){
        System.out.println("Baking it");
    }

    void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    void box() {
        System.out.println("Placing pizza into official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String veggs = "";
        if (veggies != null) {
            StringBuilder vegs = new StringBuilder();
            for (Veggies v : veggies) {
                vegs.append("\t").append(v).append(",\n");
            }
            veggs = vegs.toString().trim();
            veggs = veggs.substring(0,veggs.length()-1);
        }
        return String.format("Name: %s,\nDough: %s,\nSauce: %s,\n" +
                "Veggies:\n\t%s\nCheese: %s\nPepperoni: %s\nClams: %s",
                name, dough, sauce, veggs, cheese, pepperoni, clams);
    }
}
