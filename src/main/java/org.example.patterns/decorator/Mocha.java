package org.example.patterns.decorator;

public class Mocha extends Condiment {
    private Beverage bev;

    public Mocha(Beverage beverage) {
        this.bev = beverage;
    }

    @Override
    public double cost() {
        return 0.2 + bev.cost();
    }

    @Override
    public String getDescription() {
        return bev.getDescription() + ", Mocha";
    }
}
