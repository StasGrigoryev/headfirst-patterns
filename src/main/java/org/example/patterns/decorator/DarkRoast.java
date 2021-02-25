package org.example.patterns.decorator;

public class DarkRoast extends Beverage{
    @Override
    String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
