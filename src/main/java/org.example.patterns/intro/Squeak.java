package org.example.patterns.intro;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
