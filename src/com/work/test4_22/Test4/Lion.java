package com.work.test4_22.Test4;

public class Lion extends Animal {
    public Lion(String name, double weight, double force) {
        super(name, weight, force);
    }

    public Lion() {
    }

    @Override
    public void eat() {
        System.out.println("狮子吃肉");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name:" + getName() +
                ",weight:" + getWeight() +
                ",force:" + getForce() +
                "}";
    }
}
