package org.example.patterns.strategy;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Qua-qua-qua");
    }
}
