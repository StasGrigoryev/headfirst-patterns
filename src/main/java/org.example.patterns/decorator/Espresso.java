package org.example.patterns.decorator;

public class Espresso extends Beverage{
    @Override
    String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.2;
    }
}
