package org.example.patterns.intro;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("*Some duck is quacking nearby, but not this one.*");
    }
}
