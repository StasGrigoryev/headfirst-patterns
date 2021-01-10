package org.example.patterns;

import org.example.patterns.intro.MallardDuck;

public class testPattern {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck("Donald", 10);
        mallard.swim();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
    }
}
