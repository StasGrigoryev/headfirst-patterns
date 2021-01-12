package org.example.patterns.strategy;

import org.example.patterns.strategy.MallardDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck("Donald", 10);
        mallard.swim();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
    }
}
