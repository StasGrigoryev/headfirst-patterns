package org.example.patterns.intro;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Qua-qua-qua");
    }
}
