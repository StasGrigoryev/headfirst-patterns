package org.example.patterns.strategy;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("*Some duck is quacking nearby, but not this one.*");
    }
}
