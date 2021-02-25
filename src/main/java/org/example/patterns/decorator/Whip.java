package org.example.patterns.decorator;

public class Whip extends Condiment {
    private Beverage bev;

    public Whip(Beverage bev) {
        this.bev = bev;
    }

    @Override
    public double cost() {
        return 0.15 + bev.cost();
    }

    @Override
    public String getDescription() {
        return bev.getDescription() + ", Whip";
    }
}
