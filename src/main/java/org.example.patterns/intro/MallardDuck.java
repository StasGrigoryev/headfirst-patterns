package org.example.patterns.intro;

public class MallardDuck extends Duck{
    public MallardDuck(String name, int size) {
        this.name = name;
        this.size = size;
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void swim() {
        System.out.println("Swimming like a real Mallard duck");
    }

    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
